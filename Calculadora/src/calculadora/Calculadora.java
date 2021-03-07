package calculadora;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
     Suma s=new Suma();
     Resta r=new Resta();
     Division d=new Division();
     Multiplicasion m=new Multiplicasion();
        int x;
        
     do{
         x=Integer.parseInt(JOptionPane.showInputDialog(null, "\nMenu"
                 + "\n1. Suma"
                 + "\n2. Resta"
                 + "\n3. Multiplicasion"
                 + "\n4. Division"
                 + "\n0. Salir"
                 + "\nDigite una opcion: "));
         
         switch (x) {
                case 1:
                    s.suma();
                    break;
                    
                case 2:
                    r.Resta();
                    break;
                
                case 3:
                    m.Multiplicasion();
                    break;
                 
                case 4:
                    d.Division();
                    break;    
            }
     }while(x!=0);
     JOptionPane.showMessageDialog(null, "¡BYE!");
    }
    
}