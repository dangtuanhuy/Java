/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

/**
 *
 * @author lhhuong
 */
public class LambdaInThread {
    public static void main(String[] args){
        //In Java 7
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Threat in Java 7");
            }
        };
        r1.run();
        
        //In Java 8
        Runnable r2 = () -> {System.out.println("Threat in Java 8");};
        r2.run();
    }
}
