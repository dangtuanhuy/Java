/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_AtomicOperation;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author lhhuong
 */
public class ResolveAtomicOperation {
    public AtomicInteger count = new AtomicInteger();
    public void Increment(){
        this.count.incrementAndGet();
    }
    
    public void Decrement(){
        this.count.decrementAndGet();
    }
    
    public int getValue(){
        return this.count.get();
    }
    
    public static void main(String[] args){
        AtomicOperation obj = new AtomicOperation();
        Thread t1 = new Thread(){
            public void run(){
                obj.Increment();
                System.out.println("Value = "+ obj.getValue());
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                obj.Increment();
                System.out.println("Value = "+ obj.getValue());
            }
        };
        t2.start();
    }
}
