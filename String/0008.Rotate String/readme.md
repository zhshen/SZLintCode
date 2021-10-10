## Description
Given a string of char array and an offset, rotate the string by offset in place. (from left to right).
In different languages, str will be given in different ways. For example, the string "abc" will be given in following ways:
- Java: char[] str = {'a', 'b', 'c'};
- Python：str = ['a', 'b', 'c']
- C++：string str = "abc";
<pre>
offset >= 0
the length of str >= 0
In place means you should change strings in the function. You don't return anything.
</pre>
## Example
### Example 1:
Input:
<pre>
str = "abcdefg"
offset = 3
</pre>
Output:
<pre>
"efgabcd"
</pre>
Explanation:

Note that it is rotated in place, that is, after str is rotated, it becomes "efgabcd".
### Example 2:
Input:
<pre>
str = "abcdefg"
offset = 0
</pre>
Output:
<pre>
"abcdefg"
</pre>
Explanation:

Note that it is rotated in place, that is, after str is rotated, it becomes "abcdefg".

### Example 3:
Input:
<pre>
str = "abcdefg"
offset = 1
</pre>
Output:
<pre>
"gabcdef"
</pre>
Explanation:

Note that it is rotated in place, that is, after str is rotated, it becomes "gabcdef".

### Example 4:
Input:
<pre>
str = "abcdefg"
offset = 2
</pre>
Output:
<pre>
"fgabcde"
</pre>
Explanation:

Note that it is rotated in place, that is, after str is rotated, it becomes "fgabcde".

### Example 5:
Input:
<pre>
str = "abcdefg"
offset = 10
</pre>
Output:
<pre>
"efgabcd"
</pre>
Explanation:

Note that it is rotated in place, that is, after str is rotated, it becomes "efgabcd"..