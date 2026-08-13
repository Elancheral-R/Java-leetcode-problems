class Solution {
    public int hammingDistance(int x, int y) {
        int cnt=0;
        int mask=1;
        for(int i=1;i<=32;i++){
            if((mask&x)!=(mask&y)){
                cnt++;
            }
            mask<<=1;
        }

        return cnt;
    }
}