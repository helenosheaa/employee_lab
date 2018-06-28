import Staff.Employee;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Helen", "SRS3265", 60000.00, "Apple");
    }

    @Test
    public void canGetName(){
        assertEquals("Helen", manager.getName());
    }

    @Test
    public void canGetNin(){
        assertEquals("SRS3265", manager.getNin());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Apple", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(600.00);
        assertEquals(60600.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00, manager.payBonus(), 0.01);
    }

}
