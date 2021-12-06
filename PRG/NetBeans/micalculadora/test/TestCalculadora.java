import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadora {
    
    public TestCalculadora() 
    {
    }
    void TestMultiplicacion()
    {
        Calculadora calc = new Calculadora(1,2,3);
        int resultado = calc.multiplicacion();
        assertEquals(6,resultado);
    }
    void TestSuma()
    {
        
    }
    void TestMedia()
    {
        
    }
    void TestMayorDTres()
    {
        
    }
}
