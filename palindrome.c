#include<stdio.h>
int main()
{
int n,r,temp,sum=0;
printf("enter a number:");
scanf("%d",&n);
temp=n;
while(n)
{
r=n%10;
n=n/10;
sum=sum*10+r;
}
if(temp==sum)
printf("is palindrome",temp);
else
printf("not palindrome",temp);
}
