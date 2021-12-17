public class Calculadora {
    private int num1,num2,num3;
    
    public Calculadora(int a, int b, int c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
    }
    public int Multiplicacion()
    {
        int resultado = num1*num2*num3;
        return resultado;
    }
    public int Suma ()
    {
        int resultado = num1+num2+num3;
        return resultado;
    }
    public float Media()
    {
        float resultado = Multiplicacion()/3;
        return resultado;
    }
    public int MayorDTres()
    {
        if (num1>num2)
        {
            if (num1>num3)
                return num1;
        }
        else if (num2>num3)
            return num2;
        else
            return num3;
        return 0;
    }
}