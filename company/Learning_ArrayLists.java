package com.company;

import java.util.*;

public class Learning_ArrayLists {

    public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(23);
		arr.add(64);
		arr.add(33);
		arr.add(96);
//		System.out.println(arr);
//		LinkedList<Integer> l = new LinkedList<>();
//		l.add(43);
//		HashMap<Integer, Integer> h = new HashMap<>();
//		h.put(3, 9);
//		h.put(4, 16);
//		h.put(5, 25);
//
//		System.out.println(h);
//		System.out.println(h.isEmpty());
//		System.out.println(h.get(5));
//		System.out.println(h.keySet());

        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.push(8);
        st.push(6);
        st.push(10);
        System.out.println(st);
//        System.out.println(st.pop());
//        System.out.println(st);
        int s = st.search(4);
//        System.out.println(st.contains(4));
        System.out.println(s);
    }

}
