# https://www.lintcode.com/problem/count-1-in-binary/description
# Brian Kernighan 算法的思想就是，当n不等于0时（n=0直接返回0），每一次 n & ( n - 1 ) 操作，都去掉一个最低位的有效位。
# 通俗讲就是去掉最右边的一个1。所以n&(n-1)，多少次变成0，就是有多少个1。
class Solution:
    """
    @param: num: An integer
    @return: An integer
    """
    def countOnes(self, num):
        return 0

print(Solution().countOnes(4))