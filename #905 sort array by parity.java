class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] even = new int[nums.length];
        int[] odd = new int[nums.length];

        int e = 0, o = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even[e++] = nums[i];
            } else {
                odd[o++] = nums[i];
            }
        }

        int[] ans = new int[nums.length];
        int k = 0;

        for (int i = 0; i < e; i++) {
            ans[k++] = even[i];
        }

        for (int i = 0; i < o; i++) {
            ans[k++] = odd[i];
        }

        return ans;
    }
}
