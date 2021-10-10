## Description
Given a string(Given in the way of char array), a right offset and a left offset, move the string according to the given offset and save it in a new result set. (left offest represents the offset of a string to the left,right offest represents the offset of a string to the right,the total offset is calculated from the left offset and the right offset, split two strings at the total offset and swap positions)。
<pre>
offset >= 0
the length of str >= 0
In place means you should change strings in the function. You don't return anything.
</pre>
## Example
### Example 1:
Input:
<pre>
Input：str ="abcdefg", left = 3, right = 1
Output："cdefgab"
</pre>
Output:
<pre>
"cdefgab"
</pre>
Explanation:

Explanation：The left offset is 3, the right offset is 1, and the total offset is left 2. Therefore, the original string moves to the left and becomes "cdefg"+ "ab".
### Example 2:
Input:
<pre>
Input：str="abcdefg", left = 0, right = 0
</pre>
Output:
<pre>
"abcdefg"
</pre>
Explanation:

The left offset is 0, the right offset is 0, and the total offset is 0. So the string remains unchanged.

### Example 3:
Input:
<pre>
str = "abcdefg",left = 1, right = 2
</pre>
Output:
<pre>
"gabcdef"
</pre>
Explanation:

Explanation：The left offset is 1, the right offset is 2, and the total offset is right 1. Therefore, the original string moves to the left and becomes "g" + "abcdef".