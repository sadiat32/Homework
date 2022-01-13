package homework4;

import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<String,Integer> fruit = new HashMap<>();
        fruit.put("Mango", 10);
        fruit.put("Grapes", 20);
        fruit.put("Strawberry", 30);
        fruit.put("Blackberry", 40);
        for (String i: fruit.keySet()) {
            System.out.println(i);
        }
    }}
