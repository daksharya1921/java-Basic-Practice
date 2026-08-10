package com.test.week9;

class Parent {

	static int x = init();

	static int init() {
		System.out.print("S ");
		return 10;
	}

	{
		System.out.print("I1 ");
	}

	Parent() {

		System.out.print(test() + " ");

	}

	Number test() {

		try {

			System.out.print("PT ");

			return x;

		} finally {

			System.out.print("PF ");

		}

	}

}

class Child extends Parent {

	Integer value = 50;

	{
		System.out.print("I2 ");
	}

	Child() {

		System.out.print("C ");

	}

	@Override
	Integer test() {

		try {

			System.out.print("CT ");

			return value;

		} finally {

			System.out.print("CF ");

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		new Child();

	}

}