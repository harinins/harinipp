import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int a=s.nextInt();
		int[] nums=new int[k];
		for(int i=0;i<k;i++){
			nums[i]=s.nextInt();
		}
for(int i=a+1;i<k;i++){
	System.out.print(nums[i]+" ");
}
for(int i=0;i<=a;i++){
	System.out.print(nums[i]+" ");
		/*if(k > nums.length)
			k=k%nums.length;
			int[] result = new int[nums.length];
			for(int i=0; i < k; i++){
			 result[i] = nums[nums.length-k+i];
			}
			int j=0;
			for(int i=k; i<nums.length; i++){
			result[i] = nums[j];
			j++;
			}
			System.arraycopy( result, 0, nums, 0, nums.length );
			}
	}*/

}}}
