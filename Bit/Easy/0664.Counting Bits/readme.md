## Description
    Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

## Example
### Example1
    Input: 5
    Output: [0,1,1,2,1,2]
    Explanation:
    The binary representation of 0~5 is:
    000
    001
    010
    011
    100
    101
    the count of "1" in each number is: 0,1,1,2,1,2
### Example2
    Input: 3
    Output: [0,1,1,2]
## Challenge
1. It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
2. Space complexity should be O(n).
3. Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.