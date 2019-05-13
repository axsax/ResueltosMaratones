/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author axsax
 */
public class Maximum_subrray_sum {
    public static void main(String[] args) {
        int array[]={-1,2,4,-3,5,2,-5,2};
        int best=0, sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"  "+(sum+array[i]));
            sum=Math.max(array[i], sum+array[i]);
            
            System.out.println("la suma"+sum);
            System.out.println("best "+best+"sum "+sum);
            best=Math.max(best, sum);
            System.out.println("best "+best);
        }
        System.out.println("el mejor es: "+best);
    }
}
