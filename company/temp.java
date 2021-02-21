package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Collections;

public class temp {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();


	}

	
	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i] = l.get(i);
	}


	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		
		float nextFloat() { 
			return Float.parseFloat(next());
		}
		
		
		float[] readFloatArray(int n) {
			float[] a = new float[n];
			for (int i=0; i<n; i++) a[i] = nextFloat();
			return a;
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] readDoubleArray(int n) {
			double[] a = new double[n];
			for (int i = 0; i < a.length; i++) a[i] = nextDouble();
			return a;
		}
		
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i=0; i<n; i++) a[i] = nextLong();
			return a;
		}


		
	}

}
