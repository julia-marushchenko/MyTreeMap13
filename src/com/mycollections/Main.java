/**
 *  Java program to traverse through the TreeMap instance.
 */
package com.mycollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<Integer, String> myMap = new TreeMap<>();

        // Add.
        myMap.put(7, "Cloudy");
        myMap.put(1, "Sunny");
        myMap.put(3, "Windy");
        myMap.put(2, "Rainy");
        myMap.put(4, "Foggy");
        myMap.put(5, "Stormy");
        myMap.put(6, "Clear");

        // Printing keys and values.
        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + myMap.get(entry.getKey()));
        }
    }
}