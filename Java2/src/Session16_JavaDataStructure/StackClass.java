/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_JavaDataStructure;

import java.util.Stack;

/**
 *
 * @author lhhuong
 */
public class StackClass {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push("Hello");
        s.push("Bonjour");
        s.push("Xin chao");
        System.out.println("Your Stack: "+s);
        
        //Kiem tra phan tu dau tien trong ngan xep
        System.out.println("Element at the top: "+s.peek());
        
        //Lay phan tu dau tien ra khoi ngan xep
        System.out.println("Get the element at the top: "+s.pop());
        System.out.println("New top element: "+s.peek());
        
    }
}
