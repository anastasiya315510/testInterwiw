/*
 author Anastasiya
 created on 11/08/2021
 */


package first;

import java.util.LinkedList;

public class MinValue {
    int findMinValue(int[] arr){
        int minValue=arr[0];
        LinkedList<Integer> minValues = new LinkedList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(minValue>arr[i]){
                minValues.add(arr[i]);
                minValue=arr[i];
            }
            stack.add(arr[i]);

        }
        return minValue;
    }

}
