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
class SparseNumber {
    
    static void main(String[] args){
        
        nextSparseNumber(4);
    }
    
    static void nextSparseNumber(int number){
        
        
        
        int binaryNumber = Integer.parseInt(number.toBinaryString(number));
        
        int[] sparseNumber = new int[number.toBinaryString(number).length()];
        int r=0;
        
        int temp = binaryNumber;
        
        int i=0;
        
        while(temp >0){
            
            r = temp % 10;
            temp = temp / 10;
            sparseNumber[i] = r;
            i=i+1;
        }
        
       if(!isSparseNumber(sparseNumber)){
           number = number +1;
           nextSparseNumber(number);
       }else{
           println "Next Parse number is: "+number;
       }
    }
    
    static boolean isSparseNumber(int[] number){
    
            for(int i=1; i<number.length; i++){
                
            if(number[i] == 1 && number[i-1] ==1 ){
                return false;
        
            }
        }
        return true;
    }
    }