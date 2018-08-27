/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeshop;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "Retrait gratuit à l'entrepôt dans Paris";
    }
}
