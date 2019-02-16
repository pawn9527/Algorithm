package com.part.one;

import java.util.Comparator;

public class Interval1D {
	public static final Comparator<Interval1D> MIN_ENDPOINT_ORDER = new MinEndpointComparator();
	public static final Comparator<Interval1D> MAX_ENDPOINT_ORDER = new MaxEndpointComparator();
	
	public static final Comparator<Interval1D> LENGTH_ORDER = new LengthComparator();
	
	
	private final double min;
	private final double max;
	
	public Interval1D(double min, double max) {
		if(Double.isInfinite(min) || Double.isInfinite(max)) {
			throw new IllegalAccessException("Endopints must be finite");
		}
		if(Double.isNaN(min) || Double.isNaN(max)) {
			throw new IllegalArgumentException("Endopints connot be NaN");
		}
		if(min==0.0) min = 0.0;
		if(max==0.0) min = 0.0;
		
	}
	
	
	private class MinEndpointComparator implements Comparator<Interval1D>{

		@Override
		public int compare(Interval1D o1, Interval1D o2) {
			return 0;
		}
		
	}
	
	private class MaxEndpointComparator implements Comparator<Interval1D>{
		
		@Override
		public int compare(Interval1D o1, Interval1D o2) {
			return 0;
		}
		
	}
}


