package com.part.one;

import edu.princeton.cs.introcs.StdOut;

public class Exercise {
	private void one() {
		System.out.println((0 + 15) / 2);
		System.out.println(2.0e-6 * 10000000.1);
		System.out.println(true && false || true && true);
	}
	private void two() {
		System.out.println((1 + 2.236)/ 2);  // double
		System.out.println(1 + 2 + 3 +4.0);  //  double
		System.out.println(4.1 >= 4); // Boolean 
		System.out.println(1 + 2+ "3"); // String
	}
	private String tree(int num1, int num2, int num3) {
		if((num1 == num2) && (num1 == num3)){
			return "equal";
		}else {
			return "not equal";
		}
	}
	private void four() {
		int a, b;
//		if(a> b) then c= 0; error
//		if a > b {c = 0}; error
//		if (a > b) c =0; error
//		if(a > b) c =0 else b = 0; error
	}
	private Boolean five(double a, double b) {
		// TODO Auto-generated method stub
		if((0<a && a<1) && (0<b && b<1)) {
			return true;
		}else {
			return false;
		}
	}
//	斐波那契数列
	private void six() {
		int f = 0;
		int g = 1;
		for (int i = 0; i <=15; i++) {
			StdOut.println(f);
			f =  g + f;
			g = f - g;
		}

	}
	private void seven() {
		double t = 9.0;
		while(Math.abs(t - 9.0/t) > .001)
			t = (9.0 / t + t) / 2.0;
		// 根号9的感觉
		StdOut.printf("%.5f\n", t);
		// 1 + .... + 1000		
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum ++;
			}
		}
		StdOut.println(sum);
		// 当2!< 1000的个数的 1000被	
		int sum_2 = 0;
		for (int i = 1; i < 1000; i*=2) {
			for (int j = 0; j < 1000; j++) {
				sum_2 ++;				
			}
		}
		StdOut.println(sum_2);
	}
	private void eight() {
		System.out.println('b');
		// b 和 c 的 对应的数字之和
		System.out.println('b' + 'c');
		// 'a' + 4 = 101  char 转化为 e
		System.out.println((char)('a' + 4));
	}
	private String nine(int N) {
		String s = "";
		for(int n=N; n>0; n/=2)
			s = (n % 2) + s;
//		s = Integer.toBinaryString(N);
		return s;
	}
	private void eleven(char[][] boolList) {
		for (int i = 0; i < boolList.length; i++) {
			for (int j = 0; j < boolList[i].length; j++) {
				Boolean result = false;
				if (boolList[i][j] == (char)('*'))
					result = true;
				System.out.println("行号:" + i + ";" + "列号" + j + ";" + "值为:" + result);
			}
		}
	}
	private void twelve() {
		int [] a = new int[10];
		// [9, 8 ... 1, 0]
		for (int i = 0; i < 10; i++) {
			a[i] = 9 - i;
		}
		// [0，1，2，3，4，4，3，2，1，0]
		// 因为前面已经赋值， 前半部分已经赋值。
		for (int i = 0; i < 10; i++) {
			a[i] = a[a[i]];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}
	private Object thirteen(int[][] T) {
		int[][] copyT = new int [2][2];
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T[i].length; j++) {
				copyT[i][j] = T[j][i];
			}
		}
		return copyT;
	}
	private int fourteen(int N) {
		int i = 1;
		int maxI = i;
		while(true) {
			int pow = 1;
			for (int j = 1; j <= i; j++) {
				pow *= 2;
			}
			if (pow <= N)
				maxI = i;
			else
				return maxI;
			i++;
		}
	}
//	private Integer StringToInteger(String number) {
//		return Integer.parseInt(number);
//	}
	public static void main(String[] args) {
		Exercise exercise = new Exercise();
		System.out.println("======one=======");
		exercise.one();
		System.out.println("======two=======");
		exercise.two();
		System.out.println("======three=======");
//		System.out.println(exercise.tree(
//				exercise.StringToInteger(args[0]),
//				exercise.StringToInteger(args[1]),
//				exercise.StringToInteger(args[2]))
//		);
		System.out.println("======five=======");
		System.out.println(exercise.five(0.1, 0.5));
		System.out.println("======six=======");
		exercise.six();
		System.out.println("======seven=======");
		exercise.seven();
		System.out.println("======eight=======");
		exercise.eight();
		System.out.println("======nine=======");
		System.out.println(exercise.nine(100));
		System.out.println("======eleven=======");
		char [][] boolList = new char[2][2];
		boolList[0][0] = '*';
		boolList[0][1] = ' ';
		boolList[1][0] = ' ';
		boolList[1][1] = '*';
		exercise.eleven(boolList);
		System.out.println("======twelve=======");
		exercise.twelve();
		System.out.println("======thirteen=======");
		int [][] T = new int[2][2];
		T[0][0] = 1;
		T[0][1] = 2;
		T[1][0] = 3;
		T[1][1] = 4;
		int[][] copyT = (int[][]) exercise.thirteen(T);
		System.out.println(copyT[0][0]);
		System.out.println(copyT[0][1]);
		System.out.println(copyT[1][0]);
		System.out.println(copyT[1][1]);
		System.out.println("======fourteen=======");
		int maxI = exercise.fourteen(16);
		System.out.println(maxI);
		
		
		
	}
}
