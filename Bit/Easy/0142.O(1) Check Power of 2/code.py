# https://www.lintcode.com/problem/o1-check-power-of-2/description
# 由于2的n次幂一定类似于1000，所以这个数字减一就是0111。
# 两个数字and一下，如果是0，那么就是2的n次幂。另外要加上大于0的判断。
class Solution:
    """
    @param n: An integer
    @return: True or false
    """
    def checkPowerOf2(self, n):
        return False

print(Solution().checkPowerOf2(4))