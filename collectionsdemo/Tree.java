/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsdemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author lynndimick
 */
public class Tree {
    
static class Node {    
    int value; 
        Node left, right; 
          
        Node(int value){ 
            this.value = value; 
            left = null; 
            right = null; 
        } 
    } 
       
	
    public void insert(Node node, int value) {
        //** if the valu e inserted is less than the node it goes to the next level down on the left
        if (value < node.value) { 
          
            //** if the node already has a value then insert the value to the left
            if (node.left != null) { 
                insert(node.left, value); } else { 
                System.out.println(" Inserted " + value + " to left of " + node.value); 
                //** if the node value is more than the left node then iunsert it to the right node
                node.left = new Node(value); } } else if (value > node.value) {
                    if (node.right != null) {
                        insert(node.right, value);
          } else {
                System.out.println("  Inserted " + value + " to right of "
                + node.value);
            node.right = new Node(value);
          }
        }
      }
     public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
     }
     
    
}
