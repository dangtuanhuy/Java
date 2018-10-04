/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author lhhuong
 */
public class BuiltinFunctionalInterfacesDemo {
    public static void main(String[] args){
        String testString = "Hello";
        
        //Vi du 1: Su dung Predicate
        Predicate<String> predicate = arg -> (arg.equals("Hello World"));
        System.out.println("Predicate Example: "+predicate.test(testString));
        
        //Vi du 2: Su dung Consumer
        Consumer<String> consumer = arg -> System.out.println("Consumer Example: "+arg.toUpperCase());
        consumer.accept(testString);
        
        //Vi du 3: Su dung Function
        Function<String, Integer> func = arg -> arg.length();
        System.out.println("Function Example: "+func.apply(testString));
        
        //Vi du 4: Su dung Producer
        Supplier supplier = () -> {
            return "Hello";
        };
        System.out.println("Supplier Example: " + supplier.get());
    }
}
