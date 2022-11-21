#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c,d;
    float r1,r2;
    printf("Enter a: ");
    scanf("%d",&a);
    printf("Enter b: ");
    scanf("%d",&b);
    printf("Enter c: ");
    scanf("%d",&c);
    if(a!=0){
        d= b*b -4*a*c;
        if(d==0){
            r1=r2 = -b/(2*a) ;
            printf("Roots of the Quadratic Equations is equal and roots are  %f and %f",r1,r2);
        }else if(d>0){
            r1= (-b+sqrt(d))/(2*a);
            r2= (-b-sqrt(d))/(2*a);
            printf("Roots of the Quadratic Equations is real & unequal and roots are  %f and %f",r1,r2);
        }else{
            printf("Roots are imaginary");
        }
    }else{
        printf("This is not a Quadratic Equation.");
    }
    return 0;
}