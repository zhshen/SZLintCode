贪心算法和双指针。
与两个sorted array合并不同的是，在比较两个元素之后，还要和结果集的最后一个元素进行判断是否合并，还是添加。
所以本题需要若干辅助函数：
- compare两个Interval，返回-1(小于), 0(相交)，1(大于)。
- merge两个Interval。
- addOrMerge一个Interval到list。