
/**
 *
 * @author axsax
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Solution {

    public static int se = 0;
    public static ArrayList<String> letras = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    public static ArrayList<Integer> nume = new ArrayList<Integer>(Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103));
    public static HashSet<Integer> aux = new HashSet<>();
    public static ArrayList<Integer> list1 = new ArrayList<>();
    public static ArrayList<Integer> list2 = new ArrayList<>();
    public static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int casos;
        String linea;

        casos = Integer.parseInt(br.readLine());

        for (int i = 0; i < casos; i++) {
            String primero[];
            br.readLine();
            linea = br.readLine();
            primero = linea.split(" ");
            facto2(Long.valueOf(primero[0]));
            for (int j = 1; j < primero.length ; j++) {
                facto(Long.valueOf(primero[j]));
                insert();
                se = 0;
            }
            System.out.println("-----------");
            for (int j = 0; j < res.size(); j++) {
          
                
               System.out.print(letras.get(nume.indexOf(res.get(j))) + " ");
            }

        }

    }

    public static void facto2(long num) {
        int divisor = 3;
        while (num != 1) {

            if (num % divisor == 0) {
                list1.add(divisor);
                
                num = num / divisor;

            } else {

                divisor++;

            }

        }
    }

    public static void facto(long num) {
        int divisor = 3;

        while (num != 1) {

            if (num % divisor == 0) {
                list2.add(divisor);
                
                num = num / divisor;

            } else {

                divisor++;

            }

        }
    }

    public static void insert() {
        for (int i = 0; i < list1.size(); i++) {
            
            
            if (aux.add(list1.get(i))) {
                System.out.print("1------ "+list1.get(i));
                res.add(list1.get(i));
            }
        }
        System.out.println(" ");
        for (int j = 0; j < list2.size(); j++) {
            
            if (aux.add(list2.get(j))) {
                System.out.print("2------ "+list2.get(j));
                res.add(list2.get(j));
            }
        }
      
        Collections.copy(list1, list2);
        list2.clear();
        
         

    }
}
