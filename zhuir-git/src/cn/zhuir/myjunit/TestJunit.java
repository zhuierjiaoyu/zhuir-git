
package cn.zhuir.myjunit;

import org.junit.Test;

public class TestJunit {
	
	/*
	 * 求1～10之间的和
	 */
	@Test
	public void qiuHe(){
		int sum = 0;
		for(int i=1;i<=10;i++){
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	
	public TestJunit(){
		qiuHe();
	}

	public static void main(String[] args) {
		new TestJunit();

	}

}
