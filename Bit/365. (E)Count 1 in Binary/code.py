# https://www.lintcode.com/problem/count-1-in-binary/description
# 判断一个整数中有多少个二进制的1。要求是O(1)，所以肯定不能用循环去找1的个数。
# 由于2的n次幂一定类似于1000，所以这个数字减一就是0111。
# 两个数字and一下，如果是0，那么就是2的n次幂。另外要加上大于0的判断。
class Solution:
    """
    @param: num: An integer
    @return: An integer
    """
    def countOnes(self, num):
        return 0

print(Solution().countOnes(4))