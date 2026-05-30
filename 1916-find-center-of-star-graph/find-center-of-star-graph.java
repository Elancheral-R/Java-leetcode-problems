class Solution {
    public int findCenter(int[][] edges) 
    {
        if(edges.length == 2)
            return 3;

        int fcount=0;
        int scount=0;
        int curr[]={0,0};
        for(int arr[]:edges)
        {
            int a=arr[0];
            int b=arr[1];
            if( a == curr[0] || b == curr[0])
                fcount++;
            else if (a == curr[1] || b == curr[1])
                scount++;
            else if (a != curr[0] || a != curr[1])
            {
                curr[0]=a;
                fcount=1;
            }
            else
            {
                curr[1]=b;
                scount=1;
            }
        }
        if(fcount>scount)
        {
            if(curr[0] == 99999)
                return ++curr[0];
            return curr[0];
        }
        
        return curr[1];
    }
}