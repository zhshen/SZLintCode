## Description
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
<pre>
(0,8),(8,10) is not conflict at 8
</pre>
## Example
### Example 1:
<pre>
Input: intervals = [(0,30),(5,10),(15,20)]
Output: false
Explanation: 
(0,30), (5,10) and (0,30),(15,20) will conflict
</pre>
### Example 2:
<pre>
Input: intervals = [(5,8),(9,15)]
Output: true
Explanation: 
Two times will not conflict
</pre>
