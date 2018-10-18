/*
print pattern 
*
* *
* * * 
* * * *
*/
#include<iostream>
using namespace std;

void printPatt(int n)
{
    //write your code here
  int i,j;
  for(i=0;i<n;i++)
  {
    for(j=i;j<n;j++)
    {
      cout<<'*';
    }
    cout<<endl;
  }
}

int main(){
int n;
cin>>n;
printPatt(n);
return 0;
}
