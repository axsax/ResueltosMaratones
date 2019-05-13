/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prim;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        G = new Vertex[N];
        for (int i = 0; i < G.length; i++) {
            G[i] = new Vertex();
        }
        E = sc.nextInt();
        for (int i = 0; i < E; i++) {
            int from, to, w;
            from = sc.nextInt()-1;
            to = sc.nextInt()-1;
            w = sc.nextInt();
            G[from].adj.add(new Edge(to, w));
            G[to].adj.add(new Edge(from, w));
        }
        System.out.println(prim());

    }

    static PriorityQueue<QueueItem> Q;
    static int E;
    static boolean[] intree;
    static int N;
    static Vertex[] G;

    static class QueueItem implements Comparable<QueueItem> {

        int v, w;

        public QueueItem(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public int compareTo(QueueItem q) {
            if (this.w != q.w) {
                return this.w - q.w;
            }
            return this.v - q.v;
        }
    }

    static void process(int u) {
        intree[u] = true;
        for (Edge e : G[u].adj) {
            int v = e.to, w = e.w;
            if (!intree[v]) {
                Q.offer(new QueueItem(v, w));
            }
        }

    }

    static int prim() {
        intree = new boolean[N];
        Q = new PriorityQueue<QueueItem>();
        int cost = 0;
        process(0);
        while (!Q.isEmpty()) {
            QueueItem qi = Q.poll();
            int v = qi.v, w = qi.w;
            if (!intree[v]) {
                cost += w;
                process(v);

            }
        }
        return cost;
    }

    static class Vertex {

        List<Edge> adj;

        public Vertex() {
            adj = new ArrayList<Edge>();
        }

    }

    static class Edge {

        int to, w;

        public Edge(int to, int w) {
            this.to = to;
            this.w = w;
        }

    }

}
