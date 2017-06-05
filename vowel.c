#include<stdio.h>
int main()
{char c;
int low,high;
printf("\nenter alphabet");
scanf("%c",&c);
low=(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
high=(c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
if(low || high)
printf("\n enter character is vowel");
else
printf("\n enter it is consonant");
}
