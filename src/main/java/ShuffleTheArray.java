public class ShuffleTheArray {

    static int[] shuffle(int[]  input){

        int len= input.length;
        int mid= (0+(len-1))/2;
        int p1=0,i=0;
        int p2=mid+1;
        int o[] = new int[len];
        while(i<len)
        {
            o[i]= input[p1];
            o[i+1]= input[p2];
            p1++;
            p2++;
            i+=2;
        }

        return o;

    }

    public static void main(String[] a){

        int[] input= new int[]{2,5,1,3,4,7};
        int[] res= shuffle(input);

        System.out.print("[");
        for(int x:res)
            System.out.print(x + ",");
        System.out.print("]");
    }
}
