package Staff;

public abstract class Employee {

    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }


    public abstract String getName(String name);


    public abstract String getNin(String nin);


    public double raiseSalary(double increment){
        return this.salary + increment;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}
