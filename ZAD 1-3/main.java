
/**
 * zad 1 lab 8
 * @author krzysiek
 */
public class main {

    
    public static void main(String[] args) {
        
        Product[] zakupy = new Product[10];
       zakupy[0] = new Tractor("Ursus",3000.00,"Traktor szefa");
       zakupy[1] = new Ksiazka("Pan Tadeusz",30.0,"Stara ksiazka");
       zakupy[2] = new Dzem("Łowicz",6.0,"Polski dzem");
       zakupy[3] = new Polopiryna("Polopiryna",10.0,"Nie mieszac z alkoholem");
       zakupy[4] = new Dlugopis("Pen",3.0,"Dlugopis zwykly");
       zakupy[5] = new Dlugopis("Czarny",2.0,"Dlugopis na mature");
       zakupy[6] = new Ksiazka("Java",40.0,"Podstawy jezyka");
       zakupy[7] = new Czekolada("Wedel",8.0,"Stara czekolada");
       zakupy[8] = new Dzem("Lipny",20.0,"Kiepski dzemik");
       zakupy[9] = new Tractor("Fend",30000.0,"Fendzik");
       
for(int i=0;i<10;i++)
{
    zakupy[i].buy();
}


for(int i=0;i<10;i++)
{
    zakupy[i].showInfo();
}


    }
    
}
