package com.part.one;

import java.util.Arrays;
import java.util.Comparator;

import edu.princeton.cs.introcs.StdOut;

public class Interval1D {
	public static final Comparator<Interval1D> MIN_ENDPOINT_ORDER = new MinEndpointComparator();
	public static final Comparator<Interval1D> MAX_ENDPOINT_ORDER = new MaxEndpointComparator();
	
	public static final Comparator<Interval1D> LENGTH_ORDER = new LengthComparator();
	
	
	private final double min;
	private final double max;
	
	public Interval1D(double min, double max) throws IllegalAccessException {
		if(Double.isInfinite(min) || Double.isInfinite(max)) {
			throw new IllegalAccessException("Endopints must be finite");
		}
		if(Double.isNaN(min) || Double.isNaN(max)) {
			throw new IllegalArgumentException("Endopints connot be NaN");
		}
		if(min==0.0) min = 0.0;
		if(max==0.0) min = 0.0;
		if(min <= max) {
			this.min = min;
			this.max = max;
		}else {
			throw new IllegalAccessException("Illegal interval");
		}
		
	}
	
	@Deprecated
	public double left() {
		return min;
	}
	
	@Deprecated
	public double right() {
		return max;
	}
	
	public double min() {
		return min;
	}
	
	public double max() {
		return max;
	}
	public boolean intersects(Interval1D that) {
		if(this.max < that.min) return false;
		if(that.max < this.min) return false;
		return true;
	}
	
	public boolean contains(double x) {
		return (min <= x) && (x <= max);
	}
	
	public double length() {
		return max - min;
	}
	
	public String toString() {
		return "[" + min + "," + "]";
	}
	
	public boolean equals(Object other) {
		if(other == this) return true;
		if(other == null) return false;
		if(other.getClass() != this.getClass()) return false;
		Interval1D that = (Interval1D) other;
		return this.min == that.min && this.max == that.max;
	}
	
	public int hashCode() {
		int hash1 = ((Double)min).hashCode();
		int hash2 = ((Double)max).hashCode();
		return 31*hash1 + hash2;
	}
	
	private static class MinEndpointComparator implements Comparator<Interval1D> {
		public int compare(Interval1D a, Interval1D b) {
			if (a.min < b.min) return -1;
			else if (a.min > b.min) return +1;
			else if (a.max < b.max) return -1;
			else if (a.max > b.max) return +1;
			else return 0;
		}
	}
	
    // ascending order of max endpoint, breaking ties by min endpoint
    private static class MaxEndpointComparator implements Comparator<Interval1D> {
        public int compare(Interval1D a, Interval1D b) {
            if      (a.max < b.max) return -1;
            else if (a.max > b.max) return +1;
            else if (a.min < b.min) return -1;
            else if (a.min > b.min) return +1;
            else                    return  0;
        }
    }

    // ascending order of length
    private static class LengthComparator implements Comparator<Interval1D> {
        public int compare(Interval1D a, Interval1D b) {
            double alen = a.length();
            double blen = b.length();
            if      (alen < blen) return -1;
            else if (alen > blen) return +1;
            else                  return  0;
        }
    }
    
    
    public static void main(String[] args) throws IllegalAccessException {
		Interval1D [] intervals = new Interval1D[4];
		intervals[0] = new Interval1D(15.0, 33.0);
		intervals[1] = new Interval1D(45.0, 60.0);
		intervals[2] = new Interval1D(20.0, 70.0);
		intervals[3] = new Interval1D(46.0, 55.0);
		StdOut.println("Unsorted");
		for (int i = 0; i < intervals.length; i++) {
			StdOut.println(intervals[i]);
		}
		StdOut.println();
		
		StdOut.println("Sort by max endpoint");
		Arrays.sort(intervals, Interval1D.MAX_ENDPOINT_ORDER);
		for (int i = 0; i < intervals.length; i++) {
			StdOut.println(intervals[i]);
		}
		StdOut.println();
		StdOut.println("Sort by length");
		for (int i = 0; i < intervals.length; i++) {
			StdOut.println(intervals[i]);
		}
		StdOut.println();
	}
}


