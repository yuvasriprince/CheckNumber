#include <stdio.h>
int main(){
    int A;
    printf("enter the number");
    scanf("%d",&A);
    if(A>0)
       printf("the value is positive");
    else if(A<0)
       printf("the value is negative");
    else if(A==0)
       printf("the value is equal to zero");
    return 0;
}