#include<stdio.h>
#include<math.h>
int main(){
    float Amount ;
    float p,r,t;
    printf("Enter principal , rate of complex interst and total duration : ");
    scanf("%f %f %f",&p,&r,&t);
    Amount =p*pow((1+(r/100)),t);
    printf("Total amount is :%f",Amount);
    return 0;
}