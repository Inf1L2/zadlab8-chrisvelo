/**
 *
 * @author krzysiek
 */
public class Rownoleglobok extends FiguraPlaska {
    public double a;
    public double b;
    
    public double h;
    
    
     public Rownoleglobok(double a,double b,double h){
        this.a=a;
        this.b=b;
        
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


    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
   
    
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObwod(){
        return 2*a + 2*b ;
    }
    
    @Override
    public double obliczPole(){
        return a *h;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Rownoleglobok o boku a= "+a+" wysokosci="+h+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); 
    }
    
}
