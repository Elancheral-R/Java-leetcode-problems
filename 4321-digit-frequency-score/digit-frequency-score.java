class Solution {
    public int digitFrequencyScore(int n) 
    {
        int arr[]  = new int[10];
        while(n>0)
        {
            int temp=n%10;
            arr[temp]++;
            n=n/10;
        }    
        int sum=0;
        for(int i=1;i<arr.length;i++)
            sum+=(i*arr[i]);
        return sum;
    }
}