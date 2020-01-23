import java.io.*;

public class Theatre
{
    int n;
    String movies[];
    int k;

    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    Theatre(int n)
    {
        this.n=n;
        movies=new String[n];
    }

    void input() throws IOException
    {      
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of the movie: ");
            movies[i]=in.readLine();
        }
    }

    void display()
    {
        System.out.println("The movies being shown are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(movies[i]);
        }
    }

    void searchEngine()throws IOException
    {        
        System.out.println("Enter tha name of movie to be searched for:");
        String x=in.readLine();
        boolean f=false;

        System.out.println("1 = Linear Search");
        System.out.println("2 = Binary Search");
        System.out.println("Enter 1 or 2");
        int choice = Integer.parseInt(in.readLine());
        if(choice==1)
        {
            f=linearSearch(x);
        }
        else if(choice==2)
        {
            System.out.println("1 = Sequential Sort");
            System.out.println("2 = Bubble Sort");
            System.out.println("3 = Selection Sort");
            System.out.println("4 = Insertion Sort");
            System.out.println("Enter 1 or 2 or 3 or 4");
            int choice2 = Integer.parseInt(in.readLine());
            if(choice2==1)
            {
                sequentialSort();
            }
            else if(choice2==2)
            {
                bubbleSort();
            }
            else if(choice2==3)
            {
                selectionSort();
            }
            else if(choice2==4)
            {
                insertionSort();
            }
            else
            {
                System.out.println("Enter correct choice");
            }

            f=binarySearch(x);
        }
        else
        {
            System.out.println("Enter correct choice");
        }
        if(f==true)
        {
            System.out.println(x+" is running");
        }
        else
        {
            System.out.println(x+" is not running");
        }
    }

    boolean linearSearch(String check)
    {
        for(int i=0;i<n;i++)
        {
            if(check.equalsIgnoreCase(movies[i]))
            {                
                return true;                
            }            
        }
        return false;
    }

    void sequentialSort()
    {
        String temp;
        for(int i=0;i<movies.length-1;i++)
        {
            for(int j=i+1; j<movies.length;j++)
            {
                if(movies[i].compareToIgnoreCase(movies[j])>0)  //m[j]<m[i]
                {
                    temp=movies[i];
                    movies[i]=movies[j];
                    movies[j]=temp;
                }
            }
        }

        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }
    }

    void bubbleSort()
    {
        String temp="";
        for(int i=0;i<movies.length-1;i++)
        {
            for(int j=0;j<movies.length-i-1;j++)
            {
                if(movies[j].compareToIgnoreCase(movies[j+1])>0)
                {
                    temp=movies[j];
                    movies[j]=movies[j+1];
                    movies[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }
    }
    
    void selectionSort()
    {
        String temp;
        int min=0;
        for(int i=0;i<movies.length-1;i++)
        {
            min=i;
            for(int j=i+1; j<movies.length;j++)
            {
                if(movies[j].compareToIgnoreCase(movies[min])<0)
                {
                    min=j;
                }
            }
            temp=movies[i];
            movies[i]=movies[min];
            movies[min]=temp;
        }

        for(int i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }
    }
    
    void insertionSort()
    {
        int i=0,j=0;
        String flag="";
        for(i=1;i<movies.length;i++)
        {
            flag=movies[i];
            j=i-1;
            while(flag.compareToIgnoreCase(movies[j])<0)
            {
                movies[j+1]=movies[j];
                j--;
                if(j<0)
                {
                    break;
                }
            }
            movies[j+1]=flag;
        }
        
        for(i=0;i<movies.length;i++)
        {
            System.out.println(movies[i]);
        }
    }    

    boolean binarySearch(String check)
    {
        int u,l,m;
        l=m=0;
        u=movies.length-1;
        boolean flag=false;

        while(l<=u)
        {
            m=(u+l)/2;
            if(check.compareToIgnoreCase(movies[m])>0)
            {
                l=m+1;
            }
            else if(check.compareToIgnoreCase(movies[m])<0)
            {
                u=m-1;
            }
            else if(check.compareToIgnoreCase(movies[m])==0)
            {
                flag=true;
                break;
            }            
        }        
        return flag;
    }

    public static void main() throws IOException
    {
        System.out.println("Enter the number of movies.");
        int n=Integer.parseInt(in.readLine());
        Theatre t=new Theatre(n);
        t.input();
        t.display();
        t.searchEngine();
    }
}

