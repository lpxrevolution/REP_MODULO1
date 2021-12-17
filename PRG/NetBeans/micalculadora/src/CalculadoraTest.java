import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rbnre
 */
public class CalculadoraTest 
{
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        Calculadora instance = new Calculadora(1,2,3);
        int expResult = 6;
        int result = instance.multiplicacion();
        System.out.println(result+"/n"+expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testMedia() {
        System.out.println("media");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.media();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testMayordtres() {
        System.out.println("mayordtres");
        Calculadora instance = null;
        int expResult = 0;
        int result = instance.mayordtres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
}
