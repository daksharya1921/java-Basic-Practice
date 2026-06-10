public class Test6 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;

        //for(int i = 0; i <= arr.length; i++) {
		for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}

// its got compile properly but in runtime its throwing error
/* C:\Batch\Kodewala 1 june batch Practice\day 2>javac Test6.java

	C:\Batch\Kodewala 1 june batch Practice\day 2>java Test6
				Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
					at Test6.main(Test6.java:7)
*/
//--> to fix this issues 
/*   Your array length is 5 → valid indices are 0, 1, 2, 3, 4.

   You tried to access index 5, which is outside the valid range.

		The JVM immediately throws ArrayIndexOutOfBoundsException.
		
		for(int i = 0; i <= arr.length; i++) {
			
			should be 
			for(int i = 0; i < arr.length; i++) {
				
				because its trying to access it 6 index to 
*/