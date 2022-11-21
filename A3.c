#include<stdio.h>
int main(){
    
        int a,b;
        printf("Enter a: ");
        scanf("%d",&a);
        printf("Enter b: ");// a = 20;b=5;
        scanf("%d",&b);
        a = a-b;//15
        b = a+b;//20
        a = b-a;//5
        printf("After swaping, a=%d\n",a);
        printf("After swaping, b=%d",b);


    return 0;
}