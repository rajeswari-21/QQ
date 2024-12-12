package Sorting;

public class MinimumnumberofBottlesvisiblewhenabottlecanbeenclosedinsideanotherBottle {

    static int count(int[]  input){

        int[] fq= new int[100000];
        int max=0;
        for(int i=0;i<input.length;i++)
        {
            fq[input[i]]= fq[input[i]]+1;
            if(max<fq[input[i]])
                max=fq[input[i]];

        }

        return max;
    }
}
