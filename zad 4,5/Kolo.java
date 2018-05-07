
/**
 *
 * @author krzysiek
 */
public class Kolo extends FiguraPlaska {
       public double r;
    
    
     public Kolo(double r){
       
        this.r=r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

   
    
    //przesloniete metody z klas abstrakcyjnych
    @Override
    public double obliczObwod(){
        return 2*r*Math.PI ;
    }
    
    @Override
    public double obliczPole(){
        return 2*Math.PI*r;
    }

    
    //zwracanie informacji o figurze
    @Override
    public String toString() {
        return super.toString()+"Kolo o promieniu= "+r+" z polem: "+obliczPole()+" o obwodzie: "+obliczObwod(); 
    }
    
}
