package Classes;
import java.lang.Math;
import Classes.*;
/**
 *
 * @author gebra
 */
public class Robot {
    public Robot(Node node){
        node.counter = 0;
        double rand = Math.random()*100;
        double rand2 = Math.random()*3;
        int priority;
        if (rand2 <= 1){
            priority = 1;
        }else if(rand2 > 1 && rand2 <= 2){
            priority = 2;
        }else{
            priority = 3;
        }
        System.out.println("Priority for this node is: "+priority);
        System.out.println("This time rand: " + rand);
        if (rand <=30){
            System.out.println("Se va pal mercao");
        }else if(rand>30 && rand <=80){
            System.out.println("No estoy seguro, a revision");
        }else{
            System.out.println("Ta chimba, a mejoras");
        }
        
    
    }
}
