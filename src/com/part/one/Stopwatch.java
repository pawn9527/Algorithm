package com.part.one;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Stopwatch {
	private final long start;

	public Stopwatch() {
		start = System.currentTimeMillis();
	}
	
	public static int count(int[] a) {
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				for (int k = j+1; k <N; k++) {
					cnt ++ ;
				}
			}
		}
		return cnt;
	}
	
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
	
	public static void main(String[] args) {
		int N = 1000;
		int [] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = StdRandom.uniform(-100000000, 100000000);
		}
		Stopwatch timer = new Stopwatch();
		int cnt = Stopwatch.count(a);
		double time = timer.elapsedTime();
		StdOut.println(cnt + " triples" + time);
	}
	
}
