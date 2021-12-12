package src;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class EulerTest {
    @Test void testQ001(){
        assertEquals(new q001().solve(),"233168");
    }
    @Test void testQ002(){
        assertEquals(new q002().solve(),"4613732");
    }
    @Test void testQ003(){
        assertEquals(new q003().solve(),"6857");
    }
    @Test void testQ004(){
        assertEquals(new q004().solve(),"906609");
    }
    @Test void testQ006(){
        assertEquals(new q006().solve(),"25164150");
    }
    @Test void testQ007(){
        assertEquals(new q007().solve(),"104743");
    }
    @Test void testQ008(){
        assertEquals(new q008().solve(),"40824");
    }
    @Test void testQ009(){
        assertEquals(new q009().solve(),"31875000");
    }
    @Test void testQ010(){
        assertEquals(new q010().solve(),"142913828922");
    }
    @Test void testQ011(){
        assertEquals(new q011().solve(),"70600674");
    }
    @Test void testQ012(){
        assertEquals(new q012().solve(),"76576500");
    }
    @Test void testQ013(){
        assertEquals(new q013().solve(),"5537376230");
    }
    @Test void testQ014(){
        assertEquals(new q014().solve(),"837799");
    }
}