package Staff;

public abstract class Employee {

    private String name;
    private String nin;
    private int salary;

    public Employee(String name, String nin, int salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }


    public abstract String getName(String name);


    public abstract String getNin(String nin);


    public abstract String getSalary(int salary);

}
