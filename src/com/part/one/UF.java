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
	// 如果 p q 之间存在连线 则返回 true
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	/**
	 * p (0~N-1) 所在的分量的链接符
	 *  如果链接 find(p) == find(q) 则 所连接的触点 对应的值相等.
	 * **/	
	public int find(int p) {
		return id[p];
	}
	// p q 之间添加一个连线
	public void union(int p, int q) {
		int pId = id[p];
		int qId = id[q];
		if (pId == qId) return;
		// 将所有id 中所有与 p 相等的值 都要修改为q 
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
		// 归并分量
		uf.union(p, q);
		// 打印链接
		System.out.println(p + " " + q);
	}
}
