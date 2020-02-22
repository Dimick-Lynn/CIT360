/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class CollectionBasics {

    /**
     *
     * @author lynndimick
     */
    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(90);
        listNumbers.add(100);
        listNumbers.add(80);
        listNumbers.add(85);
        listNumbers.add(75);
        listNumbers.add(80);
        listNumbers.add(90);

        System.out.println("Display the List contents");
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.printf("Grade #%d == %d\n", i, listNumbers.get(i));

        }

        System.out.println("Remove the 2nd element (Index[1])");
        System.out.printf("Element 1 == %d\n", listNumbers.get(1));
        //**REMOVE INDEX ITEM 1 WHICH IS THE SECOND ELEMENT IN THE ARRAY
        //**
        listNumbers.remove(1);

        System.out.println("Display the List contents");
        for (int i = 0; i < listNumbers.size(); i++) {
            System.out.printf("Grade #%d == %d\n", i, listNumbers.get(i));
        }
//** Place next codes here

        System.out.println("\n\nNow Demo the Set. Create the list to contain:");

        List<Integer> setListNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(setListNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(setListNumbers);
        System.out.println("The SET now contains the unique members");
        System.out.println(uniqueNumbers);

//** Map code goes here
        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");

        System.out.println(mapLang);
        String language = mapLang.get(".java");
        System.out.println(".java: " + language);
        String language2 = mapLang.get(".c");
        System.out.println(".c: " + language2);
//** Add checker
        System.out.println("\n\nWe have set up a map with some progrmaming languages in the map");
        System.out.println("We see if .java is a valid key in our map. If it is we will delete it.");
        if (mapLang.containsKey(".java")) {
            System.out.println(".java is a valid key");

        }
        System.out.println("Remove .java from the map");
        String removedValue = mapLang.remove(".java");
        if (removedValue != null) {
            System.out.println("Removed value: " + removedValue);
        }
        System.out.println(mapLang);

        //** Queue
        Queue<String> queueNames = new LinkedList<>();
//**System.out.println(queueNames);
//**

        queueNames.add("Mike");
        queueNames.add("Melissa");
        queueNames.add("Scott");
//** Display intial queue
        System.out.println("\n\nShowing the content of the queue");
        System.out.println(queueNames);
        queueNames.add("Christy");
//**Display the additional name
        System.out.println("Showing the added name in the queue");
        System.out.println(queueNames);
//remove the first name or head of the queue
        System.out.println("Now we will remove the first item in the queue");
        String next = queueNames.remove();
        System.out.println("Next customer is: " + next);
        System.out.println("The queue now contains:");
        System.out.println(queueNames);

        Tree tree = new Tree();
                Tree.Node root = new Tree.Node(7);
                System.out.println("\n\nBinary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 3);
                tree.insert(root, 76);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 13);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                tree.traverseInOrder(root);
        
        
    }

}

