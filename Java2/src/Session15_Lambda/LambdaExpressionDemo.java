/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session15_Lambda;

import java.util.Arrays;

/**
 *
 * @author lhhuong
 */
@FunctionalInterface
interface InterfaceFunctional{
    int Addition(int a, int b);
}

public class LambdaExpressionDemo {
    public static void main(String[] args){
        //Vi dụ 1: Su dung Lambda co ban
        InterfaceFunctional func1 = (int a, int b) -> a+b;
        System.out.println("5 + 10 = "+func1.Addition(5, 10));
        
        //Vi du 2: Su dung Lambda co ban khong chi dinh kieu tham so
        InterfaceFunctional func2 = (a, b) -> a+b;
        System.out.println("5 + 10 = "+func2.Addition(5, 10));
        
        //Vi du 3: Su dung Lambda co phan xu ly va co ket qua tra ve
        InterfaceFunctional func3 = (a, b) -> { return a+b; };
        System.out.println("5 + 10 = "+func3.Addition(5, 10));
        
        //Vi du 4: Su dung Lambda co chua nhieu cau lenh trong phan xu ly
        InterfaceFunctional func4 = (a, b) -> { 
            int kq; 
            kq = a+b;
            return kq;
        };
        System.out.println("5 + 10 = "+func4.Addition(5, 10));
        
        //vi du 5: Su dung lambda voi vai tro la tham so trong mot phuong thuc
        String[] words = new String[]{ "Hi", "Hello", "Bonjour" };
        System.out.println("Original Array: "+ Arrays.toString(words));
        Arrays.sort(words,(a,b) -> a.compareTo(b));
        System.out.println("Sorted Array: "+ Arrays.toString(words));
    }
}
