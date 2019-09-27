
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author CRM
 */
public class principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Cercle monCercle = new Cercle(0,0,0);
//        System.out.println(rayon);
       
       monCercle.setRayon(0);
        
       String saisieUtilisateur = JOptionPane.showInputDialog(null,"Quel est la valeur du rayon?","Nouveau cercle",JOptionPane.QUESTION_MESSAGE);
        
       float saisieConvertie = Float.parseFloat(saisieUtilisateur); 
       
       monCercle.setRayon(saisieConvertie);
       
       System.out.println(monCercle);
       
       
       
        
    }
    
}