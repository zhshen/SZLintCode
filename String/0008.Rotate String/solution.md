首先要正确理解Offset。
Offset是循环右移几位，例如：

"abcd", offset=1，完成后是"dabc"。循环右移了1位。

所以关键点是找到旋转的位置，就是str.length - offset。为了保证不越界，可以是：

point = str.length - offset % str.length;

然后按照rotate的标准逻辑进行三次旋转。
reverse(str, 0, point - 1);
reverse(str, point, str.length - 1);
reverse(str, 0, str.length - 1);