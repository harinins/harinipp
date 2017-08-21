import java.util.Arrays;
import java.util.Scanner;

public class Leastno {

	public static void main(String[] args) throws java.lang.Exception
	    {
	       Scanner in=new Scanner(System.in);
	        int n=in.nextInt();
	        int temp;
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++) {
	        	arr[i]=in.nextInt();
	        }
	        Arrays.sort(arr);
	        //for(int i=0;i<n-1;i++) {
	        	for(int j=0;j<n-1;j++) {
	        		if(arr[j]>arr[j+1]) {
	        			temp=arr[j];
	        			arr[j]=arr[j+1];
	        			arr[j+1]=temp;
	        		}
	        	}
	        
	        System.out.println(arr[0]);
	        System.out.println(arr[1]);
	    }
	

	}


