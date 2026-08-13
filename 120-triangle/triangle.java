class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        for (int i = 1; i < triangle.size(); i++) {

            for (int j = 0; j < triangle.get(i).size(); j++) {

                int left = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;

                if (j > 0)
                    left = triangle.get(i - 1).get(j - 1);

                if (j < triangle.get(i - 1).size())
                    right = triangle.get(i - 1).get(j);

                triangle.get(i).set(j,
                    triangle.get(i).get(j) + Math.min(left, right));
            }
        }

        return Collections.min(triangle.get(triangle.size() - 1));
    }
}