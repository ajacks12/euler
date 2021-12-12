package src;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class EulerTest {
    @Test    void testQ001(){
        assertEquals(new q001().solve(),"233168");
    }
    @Test    void testQ002(){
        assertEquals(new q002().solve(),"4613732");
    }
    @Test    void testQ003(){
        assertEquals(new q003().solve(),"6857");
    }
    @Test    void testQ004(){
        assertEquals(new q004().solve(),"906609");
    }
    @Test    void testQ006(){
        assertEquals(new q006().solve(),"25164150");
    }
    @Test    void testQ007(){
        assertEquals(new q007().solve(),"104743");
    }
}