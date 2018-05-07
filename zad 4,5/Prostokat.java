

/**
 *
 * @author krzysiek
 */
public class Prostokat extends FiguraPlaska {
    public double a;
    public double b;
    
     public Prostokat(double a,double b){
        this.a=a;
        this.b=b;
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
    
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObwod(){
        return (2*b)+(2*a);
    }
    
    @Override
    public double obliczPole(){
        return a*b;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Prostokat o bokach a= "+a+" b="+b+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); 
    }
    
}
