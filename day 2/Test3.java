public class Test3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
			/** Test3.java:3: error: ';' expected
							for(int i = 1; i <= 5 i++) {
												^
						1 error */
            System.out.println(i);
        }
    }
}