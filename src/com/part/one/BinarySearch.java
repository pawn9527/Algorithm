package com.part.one;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int a[]){
        // 二分法必须进行排序
        int flag = 0;
        int hi = a.length - flag;
        while (flag <= hi){
            int mid = flag + (hi - flag )/2;
            if (key < a [mid]) hi = mid - 1;
            else if (key > a[mid]) flag = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key, whiteList) < 0){
                StdOut.println(key);
            }
        }
    }
}
