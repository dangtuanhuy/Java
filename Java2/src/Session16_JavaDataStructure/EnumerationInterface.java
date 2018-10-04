/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_JavaDataStructure;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author lhhuong
 * Interface nay dinh nghia ra cac phuong thuc ho tro lap trinh vien 
 * co the liet ke ra cac phan tu ben trong mot collection.
 */
public class EnumerationInterface {
    public static void main(String[] args){
        Vector daysinWeek = new Vector();
        daysinWeek.add("Sunday");
        daysinWeek.add("Monday");
        daysinWeek.add("Tuesday");
        daysinWeek.add("Webnesday");
        daysinWeek.add("Thursday");
        daysinWeek.add("Friday");
        daysinWeek.add("Saturday");
        
        Enumeration days = daysinWeek.elements();
        
        while(days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
        
        
    }
}
