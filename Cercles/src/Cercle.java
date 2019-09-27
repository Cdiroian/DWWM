import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author CRM
 */
public class Cercle {

    @Override
    public String toString() {
        return "Le rayon = " + rayon + ", sa surface= " + this.formaterNombre(Math.PI*rayon*rayon) + 
                " et sa circonference= " + this.formaterNombre(Math.PI*2*rayon);
    }
    private float rayon ;
    private float surface ;
    private float circonference ;

    public Cercle(float rayon, float surface, float circonference) {
        this.rayon = rayon;
        this.surface = surface;
        this.circonference = circonference;
    }
    
    /**
     * Cette fonction formate un nombre en, text, et réduisant
     * son résultat de retour avec moin de décimal.
     * @param nombre
     * @return 
     */
    public double formaterNombre(double nombre)
    {
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        formatSymbols.setDecimalSeparator('.');
       
        DecimalFormat df = new DecimalFormat("####,#####.####", formatSymbols);
       // Cette ligne défini le nombre de décimales pour le résultat
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        
        return Double.parseDouble(df.format(nombre));
    }
    
    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public float getCirconference() {
        return circonference;
    }

    public void setCirconference(float circonference) {
        this.circonference = circonference;
    }
 
    
                
}