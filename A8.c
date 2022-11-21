#include<stdio.h>
int main(){
    int a,b;
    char ch;
    printf("Enter a : ");
    scanf("%d",&a);
    printf("Enter b : ");
    scanf("%d",&b);
    printf("Enter a operator : ");
    scanf(" %c",&ch);
    switch(ch){
        case '+':printf("The sum of these two numbers is = %d.",a+b);
        break;
        case '-':printf("The value of a-b =%d",a-b);
        break;
        case '*':printf("The product of these two numbers is = %d.",a*b);
        break;
        case '/':printf("The value of a/b = %f.",(float)a/b);
        break;
        default:printf("Invalid operation.");
    }
    return 0;
}