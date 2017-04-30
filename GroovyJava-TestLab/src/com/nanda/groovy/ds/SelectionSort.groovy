/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nanda.groovy.ds

/**
 *
 * @author nanmathi
 */
class SelectionSort {
    
    static void main(String[] args){
        
        int[] numbers =[10,3,5,6,1];
        
        
        
        def minimumValuePosition =0;
        
        for(int i=0; i<numbers.length; i++){
            
            int minimumValue = numbers[i];
            minimumValuePosition =i;
            
            for(int j=i+1; j<numbers.length; j++){
                if(minimumValue > numbers[j]){
                    
                    
                    minimumValue = numbers[j];
                    
                    minimumValuePosition = j;
                    
                    
                }
                
               
                
                
            }
            
             
            numbers[minimumValuePosition] = numbers[i];
            numbers[i] = minimumValue;
            
        }
        
        println(numbers)
    }
	
}

