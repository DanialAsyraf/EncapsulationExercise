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
public class ProtonX50 extends ProtonSaga{
    
    String safePark,sunroof,speed;
    private String steering;
    
    ProtonX50(){
        this.safePark="Auto Park";
        this.sunroof="Panoramic Sunroof";
        this.speed="7-Speed DCT";
    }
    
    public void printsafePark(){
        ProtonX50 obj1=new ProtonX50();
        System.out.println("1. "+obj1.safePark);
    }
    public void printSunroof(){
        ProtonX50 obj2=new ProtonX50();
        System.out.println(obj2.sunroof);
    }
    public void printSpeed(){
        ProtonX50 obj3=new ProtonX50();
        System.out.println(obj3.speed);
    }
    void run(){
        System.out.println("Proton X50 is running safely!");
    }  
    // setter and getter or encapsulation
    public void setSteering(String newSteering){
        steering=newSteering;
    }
    public String getSteering(){
        return steering;
    }
}
