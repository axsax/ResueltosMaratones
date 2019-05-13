/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10474;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = 1, query = 0, number = 0, marble;
        marble = sc.nextInt();
        query = sc.nextInt();
        while (marble != 0 & query != 0) {
            boolean verify = false;
            int listNumbers[] = new int[marble];
            int listQuery[] = new int[query];
            for (int i = 0; i < listNumbers.length; i++) {
                listNumbers[i] = sc.nextInt();
            }
            for (int i = 0; i < listQuery.length; i++) {
                listQuery[i] = sc.nextInt();
            }
            Arrays.sort(listNumbers);
            System.out.println("CASE#" + cases);
            for (int i = 0; i < listQuery.length; i++) {
                for (int j = 0; j < listNumbers.length; j++) {
                    if (listQuery[i] == listNumbers[j]) {
                        verify = true;
                        System.out.println(listQuery[i] + " found at " + (j+1));
                        break;
                    }
                }
                if (verify == false) {
                    System.out.println(listQuery[i] + " not found");
                }
                verify = false;
            }
            cases++;
            marble = sc.nextInt();
            query = sc.nextInt();
        }
    }
}
