package june.ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class Lab250 {
    public static void main(String[] args) {
       int[] input = {1,2,3,4,4,5};
       int[] output = new int[input.length];
       int outputIndex = 0;
       Set<Integer> uniqueSet = new HashSet();
       for(int num: input){
           uniqueSet.add(num);
               uniqueSet.add(num);
           }
           System.out.println(uniqueSet);
       }
    }
