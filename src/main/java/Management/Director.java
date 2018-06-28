package Management;

import Staff.Employee;

public class Director extends Employee {
    
    private double budget;
    
   public Director(String name, String nin, double salary, double budget){
       super(name, nin, salary);
       this.budget = budget;
   }


    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
       double salary = this.getSalary();
        return salary * 0.02;
    }
}
