Program in linear search in java
Source code:
import java.util.Scanner;
class LinearSearch{
    public  static int linearSearch(int [] arr,int key)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==key)
        {
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(linearSearch(arr,key));
    
    }
}
