/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

import java.math.BigInteger;

/**
 *
 * @author axsax
 */
public class Google {

    /**
     * "600613"
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger real = new BigInteger("600613");
        boolean sera = false;
       real=real.pow(128);
        System.out.println(real);
        
        //BigInteger cercano= real.nextProbablePrime();
        while (sera == false) {
            sera = isPrime(real);
            if (sera == true) {
                System.out.print(" es primo ");
                System.out.println(real);
                break;
            }
             real = real.subtract(BigInteger.ONE);
        }

    }

    static boolean isPrime(BigInteger x) {
       
        BigInteger dos = new BigInteger("2");
        BigInteger iii= new BigInteger("3");
        if (x.compareTo(dos) == -1) {
            return false;
        }
        if (x.equals(dos)) {

            return true;
        }
        if (x.mod(dos).equals(BigInteger.ZERO)) {
            return false;
        }
     
        while (iii.multiply(iii).compareTo(x)==-1||iii.multiply(iii).equals(x)) {            
             if (x.mod(iii).equals(BigInteger.ZERO)) {
                return false;
            }
            iii=iii.add(dos);
        }
         return true;
        /*
        for (iii = x; iii.multiply(iii).compareTo(x) == 1 || iii.multiply(iii).equals(x); iii = iii.subtract(dos)) {
            System.out.println("aaaaaaaa");
            if (x.mod(iii).equals(BigInteger.ZERO)) {
                
                return false;
            }
            System.out.println("aaa");
        }*/
       
    }
}
