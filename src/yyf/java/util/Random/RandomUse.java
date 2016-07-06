package yyf.java.util.Random;

import java.util.Random;

import org.junit.Test;

public class RandomUse {
	@Test
	public void test() {
		System.out.println("Random.test()");
	}
	/**
	 * 从数组中获取随即数
	 */
	@Test
	public void testGetFromArray() {
		Random random = new Random();
		String[] array = new String[]{"aaa","bbb","ccc"};
		for(int i = 0;i<10;i++){
			int res = random.nextInt(array.length);
			System.out.println(array[res]);
		}
			
	}
}
