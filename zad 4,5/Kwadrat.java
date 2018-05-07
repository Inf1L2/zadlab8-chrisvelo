

/**
 *
 * @author krzysiek
 */
public class Kwadrat extends FiguraPlaska {
    public double a;
    
    public Kwadrat(double a){
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
    public double obliczObwod(){
        return 4*a;
    }
    
    @Override
    public double obliczPole(){
        return a*a;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Kwadrat o boku: "+a+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
