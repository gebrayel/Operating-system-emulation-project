package Classes;
import java.lang.Math;
public class Admin {
    public void Admin(){
        double rand = Math.random()*100;
        double rand2 = Math.random()*3;
        int priority;
        if(rand<=70){ /*aqui hay que aniadir una var global que sea el de cuantas consolas lleva
                        para ver si es para, y si es par que ruede la cosa*/
            System.out.println("Va a aniadirse un nuevo auto");
            if(rand2 <= 1){
                priority = 1;
            }else if(rand2 <= 2){
                priority = 2;
            }else{
                priority = 3;
            }
        }
        else{
            System.out.println("No toca agregar auto");
        }
        System.out.println("admin");
    }
}
