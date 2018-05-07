
/**
 *
 * @author krzysiek
 */
public class Prostopaloscian extends FiguraPrzestrzenna {
    public double a;
    public double b;
    public double h;
    
    public Prostopaloscian(double a,double b,double h){
        this.a=a;
        this.b=b;
        this.h=h;
    }
    
    public double getA(){
    return a;
}

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
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
        return a*b*h;
    }
    
    @Override
    public double obliczPole(){
        return (2*a*b) + (2*b*h) + (2*a*h);
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Prostopaloscian o boku: "+a+" z polem: "+obliczPole()+" o objetosci: "+obliczObjetosc();
    }
    
    
}
