
#include<iostream>
using namespace std;

int NWD(int a, int b)
{
    while(a!=b)
       if(a>b)
           a-=b; 
       else
           b-=a; 
    return a; 
}

int main()
{
    int arrays;
    cin>>arrays;
    int num1[arrays];
    int num2[arrays];
    for(int i = 0; i < sizeof(num1);i++){
    cin>>num1[i]>>num2[i];
    }
    for(int i = 0; i < sizeof(num1);i++){
    cout<<NWD(num1[i],num2[i])<<endl;
    }

   
    return 0;
}
