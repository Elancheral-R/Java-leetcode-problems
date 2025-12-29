class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[2];
        int ind=0;
        for(int num : nums)
        {
            if(list.contains(num))
                arr[ind++]=num;
            else
                list.add(num);
            if(ind == 2)
                return arr;
        }
        return arr;
    }
}