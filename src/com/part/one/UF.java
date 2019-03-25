package com.part.one;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class UF {
	private int[] id;
	private int count;
	public UF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	public int count() {
		return count;
	}
	// ��� p q ֮��������� �򷵻� true
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	/**
	 * p (0~N-1) ���ڵķ��������ӷ�
	 *  ������� find(p) == find(q) �� �����ӵĴ��� ��Ӧ��ֵ���.
	 * **/	
	public int find(int p) {
		return id[p];
	}
	// p q ֮�����һ������
	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];
		if (pId == qId) return;
		// ������id �������� p ��ȵ�ֵ ��Ҫ�޸�Ϊq 
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pId) id[i] = qId;
		}
		count--;
	}
	public static void main(String[] args) {
		int N = 10;
		UF uf = new UF(N);
		int p = StdIn.readInt();
		int q = StdIn.readInt();
		// �鲢����
		uf.union(p, q);
		// ��ӡ����
		System.out.println(p + " " + q);
	}
}
