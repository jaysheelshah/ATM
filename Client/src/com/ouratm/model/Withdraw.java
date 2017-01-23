/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class Withdraw extends Transaction {
	
	public Withdraw(TransactionType type) {
		super(type);
	}
	
	@Override
	public void executeAction() {
		System.out.println("Dispensing amount: " + operationAmount);
		acInfo.setBalance(acInfo.getBalance() - operationAmount);
	}
}
