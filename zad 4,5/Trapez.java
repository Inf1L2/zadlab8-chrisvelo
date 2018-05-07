/**
 *
 * @author krzysiek
 */
public class Trapez extends FiguraPlaska {
    public double a;
    public double b;
    public double c;
    public double d;
    public double h;
    
    
     public Trapez(double a,double b,double c,double d,double h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.h=h;
    }

    public double getA() {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
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
        return a + b + c + d;
    }
    
    @Override
    public double obliczPole(){
        return ((a+b)/2) *h;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Trapez o boku a= "+a+" wysokosci="+h+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); 
    }
    
}

