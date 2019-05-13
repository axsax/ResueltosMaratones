/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlecodejam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author axsax
 */
public class ForegoneSolution {
public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        long casos;
        casos = Long.parseLong(br.readLine());
        saber(casos);

    }

    public static void saber(long c) throws IOException {
        
        for (int i = 1; i <= c; i++) {
            long n=Long.parseLong(br.readLine());
            long tot = n;
            String linea = n + "";
            linea = linea.replace('4', '1');
            System.out.println("Case #"+i+": "+linea + " " + (n - Long.parseLong(linea)));           
        }

    }
}
