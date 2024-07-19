#include <stdio.h>

int minimizeSet(int, int ,int ,int);

int main()
{
    int divisor1, divisor2, uniqueCnt1, uniqueCnt2, ans;
    scanf("%d",&divisor1);
    scanf("%d",&divisor2);
    scanf("%d",&uniqueCnt1);
    scanf("%d",&uniqueCnt2);

    ans = minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
}


int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) 
{
    int arr1[10], arr2[10], c, index=0;

    for(int i=0;i<=uniqueCnt1;i++)
    {
        while (c<=uniqueCnt1)
        {
            if((i%divisor1)!=0)
            {
            arr1[index]=i;
            c++;
            index++;
            }
        }
    }
    for(index=0;index<=uniqueCnt1;index++)
    {
        printf(" %d ",arr1[index]);
    }
    return 0;
}