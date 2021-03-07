package calculadora;
import javax.swing.JOptionPane;
public class Resta {
static int resta,n1,n2;
public static void Resta (){
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    
    resta=n1-n2;
    JOptionPane.showMessageDialog(null, resta);
}
}
