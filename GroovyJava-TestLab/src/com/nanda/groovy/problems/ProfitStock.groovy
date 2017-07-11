/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nanda.groovy.problems

/**
 *
 * @author nanmathi
 */
class ProfitStock {
    
    static void main(String[] args){
        
        int[] unsortedStocksFullList = new int[7];
        unsortedStocksFullList =[100,30,200,210,120,410,220]
        
        int startingDay =2;
        int nDays =6;
              
        
        int totalDays = startingDay + nDays;
        
        
        if(unsortedStocksFullList.length < totalDays){
            
           nDays = nDays - (totalDays - unsortedStocksFullList.length);
           
            totalDays = startingDay + nDays;
        }
        
        int[] unsortedStocksPickedList = new int[totalDays];
        for(int i=startingDay; i<totalDays; i++){
            unsortedStocksPickedList[i] = unsortedStocksFullList[i]
        }
        
        print unsortedStocksPickedList;
        
        int minimumStockPricePosition = 0;
        
        for(int i=0; i<unsortedStocksPickedList.length; i++){
            
            int minimumStockPrice = unsortedStocksPickedList[i];
            
            for(int j=i+1; j<unsortedStocksPickedList.length; j++){
                
                if(minimumStockPrice < unsortedStocksPickedList[j]){
                    
                    minimumStockPrice = unsortedStocksPickedList[j];
                    minimumStockPricePosition =j;
                    
                }
            }
            
            
        }
        
        print minimumStockPricePosition
        
        //int profitDay = getNextNDaysStockPriceList(0, 3, unsortedStocksFullList);
        
        print "Profit Day:" + minimumStockPricePosition;
        
    }
    
    public static int[] getNextNDaysStockPriceList(int startingDay, int nDays, int[] unsortedStocksFullList){
        
        int totalDays = startingDay + nDays;
        
        
        if(unsortedStocksFullList.length < totalDays){
            
           nDays = nDays - (totalDays - unsortedStocksFullList.length());
           
            totalDays = startingDay + nDays;
        }
        
        int[] unsortedStocksPickedList = int[nDays];
        for(int i=startingDay; i<totalDays; i++){
            unsortedStocksPickedList[i] = unsortedStocksFullList[i]
        }
        print unsortedStocksPickedList;
        return unsortedStocksPickedList;
    }
    
    public static int sortedStockPrice(int[] unsortedStocks){
        
        int minimumStockPricePosition = 0;
        
        for(int i=0; i<unsortedStocks.length; i++){
            
            int minimumStockPrice = unsortedStocks[i];
            
            for(int j=i+1; j<unsortedStocks.length; j++){
                
                if(minimumStockPrice < unsortedStocks[j]){
                    
                    minimumStockPrice = unsortedStocks[j];
                    minimumStockPricePosition =j;
                    
                }
            }
            
            
        }
        
        return minimumStockPricePosition
        
    }
	
}

