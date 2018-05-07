

/**
 *
 * @author krzysiek
 */
public class Trojkat extends FiguraPlaska {
    public double a;
    public double h;
    
     public Trojkat(double a,double h){
        this.a=a;
        this.h=h;
    }
    
    public double getA(){
    return a;
}

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObwod(){
        return 3*a;
    }
    
    @Override
    public double obliczPole(){
        return 0.5*a*h;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Trojkatkat o boku a= "+a+" wysokosci="+h+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); 
    //System.out.println("Trojkatkat o boku a= "+a+" wysokosci="+h+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod());
    }
    
}

