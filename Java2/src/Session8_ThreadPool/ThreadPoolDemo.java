/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_ThreadPool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author lhhuong
 */
public class ThreadPoolDemo {
    private static boolean isError = false;
    public static void main(String[] args){
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    if(isError)
                        break;
                    System.out.println("Thread 1: "+i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return "Task 1";
            }
        });
        
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 2; i++) {
                    if(isError)
                        break;
                    int a = 3/0;
                    System.out.println("Thread 2: "+i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return "Task 2";
            }
        });
        
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 10; i++) {
                    if(isError)
                        break;
                    System.out.println("Thread 3: "+i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return "Task 3";
            }
        });
        
        try {
            List<Future<String>> futures = exec.invokeAll(callables);
            for (Future<String> future : futures) {
                System.out.println("future.get = "+future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch(ExecutionException ex){
            ex.printStackTrace();
        }
        exec.shutdown();
    }
}
