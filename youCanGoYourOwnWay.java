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
public class youCanGoYourOwnWay {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long casos,tam;
        casos=Long.parseLong(br.readLine());
        for (int i = 1; i <= casos; i++) {
            String linea=br.readLine();
            System.out.print("Case #"+i+": ");
            for (int j = 0; j < linea.length(); j++) {
                if (linea.charAt(j)=='S') {
                    System.out.print("E");
                }else{
                    System.out.print("S");
                }
            }
            System.out.println("");
        }
        
    }
    
}
