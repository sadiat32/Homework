package homework4;

import java.util.*;
public class Array {
    public static void main(String[] args) {
        // creating two arrays
        int[] array1 = {1,3,2,4,8,9,0};
        int[] array2 = {1,3,7,5,4,0,7,5};
        // create two hashsets
        HashSet<Integer> hs1 = new HashSet();
        HashSet<Integer> hs2 = new HashSet();
        for(int i=0;i<array1.length;i++)
            hs1.add(array1[i]);
        for(int i=0;i<array2.length;i++)
            hs2.add(array2[i]);
        System.out.println("Set 1 = " + hs1);
        System.out.println("Set 2 = " + hs2);
        // union
        HashSet<Integer> union = new HashSet();
        union.addAll(hs1);
        union.addAll(hs2);
        System.out.println("Union = " + union);
        // intersection
        HashSet<Integer> intersection = new HashSet();
        intersection.addAll(hs1);
        intersection.retainAll(hs2);
        System.out.println("Intersection = " + intersection);
        // symmetric difference=union - intersection
        HashSet<Integer> symmetric = new HashSet();
        symmetric.addAll(union);
        symmetric.removeAll(intersection);
        System.out.println("Symmetric Difference = " + symmetric);
    }
}
