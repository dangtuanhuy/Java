/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

import java.util.function.IntPredicate;
import java.util.function.LongConsumer;

/**
 *
 * @author lhhuong
 */
public class PrimitiveofFunctionalInterfaces {
    public static void main(String[] args){
        IntPredicate result = x -> (x == 10);
        System.out.println("Result of IntPredicate: "+result.test(23));
        
        System.out.println("-------------------------------------------------");
        
        LongConsumer consumer = x -> System.out.println("Result of LongConsumer: "+x*x);
        consumer.accept(5);
        
    }
}
