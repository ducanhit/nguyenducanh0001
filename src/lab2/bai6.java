package lab2;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class bai6 {
    public static void main(String[] args){
    int n;
    try{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen:",""));
    }
    catch(java.lang.NumberFormatException el){
    System.out.println(el.toString());
            }
    finally{
        System.out.println("Have good fun");
    }
    }
}