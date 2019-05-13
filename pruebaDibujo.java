/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_sistemas_operativos;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;

public class pruebaDibujo {

    public static void main(String[] args) {
        JFrame jf = new JFrame("bujar lineas rectanfulo y ovalos");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r=120;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            logico casi = new logico(b, c,r);
            casi.setBackground(Color.yellow);
            jf.add(casi);
            jf.setSize(400, 420);
            jf.setVisible(true);
            r-=25;
        }
    }
}
