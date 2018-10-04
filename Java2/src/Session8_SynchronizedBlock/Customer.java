/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session8_SynchronizedBlock;

/**
 *
 * @author lhhuong
 */
public class Customer {
    private int balance = 1000;
    
    public Customer(){
        System.out.println("Tai khoan hien tai la: "+this.balance);
    }
    
    private synchronized void withdraw(int amount){
        System.out.println("Dang thuc hien giao dich rut tien: "+ amount);
        if(this.balance < amount){
            System.out.println("So tien trong tai khoan khong du de thuc hien giao dich");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
        this.balance -= amount;
        System.out.println("GD rut tien thanh cong. Tai khoan hien tai la: "+this.balance);
    }
    
    private synchronized void deposit(int amount){
        System.out.println("Dang thuc hien giao dich nap tien: "+amount);
        this.balance += amount;
        System.out.println("GD nap tien thanh cong. Tai khoan hien tai la: "+this.balance);
        notify();
    }
    
    public static void main(String[] args){
        Customer c = new Customer();
        Thread t1 = new Thread(){
            public void run(){
                c.withdraw(2000);
            }
        };
        t1.start();
        
        Thread t2 = new Thread(){
            public void run(){
                c.deposit(5000);
            }
        };
        t2.start();
    }
}
