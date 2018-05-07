
/**
 *
 * @author krzysiek
 */
public class Walec extends FiguraPrzestrzenna {
    public double r;
    public double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

   
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObjetosc(){
        return  Math.PI *r*r*h;
    }
    
    @Override
    public double obliczPole(){
        return 2*Math.PI*r*r + 2*Math.PI*r*h;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Walec o promieniu: "+r+" z polem: "+obliczPole()+" o objetosci: "+obliczObjetosc();
    }
    
    
}

