/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzysiek
 */
public class Polopiryna extends Product {
    public Polopiryna(String name, double price, String describe) {
        super(name, price, describe);
    }

    public void buy() {
        System.out.println(
                "Zakupiono polopirynke");
    }

    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe()
        );
    }
    
    
    
}
