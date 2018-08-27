/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "Livraison à domicile"; 
    }
}