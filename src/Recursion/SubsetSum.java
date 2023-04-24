package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 5, 4, 3, 6, 2, 4);
        System.out.println(subsetSums(arr, arr.size()));
    }
    static ArrayList<Integer> subsetSums(List<Integer> arr, int N){
        // code here
        ArrayList<Integer> out = new ArrayList<>();
        createSubsetSums(arr, N, 0, 0, out);
        Collections.sort(out);
        return out;
    }

    static void createSubsetSums(List<Integer> arr, int N, int index, int sum, ArrayList<Integer> out){
        if(index==N){
            out.add(sum);
            return;
        }
        createSubsetSums(arr, N, index+1, sum+arr.get(index), out);
        createSubsetSums(arr, N, index+1, sum, out);
    }
}
