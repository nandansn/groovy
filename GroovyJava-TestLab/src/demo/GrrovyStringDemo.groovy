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
class GrrovyStringDemo {
    
    static void main(String[] args){
        
        def name ="nanda";
        
        println(name);
        
        println(name[2]);
        
        println(name.getAt(0..3))
        
        println(name.substring(3));
        
        println(name.split("n"))
        
        println(name.plus("kumar"));
        
        println(name.length());
        
        def repeatedWords = "I like like to do";
        
        println(repeatedWords.split(" "));
        
        //formatted string
        printf("%-10s %s %d %.3f","nanda","sanmathi",10,12.2)
        println()
        
        
        
    }
	
}

