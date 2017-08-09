import java.util.Scanner;

public class Singleappearance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String str[]=s.split(",");
		int i=0;
		String out="";
		String a="";
		int count=0;
		for(i=0;i<str.length;i++){
			for(int j=0;j<str.length;j++)
				if(Integer.parseInt(str[i])==Integer.parseInt(str[j]))
					count=count+1;	
			if(count==1)
				out=out+str[i]+" ";
			count=0;
		}
		System.out.println(out);
		}
	}

