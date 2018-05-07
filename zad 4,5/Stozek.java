/**
 *
 * @author krzysiek
 */
public class Stozek extends FiguraPrzestrzenna {
    public double r;
    public double l;
public double h;

    public Stozek(double r, double l, double h) {
        this.r = r;
        this.l = l;
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

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObjetosc(){
        return  1/3 * Math.PI *r *r*h;
    }
    
    @Override
    public double obliczPole(){
        return Math.PI*r*r + Math.PI*r*l;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Stozek o promieniu: "+r+" z polem: "+obliczPole()+" o objetosci: "+obliczObjetosc();
    }
    
    
}


