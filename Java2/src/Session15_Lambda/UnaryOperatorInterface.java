/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

import java.util.function.UnaryOperator;

/**
 *
 * @author lhhuong
 */
public class UnaryOperatorInterface {
    public static void main(String[] args){
        UnaryOperator<String> op = x -> x.toUpperCase();
        System.out.println("Result of UnaryOperator<String>: "+op.apply("Luong Hoang Huong"));
    }
}
