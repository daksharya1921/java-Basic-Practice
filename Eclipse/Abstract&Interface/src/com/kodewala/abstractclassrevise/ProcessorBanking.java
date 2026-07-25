package com.kodewala.abstractclassrevise;

public class ProcessorBanking {
	
	void processor(IBanking bank ) {
		bank.payment();
		bank.stopCheque();
		bank.stopPayment();
		bank.suspendPayment();
	}

}
