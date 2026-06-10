public class Test5 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
		/*------> Test5.java:8: error: cannot find symbol
										System.out.printn(b);
												  ^
										symbol:   method printn(int)
										location: variable out of type PrintStream
										1 error
		*/
    }
}