package src;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class q001Test {
    @Test
    void testQ001(){
        assertEquals(new q001().solve(),"233168");
    }
    //void testQ002(){assertEquals(new q002().solve(),"4613732");    }
}