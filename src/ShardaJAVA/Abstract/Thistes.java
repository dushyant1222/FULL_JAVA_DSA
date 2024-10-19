package ShardaJAVA.Abstract;

public class Thistes {
    private int id;
    private String name;
    private float salary;

//    public void setId(int id) {
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setSalary(float salary) {
//        this.salary = salary;
//    }

    public Thistes(int id, String name, Float salary){
        
    }

    @Override
    public String toString() {
        return "Thistes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
