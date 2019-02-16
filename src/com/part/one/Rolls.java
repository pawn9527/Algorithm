package com.part.one;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Rolls {
	public static void main(String[] args) {
		int T = 100000;
		int SIDES = 6;
		Counter [] rolls = new Counter[SIDES+1];
		// 创建筛子的6个数字的计数器对象
		for (int i = 1; i <= SIDES; i++) {
			rolls[i] = new Counter(i + "s");
		}
		// 随机抽取, 给抽到的计数器++
		for (int i = 0; i < T; i++) {
			int result = StdRandom.uniform(1, SIDES+1);
			rolls[result].increment();
		}
		// 打印每个对象
		for (int i = 1; i <=SIDES; i++) {
			StdOut.println(rolls[i]);
		}
	}
}
