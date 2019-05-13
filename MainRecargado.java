/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem13293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//All star three points
public class Main {

    public Main() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int cases = 1;
        while ((line = reader.readLine()) != null) {
            int lines = Integer.parseInt(line);
            ArrayList<Player> players = new ArrayList<>();
            for (int i = 0; i < lines; i++) {
                String temp = reader.readLine();
                int pos = temp.indexOf(";");
                String name = temp.substring(0, pos);
                pos++;
                int points = 0;
                while ((pos = temp.indexOf("1;", pos)) != -1) {
                    points++;
                    pos++;
                }
                if (temp.charAt(temp.length() - 1) == '1') {
                    points++;
                }
                temp = temp.replaceAll("[^1]", "");
                points += temp.length();
                Player player = new Player(name, points);
                players.add(player);
            }
            Collections.sort(players);
            System.out.println("Case " + cases + ":");
            for (int i = 0; i < lines; i++) {
                System.out.println(players.get(i).toString());
            }
            cases++;
        }
    }

    public static void main(String[] args) {
        try {
            new Main();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class Player implements Comparable<Player> {

        private String name;
        private int points;

        public Player(String pName, int pPoints) {
            this.name = pName;
            this.points = pPoints;
        }

        public Player() {
            this("", 0);
        }

        public String getName() {
            return name;
        }

        public void setName(String pName) {
            this.name = pName;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int pPoints) {
            this.points = pPoints;
        }

        @Override
        public int compareTo(Player pPlayer) {
            if (this.name.toUpperCase().compareTo(pPlayer.getName().toUpperCase()) != 0 && this.points == pPlayer.getPoints()) {
                return this.name.toUpperCase().compareTo(pPlayer.getName().toUpperCase());
            } else {
                if (this.points > pPlayer.getPoints()) {
                    return -1;
                } else if (this.points < pPlayer.getPoints()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        @Override
        public String toString() {
            return name + " " + points;
        }

    }

}
