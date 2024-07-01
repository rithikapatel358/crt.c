Program on Binary search in java
Source code:
import java.util.Scanner;
public class BinarySearch{   
public static int binarySearch(int[] arr, int key){  
    int low=0;
    int high=arr.length-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]>key)
        high=mid-1;
        else
        low=mid+1;
    }
    return -1;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(binarySearch(arr,key));
        }     
}
