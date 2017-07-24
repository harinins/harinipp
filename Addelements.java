import java.util.Scanner;

public class Addelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	for(int j=0;j<n;j++) {
		if(arr[i]+arr[j]==0) {
			System.out.print("the  two elements are");
			System.out.println(arr[i]);
			System.out.println(arr[j]);
		}
	}
}
	}

}
