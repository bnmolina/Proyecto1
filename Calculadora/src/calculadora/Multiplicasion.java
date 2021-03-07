package calculadora;
import javax.swing.JOptionPane;
public class Multiplicasion {
 static int mult,n1,n2;
public static void Multiplicasion (){
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    
    mult=n1*n2;
    JOptionPane.showMessageDialog(null, mult);
}   
}
