/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protoncons;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class ProtonPersona extends ProtonX70{
    
    private String seat;
    
    public static void voiceControl() {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter voice command: ");
        String voice=scan.nextLine();
        System.out.println("Voice Command: "+voice);
    }
    //polymorphism method
    void run(){
        System.out.println("Proton Persona is running safely!");
    }
    // setter and getter method
    public void setSeat(String myseat){
        this.seat=myseat;
    }
    public String getSeat(){
        return seat;
    }
}
