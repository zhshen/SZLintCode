# https://www.lintcode.com/problem/valid-triangle/description
# 任意两边之和大于第三边，任意两边之差小于第三边。
class Solution:
    """
    @param a: a integer represent the length of one edge
    @param b: a integer represent the length of one edge
    @param c: a integer represent the length of one edge
    @return: whether three edges can form a triangle
    """
    
    def isValidTriangle(self, a, b, c):
        edges = []
        edges.append((a, b, c))
        edges.append((a, c, b))
        edges.append((b, a, c))
        edges.append((b, c, a))
        edges.append((a, c, b))

        result = False

        for i in range(len(edges)):
            result = self.graaterThan(edges[i][0], edges[i][1], edges[i][2]) \
                and self.lessThan(edges[i][0], edges[i][1], edges[i][2])
            
            if result == False:
                break

        return result

    def graaterThan(self, e1, e2, e3):
        return e1 + e2 > e3
    
    def lessThan(self, e1, e2, e3):
        return e1 - e2 < e3

print(Solution().isValidTriangle(6, 6, 6))