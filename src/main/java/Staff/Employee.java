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


    public String getName(){
        return this.name;
    }


    public String getNin(){
        return this.nin;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double increment){
        this.salary = this.salary + increment;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}
