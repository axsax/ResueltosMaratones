
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axsax
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BigInteger bi= new BigInteger("0");
        BigInteger bi2= new BigInteger("0");
        bi=sc.nextBigInteger();
        while (!bi.equals(BigInteger.ZERO)) {            
            bi2=bi.add(bi2);
            bi=sc.nextBigInteger();
        }
        System.out.println(bi2);
    }
}
