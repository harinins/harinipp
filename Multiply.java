class Multiplication{
public static void main(String[] args){
int n;
System.out.println("Enter number");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.println(" " + i*j +" ");
}
System.out.println("\n");
}
}
}
