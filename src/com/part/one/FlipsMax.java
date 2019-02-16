package com.part.one;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class FlipsMax {
	public static Counter max(Counter x, Counter y) {
		if(x.tally() > y.tally()) 
			return x; 
		else 
			return y;
	}
	public static void main(String[] args) {
		int T = 10000000;
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		for (int i = 0; i < T; i++) {
			if(StdRandom.bernoulli(0.5)) {
				heads.increment();
			}else {
				tails.increment();
			}
		}
		if(heads.tally() == tails.tally()) {
			StdOut.println("Tie");
		}else {
			StdOut.println(max(heads, tails) + " wins");
		}
	}
}
