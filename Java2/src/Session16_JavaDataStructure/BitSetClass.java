/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session16_JavaDataStructure;

import java.util.BitSet;

/**
 *
 * @author lhhuong
 */
public class BitSetClass {
    public static void main(String[] args){
        BitSet bitset1 = new BitSet(16);
        BitSet bitset2 = new BitSet(16);
        
        for (int i = 0; i < 16; i++) {
            if(i%2 == 0)
                bitset1.set(i);
            if(i%5 != 0)
                bitset2.set(i);
        }
        
        System.out.println("Bitset1: ");
        System.out.println(bitset1);
        System.out.println("Bitset2: ");
        System.out.println(bitset2);
        
        //Phep toan AND
        bitset2.and(bitset1);
        System.out.println("Bitset2 and Bitset1: ");
        System.out.println(bitset2);
        
        //Phep toan OR
        bitset2.or(bitset1);
        System.out.println("Bitset2 or Bitset1: ");
        System.out.println(bitset2);
        
        //Phep toan XOR
        bitset2.xor(bitset1);
        System.out.println("Bitset2 xor Bitset1: ");
        System.out.println(bitset2);
        
        
    }
}
