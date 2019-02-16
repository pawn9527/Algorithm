package com.part.one;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Rolls {
	public static void main(String[] args) {
		int T = 100000;
		int SIDES = 6;
		Counter [] rolls = new Counter[SIDES+1];
		// ����ɸ�ӵ�6�����ֵļ���������
		for (int i = 1; i <= SIDES; i++) {
			rolls[i] = new Counter(i + "s");
		}
		// �����ȡ, ���鵽�ļ�����++
		for (int i = 0; i < T; i++) {
			int result = StdRandom.uniform(1, SIDES+1);
			rolls[result].increment();
		}
		// ��ӡÿ������
		for (int i = 1; i <=SIDES; i++) {
			StdOut.println(rolls[i]);
		}
	}
}
