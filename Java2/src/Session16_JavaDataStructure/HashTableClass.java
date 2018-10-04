/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_JavaDataStructure;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author lhhuong
 */
public class HashTableClass {
    public static void main(String[] args){
        Hashtable table = new Hashtable();
        table.put(1,"Class 1");
        table.put(2,"Class 2");
        table.put(3,"Class 3");
        table.put(4,"Class 4");
        
        //Hien thi danh sach cacs phan tu dua vao khoa
        //Lay danh sach cac khoa
        System.out.println("Hien thi danh sach cac phan tu dua vao khoa");
        Enumeration e = table.keys();
        while (e.hasMoreElements()) {
            System.out.println(table.get(e.nextElement()));
            
        }
        
        //Hien thi danh sach cac phan tu
        System.out.println("Hien thi danh sach cac phan tu");
        e = table.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
            
        }
    }
}
