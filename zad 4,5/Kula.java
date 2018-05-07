
/**
 *
 * @author krzysiek
 */
public class Kula extends FiguraPrzestrzenna {
    public double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObjetosc(){
        return 1.25 * Math.PI * r*r*r;
    }
    
    @Override
    public double obliczPole(){
        return 4*Math.PI*r*r;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Kula o promieniu: "+r+" z polem: "+obliczPole()+" o objetosci: "+obliczObjetosc();
    }
    
    
}

