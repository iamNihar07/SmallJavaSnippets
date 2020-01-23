import java.util.*;
public class QuickSort
{
    static int l,h;
    static int arr[];

    QuickSort(int size)
    {
        l=0;
        arr=new int[size];
        h=arr.length-1;
    }

    void quickSort(int array[], int l, int h)
    {
        int low=l;
        int high=h;
        int pivot=array[(low+high)/2];

        while(low<=high)
        {
            while(array[low]<pivot)
            {
                low++;
            }
            while(array[high]>pivot)
            {
                high++;
            }
            if(low<=high)
            {
                int temp;
                temp=array[high];
                array[high]=array[low];
                array[low]=temp;

                low++;
                high--;
            }
        }

        if(l<high)
        {
            quickSort(array,l,high);
        }
        if(low<h)
        {
            quickSort(array,low,h);
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
        QuickSort ob=new QuickSort(n);
        
        System.out.println("Enter the "+(n)+" values");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before");
        ob.display();
        ob.quickSort(arr,l,h);
        System.out.println("After");
        ob.display();
    }
}

       
    