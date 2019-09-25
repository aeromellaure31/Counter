/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.util.Scanner;

/**
 *
 * @author laureae_sd2082
 */
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type here: ");
        String a = input.nextLine();
        int counter = 0;
        
        String[] b = a.split(" ");
        for(String x: b){
            System.out.println(x);
        }
        System.out.println(b.length);
        
        for(int i=0; i<=b.length-1; i++){
            counter++;
        }
        System.out.println(counter);
    }
    
}
