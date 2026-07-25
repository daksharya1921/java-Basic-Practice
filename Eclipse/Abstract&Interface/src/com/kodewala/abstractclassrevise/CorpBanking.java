package com.kodewala.abstractclassrevise;

public class CorpBanking implements IBanking {

	@Override
	public void payment() {
		System.out.println("CorpBanking.payment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("CorpBanking.stopPayment()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("CorpBanking.suspendPayment()");
		
	}

	@Override
	public void stopCheque() {
		System.out.println("CorpBanking.stopCheque()");
	}

}
