#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c;
    int max,min;
    printf("Enter a : ");
    scanf("%d",&a);
    printf("Enter b : ");
    scanf("%d",&b);
    printf("Enter c : ");
    scanf("%d",&c);
    max = ((a>b)?((a>c)?a:c):(b>c)?b:c);
    min = ((a<b)?((a<c)?a:c):(b<c)?b:c);
    printf("The Maximum value is %d.\n",max);
    printf("The Minimum value is %d.",min);
    return 0;
}