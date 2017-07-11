/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo

/**
 *
 * @author nanmathi
 */
class ListExample {
    
    static void main(String[] args){
        
        def fruits =["Apple","Mango","Banana"];
        
        fruits.each(){
            fruit -> println fruit;
        }
    }
	
}

