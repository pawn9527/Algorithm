package com.part.one;


import edu.princeton.cs.introcs.StdRandom;

public class fuck {
    // 随机返回[a,b) 之间的一个 double值
    private static double uniform(double a, double b) {
        return a + StdRandom.random() * (b - a);

    }

    private static int intUniform(int N) {
        return (int) (StdRandom.random() * N);
    }

    // 根据离散概率随机返回的int值 (出现i的概率为a[i])
    private static int discrete(double[] a) {
        // a [] 中的所有元素之和必须是1
        double r = StdRandom.random();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum > r) return i;
        }
        return -1;
    }

    // 随机将 double 数组中的元素排序.
    private static void shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = i + StdRandom.uniform(N - 1);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {
        double uniform = uniform(1, 100);
        int intUniform = intUniform(1000);
        System.out.println(uniform);
        System.out.println(intUniform);
        double[] a = {0.1, 0.2, 0.3, 0.4};
        System.out.println(discrete(a));
        double[] y =  {1.2, 1.6, 1.7, 1.8, 1.9, 50.5};
        fuck.shuffle(y);
        System.out.println(y);

    }
}
