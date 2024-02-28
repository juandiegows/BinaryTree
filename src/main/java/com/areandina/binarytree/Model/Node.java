
package com.areandina.binarytree.Model;

public class Node {

    private int valor;
    private Node left, right;

    public Node(int valor) {
        this.valor = valor;
        left = right = null;
    }

    public int getValue() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
    
    
}
