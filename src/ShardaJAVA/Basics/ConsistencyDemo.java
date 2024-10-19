package ShardaJAVA.Basics;

import java.sql.*;

public class ConsistencyDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/your_db";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Simulating different cases
            updateAddress(connection, 1, "New Address"); // Case a: Address updated resulting in consistency
            updateAddress(connection, 1, null);         // Case b: Address update failure, results in inconsistency

            purchaseProduct(connection, 1, 5); // Case c: Product can be purchased (quantity enough)
            purchaseProduct(connection, 2, 0); // Case d: Product cannot be purchased (quantity zero)
            purchaseProduct(connection, 3, 7); // Case e: Product cannot be purchased (requested quantity exceeds)

            purchaseProduct(connection, 999, 1); // Case f: Invalid product_id referenced, referential integrity violation

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Case a: Address changes are updated in the database resulting in consistency
    private static void updateAddress(Connection connection, int customerId, String newAddress) {
        if (newAddress == null || newAddress.isEmpty()) {
            System.out.println("Address update failed, resulting in inconsistency.");
            return; // Case b: Address update failed, resulting in inconsistency
        }
        String updateAddressQuery = "UPDATE Customers SET address = ? WHERE customer_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(updateAddressQuery)) {
            ps.setString(1, newAddress);
            ps.setInt(2, customerId);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Address updated successfully, resulting in consistency.");
            } else {
                System.out.println("Address update failed, resulting in inconsistency.");
            }
        } catch (SQLException e) {
            System.out.println("Error while updating address: " + e.getMessage());
        }
    }

    // Purchase Product - This handles cases c, d, e, f
    private static void purchaseProduct(Connection connection, int productId, int requestedQuantity) {
        String checkProductQuery = "SELECT quantity FROM Products WHERE product_id = ?";
        String updateQuantityQuery = "UPDATE Products SET quantity = quantity - ? WHERE product_id = ?";

        try (PreparedStatement psCheck = connection.prepareStatement(checkProductQuery)) {
            psCheck.setInt(1, productId);
            ResultSet rs = psCheck.executeQuery();

            if (!rs.next()) {
                System.out.println("Product with ID " + productId + " not found. Referential integrity violation."); // Case f
                return;
            }

            int currentQuantity = rs.getInt("quantity");

            if (currentQuantity == 0) {
                System.out.println("Product cannot be purchased. The product quantity is zero."); // Case d
            } else if (currentQuantity < requestedQuantity) {
                System.out.println("Product cannot be purchased. The requested quantity exceeds the available quantity."); // Case e
            } else {
                // Update the quantity
                try (PreparedStatement psUpdate = connection.prepareStatement(updateQuantityQuery)) {
                    psUpdate.setInt(1, requestedQuantity);
                    psUpdate.setInt(2, productId);
                    psUpdate.executeUpdate();
                    System.out.println("Product purchased successfully. Quantity updated in database."); // Case c
                }
            }
        } catch (SQLException e) {
            System.out.println("Error while purchasing product: " + e.getMessage());
        }
    }
}
