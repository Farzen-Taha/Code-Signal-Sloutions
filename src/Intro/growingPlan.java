/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

/**
 *
 * @author Sayed Farzen
 */
public class growingPlan {
    public static void main(String[] args) {
        int upSpeed=6;
        int downSpeed=5;
        int desiredHeight=10;
        
        int dayCounter=0;
        int day=0;
        int night=0;
        while(day<desiredHeight){
            day=(night+upSpeed);
            night=day-downSpeed;
             dayCounter++;
        }
        System.out.println(dayCounter);
    }
    
}
