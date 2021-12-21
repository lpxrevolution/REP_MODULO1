/**
 * 
 * Clase Empleado Contiene informacion de cada empleado
 * 
 * @author Rubén López Pastor, rbnrevolution@gmail.com
 * @version 9.8
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
  /**
   * Suma un plus de XX euros al salario del empleado si el empleado tiene mas de ZZ años
omite esta línea (sustituye la XX por tu año de nacimiento y la ZZ por tu edad )
omite esta línea (Si naciste en el 80 y tu edad es de 40 años sería:...)
   * @param sueldoPlus
   * @return 
   */
  public boolean plus (double sueldoPlus)
  {
    boolean aumento=false;
    if (edad>40 && compruebaNombre())
    {
        salario+=sueldoPlus;
        aumento=true;
    }
    return aumento;
  }
  
  //Metodos privados
  private boolean compruebaNombre()
  {
    if(nombre.equals("")){
        return false;
    }
    return true;
  }
 
    /**
    * 
    * Constructor por Defecto
    */
  public Empleado()
  {
    this ("", "", 0, 0);
  }
  /**
   * Constructor con 4 parametros
   * @param nombre
   * @param apellido
   * @param edad
   * @param salario 
   */
  public Empleado(String nombre, String apellido, int edad, double salario)
  {
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.salario=salario;
  }
   
}