#include<stdio.h>

int main(){
    int a;
    float b;
    char c;
    double d;

    printf("Enter a integer value : ");
    scanf("%d", &a);
    
    printf("Enter a float value,character : ");
    scanf("%f %c", &b,&c);

    printf("Enter a double value : ");
    scanf("%lf", &d);

    printf("Size of MCKVIE=%d\n",sizeof("MCKVIE"));

    printf("Values are : a=%d , b=%f , x=%c , d=%lf.\n",a,b,c,d);
    printf("In address of a=%p ,b=%p ,c=%p ,d=%p\n",&a,&b,&c,&d);
    printf("In size of a=%d,b=%d,c=%d,d=%d",sizeof(a),sizeof b,sizeof(c),sizeof d);

    return 0;
}