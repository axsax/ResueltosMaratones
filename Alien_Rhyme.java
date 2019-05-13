/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Alien_Rhyme {

    public static void main(String[] args) {
        ArrayList<String> pal = new ArrayList<>();
        ArrayList<String> rep = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int cont = 0;
            int cantidad = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < cantidad; j++) {
                String lin=sc.nextLine();
                String cad="";
                for (int k = lin.length()-1; k >=0 ; k--) {
                    cad+=lin.charAt(k);
                }
                pal.add(cad);
            }
            for (int j = 0; j < pal.size()-1; j++) {
                
                for (int k = 1; k < pal.size(); k++) {
                    String su="";
                    for (int l =0; l < pal.get(j).length(); l++) {
                        try {
                            if (pal.get(j).charAt(l) == pal.get(k).charAt(l)) {
                                su+=String.valueOf(pal.get(j).charAt(l));
                            }else{
                                break;
                            }
                        } catch (Exception e) {
                           
                        }
                    }
                     rep.add(su);
                }

            }
            for (int j = 0; j < rep.size(); j++) {
                System.out.println(rep.get(j));
            }
        }
    }
}
