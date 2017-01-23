/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class CheckBalance extends Transaction {
	
	public CheckBalance(TransactionType type) {
		super(type);
	}
	
	@Override
	public void executeAction() {
		System.out.println("Transaction: Checking the balance.");	
	}
}
