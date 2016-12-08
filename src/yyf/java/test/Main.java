package yyf.java.test;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		System.out.println(10 & 1);
	}
}
/**
 * 1. 判断int型变量a是奇数还是偶数 a&1 = 0 偶数 a&1 = 1 奇数 2.
 * 求平均值，比如有两个int类型变量x、y,首先要求x+y的和，再除以2，但是有可能x+y的结果会超过int的最大表示范围，所以位运算就派上用场啦。
 * (x&y)+((x^y)>>1); 3. 对于一个大于0的整数，判断它是不是2的几次方 ((x&(x-1))==0)&&(x!=0)；
 * 4.比如有两个int类型变量x、y,要求两者数字交换，位运算的实现方法：性能绝对高效 x ^= y; y ^= x; x ^= y; 5. 求绝对值
 * int abs( int x ) { int y ; y = x >> 31 ; return (x^y)-y ; //or: (x+y)^y }
 * 6.取模运算，采用位运算实现： a % (2^n) 等价于 a & (2^n - 1) 7. 乘法运算 采用位运算实现 a * (2^n) 等价于 a
 * << n 8. 除法运算转化成位运算 a / (2^n) 等价于 a>> n 9. 求相反数 (~x+1) 10 a % 2 等价于 a & 1
 */
