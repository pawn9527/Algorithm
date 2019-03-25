package com.part.one;

public class WeightedQuickUnionUF {
	private int [] id;
	private int count;
	private int [] sz;  // 各个节点所对应的分量的大小
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
		// 跟随链接找到跟节点
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
		// 将小树的节点绑定到大叔的节点上
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
