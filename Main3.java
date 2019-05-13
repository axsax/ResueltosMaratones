


import java.util.Scanner;



/**
 *
 * @author axsax
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
     String entrada;
     
        while (sc.hasNext()) {            
            entrada=sc.nextLine();
            int ce=0;int u=0;int d=0;int t=0;int c=0;int ci=0;int s=0;int si=0;int o=0;int n=0;
            for (int i = 0; i <entrada.length(); i++) {
                if (entrada.charAt(i)=='0') {
                    ce++;
                }else if (entrada.charAt(i)=='1') {
                    u++;
                }else if (entrada.charAt(i)=='2') {
                    d++;
                }else if (entrada.charAt(i)=='3') {
                    t++;
                }else if (entrada.charAt(i)=='4') {
                    c++;
                }else if (entrada.charAt(i)=='5') {
                    ci++;
                }else if (entrada.charAt(i)=='6') {
                    s++;
                }else if (entrada.charAt(i)=='7') {
                    si++;
                }else if (entrada.charAt(i)=='8') {
                    o++;
                }else if (entrada.charAt(i)=='9') {
                    n++;
                }
            }
            System.out.println(ce+" "+u+" "+d+" "+t+" "+c+" "+ci+" "+s+" "+si+" "+o+" "+n);
            
        }
       
    }
    
}
