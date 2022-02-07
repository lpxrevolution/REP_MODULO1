import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class CalculadoraTest 
{
    Calculadora instance = new Calculadora(1,2,3);
    
    public CalculadoraTest() 
    {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testMultiplicacion() 
    {
        System.out.println("Multiplicacion");
        int expResult = 6;
        int result = instance.Multiplicacion();
        assertEquals(expResult, result);
    }
    @Test
    public void testSuma() {
        System.out.println("Suma");
        int expResult = 6;
        int result = instance.Suma();
        assertEquals(expResult, result);
    }
    @Test
    public void testMedia() {
        System.out.println("Media");
        float expResult = 2.0F;
        float result = instance.Media();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMayorDTres() {
        System.out.println("MayorDTres");
        int expResult = 3;
        int result = instance.MayorDTres();
        assertEquals(expResult, result);
    } 
}