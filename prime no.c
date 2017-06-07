#include<stdio.h>
int main(){
int n,i,c=0;
printf("enter a no:");
scanf("%d",&n);
for(i=2;i<=n/2;i++)
{
if(n%i==0)
{
c++;
break;
}}
if(c==0 && n!=1)
printf("%d is a prime no",n);
else
printf("%d is not a prime no",n);
return 0;
}
