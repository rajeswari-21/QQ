import java.util.Arrays;

public class CountInversion {


    static long count=0l;
    public static long getInversionsOpt(long arr[], int n) {
        // Write your code here.
        // using merge sort
        int start=0;
        int end= arr.length -1;
        mergesort(arr,start,end);
        return count;


    }

    public static void mergesort(long arr[],int start, int end)
    {
        if(start>=end)
            return;
        int mid= (start+end)/2;
        mergesort(arr, start, mid); // left half of arr
        mergesort(arr, mid+1, end); // right half of array
        merge(arr,start,mid,end); //merge
    }

    public static void merge(long arr[],int start,int mid, int end){

        int left= start; //left most of the first array
        int right=mid+1; //left most of the second array
        long temp[] = new long[end-start+1];
        int i=0;
        while(left<=mid && right<=end)
        {
            if(arr[left]<=arr[right])
            {
                temp[i]=arr[left];
                left++;
                i++;
            }
            else
            {
                count= count+ (mid-left)+1; // counts the inversion
                temp[i]=arr[right];
                right++;
                i++;

            }
        }


        // rest of the elements into temp
        while(left<=mid)
        {
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=end)
        {
            temp[i]=arr[right];
            right++;
            i++;
        }

        //temp to arr
        int j=start;
        for(long e:temp)
        {
            arr[j]=e;
            j++;
        }




    }
    //brut force
    public static long getInversions(long arr[], int n) {
        // Write your code here.

        long count=0;
        if(n==1 || n==0)
            return 0l;

        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] a) {


        //long[] mat = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};

        long[] mat = {2,5,1,3,4};

        //long res= dividePlayers(mat);
        long ans= getInversions(mat,mat.length);
        System.out.println("brut force: "+ ans);


        long opt= getInversionsOpt(mat,10);
        System.out.println("Optimal: "+ opt);
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        //Arrays.stream(arr).forEach(e-> System.out.print(e + " ,"));

    }
}
