import java.util.*;


class Pairs_with_Positive_Sum {
    static long validPair(int[] a) {
        // Your code goes here
        Arrays.sort(a);
        int n = a.length;
    
        long count= 0;
        int right = n-1, left = 0;
    
        while(left<right){
            int sum = a[left]+a[right];
            if(sum>0){
                count+=(right - left);
                right--;
            }else{
                left++;
            }
        }
    
        return count;
    }
}