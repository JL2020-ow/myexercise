import jdk.tools.jlink.internal.plugins.ExcludePlugin;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
   public int[] twoSum(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
               return new int[] { i, j };
            }
         }
      }
      try {
         throw new Exception("No such sum soultion");
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return null;
   }
}
// @lc code=end
