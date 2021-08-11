/*
 author Anastasiya
 created on 11/08/2021
 */


package second;



import java.util.Arrays;


public class MinValue {
   public int findMinValue(int[] arr){
       return Arrays.stream(arr).min().orElse(0);
    }
}
