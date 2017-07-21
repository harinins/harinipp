#include<stdio.h>
int isSubsetArray(int[] array1, int size1, int[] array2, int size2) {
int i, j;
for (i = 0; i < size2; i++) {
for (j = 0; j < size1; j++) {
if(array2[i] == array1[j])
break;
}
if(j == size1)
return 0;
}
return 1;
}
int main() {
    int array1[9] = {3, 5, 7, 12, 1, 9, 10, 0, 2};
    int array2[4] = {1, 3, 5, 9};
  
    if(isSubsetArray(array1, 9, array2, 4))
      printf("array2 is subset of array1");
    else
      printf("array2 is not a subset of array1");     
  
    return 0;
}
