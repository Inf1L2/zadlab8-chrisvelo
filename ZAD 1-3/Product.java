

/**
 *
 * @author krzysiek
 */
public abstract class  Product {
    
    public  double price;
    public   String name;
    public  String describe;

    Product(String name,double price, String describe)
    {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }
    
   // public abstract double getPrice();
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
  // public abstract String getName();
   public String getName(){
       return name;
   }
   public void setName(String name){
         this.name=name;  
   }
   
//   public abstract String getDescribe();
   public String getDescribe(){
       return describe;
   }
   public void setDescribe(String describe){
         this.describe=describe;  
   }
   

    public abstract void buy();

    public abstract void showInfo();
    
}
