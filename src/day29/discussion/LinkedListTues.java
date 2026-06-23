/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day29.discussion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListTues {
    
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println();
        
//        if (!lottoNumbers.contains(randomNumber)) {
//            lottoNumbers.add(randomNumber);
//        }

        numbers.addFirst(1);
        numbers.addLast(6);
        System.out.println(numbers);
        
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
        
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
    }
}
