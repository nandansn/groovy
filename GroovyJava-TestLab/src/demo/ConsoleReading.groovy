/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demo

import javax.swing.JOptionPane

/**
 *
 * @author nanmathi
 */
class ConsoleReading {
    
    static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        def name = "";
        while(scan.hasNext()){
            
            def reading = scan.nextLine();
            if(reading.equals("q")){
                break;
            }
            name = name.plus(reading);
        }
        
        println(name)
        
    }
	
}

