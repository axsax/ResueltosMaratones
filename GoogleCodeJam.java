/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googlecodejam;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;  
class Solution {
    static long resa, resb, cases = 1; 
    static long a1, b1, a2, b2;    
    static String stra1, strb1, stra2, strb2;   
    static boolean encontrado = false;      
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        long t, n;    
        t = Long.parseLong(br.readLine());      
        for (long i = 0; i < t; i++) {        
            encontrado = false;         
            resa = 0;         
            resb = 0;           
            n = Long.parseLong(br.readLine());   
            revisar(n);             
            System.out.println("Case #" + cases + ": " + resa + " " + resb);     
            cases++;          
        }     
    }      
    public static void revisar(long n) 
    {         
        a1 = n;        
        b1 = 0;        
        a2 = 0;        
        b2 = n;       
        while (!encontrado) {    
            stra1 = Long.toString(a1);    
            strb1 = Long.toString(b1);    
            stra2 = Long.toString(a2);   
            strb2 = Long.toString(b2);   
            if (!stra1.contains("4") && !strb1.contains("4")) {    
                if (a1 + b1 == n) {             
                    encontrado = true;           
                    resa = a1;                  
                    resb = b1;                 
                    break;                
                }           
            }            
            if (!stra2.contains("4") && !strb2.contains("4")) {    
                if (a2 + b2 == n) {                    
                    encontrado = true;                  
                    resa = a2;                   
                    resb = b2;                  
                    break;              
                }         
            }           
            a1--;        
            b1++;          
            a2++;           
            b2--;        
        }   
    } 
}