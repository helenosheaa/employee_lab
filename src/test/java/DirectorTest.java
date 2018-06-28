import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tony", "SR5523", 100000.00, 100000.00);
    }

    @Test
    public void canHaveBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(2000.00, director.payBonus(), 0.01);
    }

}
