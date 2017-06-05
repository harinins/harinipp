#include<stdio.h>
int main()
{
int a,b,c;
printf("\nenter the digits");
scanf("%d%d%d",&a,&b,&c);
if(a>b && a>c)
printf("a is greatest");
else if(b>c && b>a)
printf("\n b is greatest");
else
printf("\n c is greatest");
}
