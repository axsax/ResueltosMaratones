/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10361;

import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Main {

    public static void main(String[] args) {
        int casos = 0;
        String inicio="",finaal="",s1="",s2="",s3="",s4="",s5="";
        Scanner sc = new Scanner(System.in);
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            
            inicio=sc.nextLine();
            finaal=sc.nextLine();
            if (inicio.startsWith("<")==true) {
                s1="";
            }else{
                s1=inicio.substring(0,inicio.indexOf("<"));
            }
            
            s2=inicio.substring(inicio.indexOf("<")+1, inicio.indexOf(">"));
            inicio=inicio.substring(inicio.indexOf(">")+1,inicio.length());
            s3=inicio.substring(0,inicio.indexOf("<"));
            s4=inicio.substring(inicio.indexOf("<")+1,inicio.indexOf(">"));
            s5= inicio.substring(inicio.indexOf(">")+1,inicio.length());
            System.out.println(s1+s2+s3+s4+s5);
            finaal=finaal.substring(0,finaal.indexOf("..."));
            System.out.println(finaal+s4+s3+s2+s5);
            s1="";s2="";s3="";s4="";s5="";
        }
    }
}
