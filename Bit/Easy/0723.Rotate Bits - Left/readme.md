## Description
Bit Rotation -—— A rotation (or circular shift) is an operation similar to shift except that the bits that fall off at one end are put back to the other end.

In left rotation, the bits that fall off at left end are put back at right end.

Let n is stored using 8 bits. Left rotation of n = 　11100101 by 3 makes n = 00101111 (Left shifted by 3 and first 3 bits are put back in last ). If n is stored using 16 bits or 32 bits then left rotation of n (000…11100101) becomes 00..0011100101000.

In this problem, you can assume that n was stored in 32 Bits

## Example
### Example1
    Input: n = 123, d = 4
    Output: 1968
    Explanation: 
    0000,0000,0000,0000,0000,0000,0111,1010  -->  0000,0000,0000,0000,0000,0111,1010,0000
### Example2
    Input: n = 127, d = 8
    Output: 32512
    Explanation: 
    0000,0000,0000,0000,0000,0000,1111,1111  -->  0000,0000,0000,0000,1111,1111,0000,0000