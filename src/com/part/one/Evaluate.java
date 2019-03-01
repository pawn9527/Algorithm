package com.part.one;

import java.util.Stack;

import edu.princeton.cs.introcs.StdOut;

public class Evaluate {
	public static void main(String[] args) {
		String EvaluateString = "(1+((2+3)*(4*5)))";
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		for(int i=0; i<EvaluateString.length(); i++) {
			// 读取字符串，如果是运算符则压入栈
			String s =Character.toString(EvaluateString.charAt(i));
			if(s.equals("("));
			else if(s.equals("+")) ops.push(s);
			else if(s.equals("-")) ops.push(s);
			else if(s.equals("*")) ops.push(s);
			else if(s.equals("/")) ops.push(s);
			else if(s.equals("sqrt")) ops.push(s);
			else if(s.equals(")")) {
				// 如果字符串为 “)” 弹出运算符和操作符，计算结果压入栈
				String op = ops.pop();
				double v = vals.pop();
				if (op.equals("+"))  v = vals.pop() + v;
				else if (op.equals("-"))  v = vals.pop() - v;
				else if (op.equals("*"))  v = vals.pop() * v;
				else if (op.equals("/"))  v = vals.pop() / v;
				else if (op.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
		StdOut.println(vals.pop());
	}
}
