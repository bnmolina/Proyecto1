package calculadora;
import javax.swing.JOptionPane;
        
public class Suma {
    static int suma,n1,n2;
    public static void suma(){
        n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
        
        suma=n1+n2;
        JOptionPane.showMessageDialog(null, suma);
    }  
} 