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
public class Stock extends ShareAssent {
    private double totalShares;

    public Stock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }
    
    
}
