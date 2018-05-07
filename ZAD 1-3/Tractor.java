/**
 * @author krzysiek
 */
public class Tractor extends Product {
    public Tractor(String name, double price, String describe) {
        super(name, price, describe);
    }

    public void buy() {
        System.out.println(
                "I bought a black tractor, capaciticy 2400!");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    /*
    @Override
     public double getPrice() {
        return price;
    }
     
     @Override
     public String getName() {
        return name;
    }
     
     @Override
     public String getDescribe() {
        return describe;
    }*/
}
