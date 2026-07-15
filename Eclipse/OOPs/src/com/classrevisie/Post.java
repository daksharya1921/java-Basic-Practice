package com.classrevisie;

public class Post {
	
	
	
	public String estimatePostTime(String source, String destination) {
		
		return "Post: standard estimate:1-2 weeks";
	
	
	}

//	@Override
//    public String toString() {
//        return estimatePostTime; // or format however you like
//    }
	
	public String toString() {
	    return estimatePostTime("Benalure", "Patna");
	}
}




