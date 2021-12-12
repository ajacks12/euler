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
    @Test void testQ015(){
        assertEquals(new q015().solve(),"137846528820");
    }
    @Test void testQ016(){
        assertEquals(new q016().solve(),"1366");
    }
    @Test void testQ017(){
        assertEquals(new q017().solve(),"21124");
    }
    @Test void testQ017a(){
        assertEquals(q017.NumberToString(1),"ONE");
    }
    @Test void testQ017b(){
        assertEquals(q017.NumberToString(2),"TWO");
    }
    @Test void testQ017c(){
        assertEquals(q017.NumberToString(3),"THREE");
    }
    @Test void testQ017d(){
        assertEquals(q017.NumberToString(11),"ELEVEN");
    }
    @Test void testQ017e(){
        assertEquals(q017.NumberToString(21),"TWENTY ONE");
    }
    @Test void testQ017f(){
        assertEquals(q017.NumberToString(99),"NINETY NINE");
    }
    @Test void testQ017g(){
        assertEquals(q017.NumberToString(100),"ONE HUNDRED");
    }
    @Test void testQ017h(){
        assertEquals(q017.NumberToString(101),"ONE HUNDRED AND ONE");
    }
    @Test void testQ017i(){
        assertEquals(q017.NumberToString(111),"ONE HUNDRED AND ELEVEN");
    }
    @Test void testQ017l(){
        assertEquals(q017.NumberToString(120),"ONE HUNDRED AND TWENTY");
    }
    @Test void testQ017m(){
        assertEquals(q017.NumberToString(130),"ONE HUNDRED AND THIRTY");
    }
    @Test void testQ017j(){
        assertEquals(q017.NumberToString(599),"FIVE HUNDRED AND NINETY NINE");
    }
    @Test void testQ017k(){
        assertEquals(q017.NumberToString(1000),"ONE THOUSAND");
    }
}