public class Test4 {
    public static void main(String[] args) {
        int n = 7;

        if(n % 2 == 0)
		/**------->
					Test4.java:5: error: unexpected type
								if(n % 2 = 0) {
									 ^
								required: variable
								found:    value
								1 error -------> */
	// ---> issue :::: That error is caused by using the assignment operator (=) instead of the comparison operator (==) inside your if condition.
			{
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}