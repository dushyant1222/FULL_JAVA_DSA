package ShardaJAVA.Assignment;

public class A {
    String model;
    int year;
    public A(String model, int year){
        this.model = model;
        this.year = year;
    }
    public void displayInfo(String owner) {
        System.out.println("Owner: " + owner);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }

}
