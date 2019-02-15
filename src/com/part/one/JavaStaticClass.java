package com.part.one;

public class JavaStaticClass {
	
	public static int abs(int x) {
		if(x < 0) return -x;
		else return x;
	}
	public static double abs(double x) {
		if (x < 0.0) return -x;
		else return x;
	}
	public static boolean isPrime(int n) {
		if (n< 2) return true;
		for(int i=2; i*i <n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static double sqrt(double c) {
		if(c<0) return Double.NaN;
		double err=  1e-15;
		double t = c;
		while(Math.abs(t - c/t)> err * t) {
			t = (c/t + t) / 2.0;
		}
		return t;
	}
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a + b*b);
	}
	public static double H(int N) {
		double sum = 0.0;
		for (int i =1; i <= N; i++) {
			sum += 1.0/i;
		}
		return sum;
	}

	public static int rank(int key, int[] a ) {
		return rank(key, a, 0, a.length - 1);
	}
	public static int rank(int key, int[]a , int lo, int hi) {
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) /2 ;
		if (key < a[mid]) return rank(key, a, lo, mid - 1);
		else if (key > a[mid]) return rank(key, a , mid +1, hi);
		else return mid;
	}
	public static void main(String[] args) {
		double sqrtResult = JavaStaticClass.sqrt(1000);
		Boolean isPrime = JavaStaticClass.isPrime(1877);
		double hyotenuse = JavaStaticClass.hypotenuse(6, 8);
		double h = JavaStaticClass.H(100);
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,19,20,199,399,4488};
		int rank = JavaStaticClass.rank(10, a);
		System.out.println(sqrtResult);
		System.out.println(isPrime);
		System.out.println(hyotenuse);
		System.out.println(h);
		System.out.println(rank);
	}
}	
