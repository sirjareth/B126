/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day29.discussion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Yuno
 */
public class LottoSimulator {

    public static void main(String[] args) {
        System.out.println("Lotto Simulator By FCS");

        List<Integer> lottoNumbers = new ArrayList<>();
        Random rand = new Random();

        while (lottoNumbers.size() < 6) {
            int generatedRandomNumber = rand.nextInt(58) + 1;
            if (!lottoNumbers.contains(generatedRandomNumber)) {
                lottoNumbers.add(generatedRandomNumber);
            } 
        }
        System.out.println(lottoNumbers);
    }
    
}