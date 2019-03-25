package com.part.one;

public class WeightedQuickUnionUF {
	private int [] id;
	private int count;
	private int [] sz;  // �����ڵ�����Ӧ�ķ����Ĵ�С
	public WeightedQuickUnionUF(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
		sz = new int[N];
		for (int i = 0; i < id.length; i++) {
			sz[i] = i;
		}
	}
	public int count() {
		return count;
	}
	public int find(int p) {
		// ���������ҵ����ڵ�
		while(p != id[p]) {
			p = id[p];
		}
		return p;
	}
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	public void union(int p, int q) {
		int i = id[p];
		int j = id[q];
		if(i==j) return;
		// ��С���Ľڵ�󶨵�����Ľڵ���
		if(sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		}else {
			id[j] = i;
			sz[i] += sz[j];
		}
		count--;
	}
}
