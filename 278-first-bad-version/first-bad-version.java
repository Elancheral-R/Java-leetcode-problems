/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long a=1,b=n,m;
        while(a<=b){
            m=(a+b)/2;
            if(isBadVersion((int)m)==true){
                if(m==0 || isBadVersion((int)(m-1))==false)return (int)m;
                b=m-1;
            }else a=m+1;
            System.out.println(m);
        }
        return -1;
    }
}