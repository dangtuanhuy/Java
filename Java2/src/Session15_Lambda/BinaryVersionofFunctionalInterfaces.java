/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

import java.util.function.BiPredicate;

/**
 *
 * @author lhhuong
 */
public class BinaryVersionofFunctionalInterfaces {
    public static void main(String[] args){
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> (x < y);
        System.out.println("Result of BiPredicate: "+biPredicate.test(10, 20));
    }
}
