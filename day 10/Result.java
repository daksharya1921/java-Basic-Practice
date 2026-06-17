/* Question 2: Student Result Processing (char Return Type)
Logic
Marks >= 90 → A
Marks >= 75 → B
Marks >= 60 → C
Else D
Method Flow
processResult()
    |
    --> calculateTotal()
    --> calculateAverage()
    --> assignGrade()
    --> printReport()
	
	*/
	
	class Result // class name of the question 
	{
		static String printReport(String name){
			
			
			
			return name;
			
		}
	
		static char assignGrade(double avg){
			/*	Marks >= 90 → A
				Marks >= 75 → B
				Marks >= 60 → C
				Else D
				*/
			if (avg >= 90)	return 'A';
			else if(avg >= 75)	return 'B';
			
			else if(avg >= 60) return 'C';
			
			else  return 'D';
			
			/* this method will excute first */
			
		
		}
	
		static double calculateAverage(int sum){
			double avg = sum/5.0;
			
			char assign = assignGrade(avg); // its will call assignGrade will go and then exceute this method
			System.out.println("Assigning Grade :"+assign);
			
			return avg;
		}
		
		static int calculateTotal(int _mathMarks, int _scienceMarks, int _socialScienceMarks, int _hindiMarksm , int _itMarks){
			int sum = ( _mathMarks + _scienceMarks + _socialScienceMarks + _hindiMarksm + _itMarks);
			
			double  average = calculateAverage(sum); //  // its will call calculateAverage will go and solve that first
			System.out.println("Average :"+average);
			
			return sum;
		}
		
		static double  percentageTotal(int sum){
			
			double percent = sum/5.00;
			
			return percent;
			
		}
		
		static void processResult(String name, int mMaths, int sMarks, int sSMarks, int hMarks, int iTmarks ){
			
			String fName =printReport(name);
			System.out.println("Student Name::"+fName); //first line will print this thats name 
			
			int result = calculateTotal( mMaths, sMarks, sSMarks, hMarks,iTmarks);// calling and assign calculateTotal to result
			System.out.println("Result :"+result);
			
			System.out.println("Total Mark :500"); // just printing after result
			
			System.out.println("Percentage :"+percentageTotal(result)+"%"); // calling and printing the percentageTotal
			
		}
		
		public static void main(String[] args){
			
			if(args.length != 6){
				
				System.out.println("Plase provide a valid output");
				return;
				
			}
		
			String name = args[0];
			
			String math_MarkStr = args[1];
			String science_MarkStr = args[2];
			String social_MarkStr = args[3];
			String hindi_MarkStr = args[4];
			String iT_MarkStr = args[5];
			
			int math_Mark = Integer.parseInt(math_MarkStr);
			int science_Mark = Integer.parseInt(science_MarkStr);
			int social_Mark = Integer.parseInt(social_MarkStr);
			int hindi_Mark = Integer.parseInt(hindi_MarkStr);
			int iT_Mark = Integer.parseInt(iT_MarkStr);
			
			
			
			processResult(name, math_Mark, science_Mark, social_Mark, hindi_Mark, iT_Mark );
			
			
			
		
		}
	
	}