/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        //-2147483647 2147483648
        int rev = 0;
        while(x != 0){
            int pop = x % 10;
            rev = rev * 10 + pop ;
            x /= 10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)rev;
    }
}
// @lc code=end

