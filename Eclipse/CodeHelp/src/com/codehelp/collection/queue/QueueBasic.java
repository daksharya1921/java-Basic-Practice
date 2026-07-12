
package com.codehelp.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q =  new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		
		q.offer(40);
		System.out.println("queue: "+q);
		q.poll();
		System.out.println("queue: "+q);
		System.out.println(q.peek());

	}

}
