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
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > Integer.MAX_VALUE % 10)){
                return 0;
            }else if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < Integer.MIN_VALUE % 10)){
                return 0;
            }
            rev = rev * 10 + pop ;
        }
        return (int)rev;
    }
}
// @lc code=end

