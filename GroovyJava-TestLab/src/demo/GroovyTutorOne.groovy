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
class GroovyTutorOne {
    
    static void main(String[] args){
        def greetings = "Hello "
        println(greetings + "Grrovy");
        def address ="Name: Nandakumar\n\
        City: Erode\n\
        State: Tamilnadu\n\
        Country:India"
        
        println(address);
        
        println("Mius: "+5.minus(3));
        
        new Arithmetic().sum(10,11);
        
    }
	
}

class Arithmetic{
    
    void sum(a,b){
        
        println(a+b);
    }
}

