package com.kodewala.abstractclassrevise;

public interface IBanking {

	public int VALUE = 20; // public static final int VALUE automatic is constant  
	
	public void payment(); // public abstract void 
	void stopPayment(); //public abstract void 
	public abstract void suspendPayment(); // public abstract void 
	public void stopCheque(); // public abstract void 
	
	
}
