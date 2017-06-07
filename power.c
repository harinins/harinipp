#include<stdio.h>
int main(){
int b,exp,i;
long long power=1;
printf("\nenter base:");
scanf("%d",&b);
printf("\nenter exponent:");
scanf("%d",&exp);
for(i=1;i<=exp;i++)
{
power=power*b;
}
printf("%d ^ %d=%lld",b,exp,power);
}
