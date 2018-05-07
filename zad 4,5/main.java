

/**
 *
 * @author krzysiek
 */
public class main {

    
    public static void main(String[] args) {
       FiguraGeometryczna[] tablica = new FiguraGeometryczna[15];
       
       tablica[0] = new Kwadrat(2);
       tablica[1] = new Prostokat(2,2);
       tablica[2] = new Trojkat(2,6);
       tablica[3] = new Trapez(2,3,3,2,4);
       tablica[4] = new Rownoleglobok(2,4,2);
       tablica[5] = new Romb(2,3);
       tablica[6] = new Kolo(3);
       tablica[7] = new Szescian(4);
       tablica[8] = new Prostopaloscian(2,3,4);
       tablica[9] = new Kula(5);
       tablica[10] = new Walec(2,4);
       tablica[11] = new Stozek(2,2,2);
       tablica[12] = new Kwadrat(6);
       tablica[13] = new Kula(12);
       tablica[14] = new Prostokat(2,6);
     //  tablica[2].toString();
       int k=0;
       while(k<15){
          System.out.println("nr figury w tab: "+k);
          tablica[k].toString();
          k++;
       }
    }
    
}
