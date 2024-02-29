/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.areandina.binarytree;

import java.util.Scanner;

/**
 *
 * @author mejia
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        System.out.println("Software FUAA");
//        System.out.print("Ingrese la cantidad de elemento del Arbol: ");
//        int count = input.nextInt();
        System.out.println("Ingrese los elementos");
//        for (int i = 0; i < count; i++) {
//            System.out.print((i+1)+": ");
//            int value =input.nextInt();
//            binaryTree.Insert(value);
//        }
        binaryTree.Insert(18);
        binaryTree.Insert(5);
        binaryTree.Insert(3);
        binaryTree.Insert(4);
        binaryTree.Insert(1);
        binaryTree.Insert(8);
        binaryTree.Insert(20);
        binaryTree.Insert(19);
        binaryTree.Insert(21);
        binaryTree.Insert(22);
        System.out.println("Mostrar el arbol");
        binaryTree.inordern();
    }
}
