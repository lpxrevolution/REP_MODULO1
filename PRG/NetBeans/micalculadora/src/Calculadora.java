class Calculadora {
    
    private int num1, num2, num3;
    int resultado;
    public Calculadora(int a, int b, int c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
    }
    public int multiplicacion()
    {
        resultado = num1*num2*num3;
        return resultado;
    }
    public int suma()
    {
        resultado = num1*num2*num3;
        return resultado;
    }
    public int media()
    {
        resultado = (num1*num2*num3)/3;
        return resultado;
    }
    public int mayordtres()
    {
        if (num1>num2)
            if(num1>num3)
                resultado = num1;
            else
                resultado = num3;
        else if (num2 > num3)
           if(num2>num3)
               resultado = num2;
           else
               resultado = num3;
        return resultado;
    }
    
}
