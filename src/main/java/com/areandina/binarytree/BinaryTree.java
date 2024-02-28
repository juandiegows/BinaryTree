
package com.areandina.binarytree;

import com.areandina.binarytree.Model.Node;

/**
 *
 * @author juandiegows
 */
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void Insert(int value) {
        root = InsertRecord(root, value);
    }

    private Node InsertRecord(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(InsertRecord(root.getLeft(), value));
        } else if (value < root.getValue()) {
            root.setRight(InsertRecord(root.getRight(), value));
        }
        return root;
    }

    public void inordern(Node node) {
        if (node != null) {
            inordern(node.getLeft());
            System.out.print(node.getValue() + " ");
            inordern(node.getRight());
        }
    }
    
    public String findWay(int value){
        return findWayRec(root, value);
    }

    private String findWayRec(Node root, int value) {
       if(root == null){
           return "El nodo no existe";
       }
       if(root.getValue() == value){
           return root.getValue()+"";
       }else if (value < root.getValue()){
           String stringWayLeft =  findWayRec(root.getLeft(), value);
           if(!stringWayLeft.equalsIgnoreCase("El nodo no existe")){
               return root.getValue() +" --> "+stringWayLeft;
           }
       }else {
            String stringWayRight =  findWayRec(root.getRight(), value);
           if(!stringWayRight.equalsIgnoreCase("El nodo no existe")){
               return root.getValue() +" --> "+stringWayRight;
           }
       }
          return "El nodo no existe";
    }

}
