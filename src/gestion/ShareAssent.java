/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Estudiante
 */
public class ShareAssent implements Asset{
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAssent(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }

    @Override
    public void getMarketValue() {
       
    }

    @Override
    public void getProfit() {
       
    }
    
    
   
    
    
    
}
