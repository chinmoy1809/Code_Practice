#include<stdio.h>
#include<math.h>
int main(){
    int sum = 0;
    for(int i=1;i<=5;i++){
        sum += pow(i,i);
    }
    printf("The value Y is : %d.",sum);
    return 0;
}