import java.util.List;

public class WhatACodeArrayConcatenation {

    static int[] concatenation(int[]  input){


        int[] output= new int[2*input.length];
        for(int i = 0; i < input.length; i++){
            output[i] = output[i + input.length] = input[i];
        }

        return output;
    }

    public static void main(String[] a){

        int[] input= new int[]{1,2,3,4};
        int[] res= concatenation(input);

        for(int x:res)
            System.out.println(x);
    }
}
