
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
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bi = new BigInteger("0");
        BigInteger bi2 = new BigInteger("2147483647");
        BigInteger bi3 = new BigInteger("-2147483647");
        bi = sc.nextBigInteger();
        while (!bi.equals(BigInteger.ZERO)) {
            if (bi.compareTo(bi3)==1&&bi.compareTo(bi2)==-1) {
             System.out.println("Cabe");
            }else{
                System.out.println("No cabe");
            }
            bi = sc.nextBigInteger();
        }

    }
}
