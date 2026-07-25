package com.kodewala.abstractclassrevise;

public class Main {
	
	public static void main(String[] args) {
		ProcessorBanking process = new ProcessorBanking();
		process.processor(new PersonalBanking());
		
		System.out.println();
		process.processor(new CorpBanking());
	}

}
