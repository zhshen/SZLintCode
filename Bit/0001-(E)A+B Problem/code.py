# https://www.lintcode.com/problem/a-b-problem/description
# 实现A+B加法运算的函数。当然不能直接return a + b。实际是考察电脑本身二进制加法的运算规则。
# 假如a = 3, b= 5。
# a=011
# b=101
# 先将a ^ b，xor操作相当于无进位加法，得到110。然后再求出进位(a & b) << 1，值为10。
# 这个结果是进位的地方都表示为1(and运算，只有都是1才进位)。
# 所以周而复始再和110 xor，周而复始，直到a & b << 1都是零。
# Python有其特殊性。Java或者C++，C#的32位整数左移到最高位后，不会越界。而Python会，所以会有特殊处理
class Solution:
    MAX_BIT = 2**32
    MAX_BIT_COMPLIMENT = -2**32
    
    def aplusb(self, a, b):
        if b == 0:
            return a ^ b
        
        if b == self.MAX_BIT:
            return a ^ self.MAX_BIT_COMPLIMENT

        return self.aplusb(a ^ b, (a & b) << 1)

print(Solution().aplusb(-1, 1))