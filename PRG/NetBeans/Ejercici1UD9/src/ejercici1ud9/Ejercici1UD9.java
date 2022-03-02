package ejercici1ud9;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author rbnre
 */
public class Ejercici1UD9 
{
    public static void main(String[] args) 
    {
        ArrayList llistaProductes = new ArrayList ();
        
        producte p1= new producte("Coca-cola", 2);
        producte p2= new producte("Fanta Taronja",5);
        producte p3= new producte("Aquarius Original",1);
        producte p4= new producte("Cerveza 33cl",15);
        producte p5= new producte("Cerveza 1l",7);
        
        
        llistaProductes.add(p1);
        llistaProductes.add(p2);
        llistaProductes.add(p3);
        llistaProductes.add(p4);
        llistaProductes.add(p5);
       
        visualitzaLlista(llistaProductes);
        
        llistaProductes.remove(p3);
        llistaProductes.remove(p1);
        
        llistaProductes.add(3, new producte("Batut",1));
        visualitzaLlista(llistaProductes);
        
        llistaProductes.clear();
        visualitzaLlista(llistaProductes);
    }
    public static void visualitzaLlista(ArrayList l)
    {
        for (Iterator i = l.iterator(); i.hasNext();)
        {
            producte p = (producte)i.next();
            System.out.println(p.getnom());
        }
    }
    
}
