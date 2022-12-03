class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }       
        return null;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] anums = {2,7,11,15};
        int[] r = s.twoSum(anums, 9);

        System.out.println( "["+ r[0] +","+ r[1] +"]" );
    }
    
}