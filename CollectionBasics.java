/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsdemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
    for (int i=0;i<listNumbers.size();i++) {
        System.out.printf("Grade #%d == %d\n",i,listNumbers.get(i));

}
    
    System.out.println("Remove the 2nd element (Index[1])");
        System.out.printf("Element 1 == %d\n",listNumbers.get(1));

        
listNumbers.remove(1);

     System.out.println("Display the List contents");
for (int i=0;i<listNumbers.size();i++) {
        System.out.printf("Grade #%d == %d\n",i,listNumbers.get(i));
 }
//** Place next codes here

System.out.println("Now Demo the Set. Create the list to contain:");

List<Integer> setListNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
System.out.println(setListNumbers);
Set<Integer> uniqueNumbers = new HashSet<>(setListNumbers);
System.out.println("The SET now contains the unique members");
System.out.println(uniqueNumbers);

//** Map code goes here

//** Comment this


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
if (mapLang.containsKey(".java")) {
    System.out.println(".java is a valid key");
   
}
System.out.println("Remove .java from the map");
String removedValue = mapLang.remove(".java");
if (removedValue != null) {
    System.out.println("Removed value: " + removedValue);
}
System.out.println(mapLang);

}

}