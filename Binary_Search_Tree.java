/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author axsax
 */
public class Binary_Search_Tree {

    static class Node {

        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    static class BST {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            root = null;
            for (int i = 0; i < 10; i++) {
                insert(sc.nextInt());
            }
           
        }
        
        static Node root;

        public BST() {
            root = null;
        }

        static void insert(int k, Node node) {
            while (node != null) {
                if (k < node.key) {
                    if (node.left == null) {
                        node.left = new Node(k);
                        return;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = new Node(k);
                        return;
                    } else {
                        node = node.right;
                    }
                }
            }
        }

        static void insert(int k) {
            if (root == null) {
                root = new Node(k);
                return;
            }
            insert(k, root);
        }

        Node minimum(Node node) {
            if (node == null) {
                return null;
            }
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }

        Node find(int k, Node node) {
            while (node != null) {
                if (node.key == k) {
                    return node;
                }
                if (k < node.key) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
            return null;
        }

        boolean find(int k) {
            if (root == null) {
                return false;
            }
            return find(k, root) != null;
        }

        boolean remove(int k, Node node) {
            Node parent = null;
            while (node != null) {
                if (k < node.key) {
                    parent = node;
                    node = node.left;
                } else if (k > node.key) {
                    parent = node;
                    node = node.right;
                } else {
                    if (node.left != null && node.right != null) {
                        Node successor = minimum(node.right);
                        node.key = successor.key;
                        remove(successor.key, node.right);
                    } else {
                        Node x = node.left != null ? node.left : node.right;
                        if (parent == null) {
                            root = x;
                        } else if (parent.left == node) {
                            parent.left = x;
                        } else {
                            parent.right = x;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        boolean remove(int k) {
            if (root == null) {
                return false;
            }
            return remove(k, root);
        }

        static void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.println(node.key + " ");
            inorder(node.right);
        }

        static void inorder() {
            inorder(root);
            System.out.println("");
        }

        static  void postOrden(Node node){ //izquierda derecha raiz
            if (node!=null) {
                postOrden(node.left);
                postOrden(node.right);
                System.out.println(node.key);
            }
        }
        static void postOrden(){
            postOrden(root);
            System.out.println("");
        }
        static void preOrden(NodoArbol r){
            if (r!=null) {
                System.out.println(r.dato+" "+r.nombre);
                preOrden(r.hijoIzquierdo);
                preOrden(r.hijoDerecho);
            }
        }
    }

}
