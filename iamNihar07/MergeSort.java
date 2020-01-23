import java.util.*;
public class MergeSort
{
    static int l,h;
    static int arr[];

    MergeSort(int size)
    {
        l=0;
        arr=new int[size];
        h=arr.length-1;
    }

    void mergeSort(int array[], int l, int h)
    {
        int low=l;
        int high=h;
        if(low>=high)
        {
            return;
        }
        int middle=(low+high)/2;
        mergeSort(array,low,middle);
        mergeSort(array,middle+1,high);

        int end_left=middle;
        int start_right=middle+1;
        int temp;

        while((low<=end_left) && (start_right<=high))
        {
            if(array[low]<array[start_right])
            {
                low++;
            }
            else
            {
                temp=array[start_right];
                for(int i=start_right-1; i >=low; i--)
                {
                    array[i+1]=array[i];
                }
                array[low]=temp;
                low++;
                end_left++;
                start_right++;
            }
        }
    }

    void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        MergeSort ob=new MergeSort(n);

        System.out.println("Enter the "+(n)+" values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before");
        ob.display();
        ob.mergeSort(arr,0,arr.length-1);
        System.out.println("After");
        ob.display();
    }
}

    