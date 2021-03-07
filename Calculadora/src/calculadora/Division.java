package calculadora;
import javax.swing.JOptionPane;
public class Division {
static int div,n1,n2;
public static void Division (){
    n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    
    div=n1/n2;
    if(n2==0){
        JOptionPane.showMessageDialog(null, "No se puede dividir entre cero(0)");
    }else
    JOptionPane.showMessageDialog(null, div);
}    
}