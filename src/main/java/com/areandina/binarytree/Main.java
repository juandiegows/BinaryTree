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
        System.out.print("Ingrese la cantidad de elemento del Arbol: ");
        int count = input.nextInt();
        
        System.out.println("Ingrese los elementos");
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ": ");
            int value = input.nextInt();
            binaryTree.Insert(value);
        }

        System.out.print("Mostrar el arbol");
        binaryTree.inordern();
        System.out.println("");
        
        System.out.print("Los que tiene 2 hijos:");
        binaryTree.findNodesWithTwoChildren();
        System.out.println("");
        
        System.out.print("Los que tiene un hijo:");
        binaryTree.findNodesWithAtLeastOneEvenChild();
        System.out.println();

        System.out.print("Suma de los valores de sus hijos: ");
        binaryTree.sumChildValues(binaryTree.getRoot());
        System.out.println();
        
        System.out.print("Ingrese el valor a buscar: ");
        int valueFind =input.nextInt();
        System.out.println("");
        
        System.out.print("El camino es : ");
        System.out.println(binaryTree.findWay(valueFind));;
    }
}
