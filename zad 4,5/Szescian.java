


/**
 *
 * @author krzysiek
 */
public class Szescian extends FiguraPrzestrzenna {
    public double a;
    
    public Szescian(double a){
        this.a=a;
    }
    
    public double getA(){
    return a;
}

    public void setA(double a) {
        this.a = a;
    }
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObjetosc(){
        return a*a*a;
    }
    
    @Override
    public double obliczPole(){
        return a*a*6;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Szescian o boku: "+a+" z polem: "+obliczPole()+" o objetosci: "+obliczObjetosc();
    }
    
    
}
