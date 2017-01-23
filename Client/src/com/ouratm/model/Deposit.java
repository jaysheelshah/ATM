/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class Deposit extends Transaction {
	
	public Deposit(TransactionType type) {
		super(type);
	}

	@Override
	public void executeAction() {
		System.out.println("Transaction: Executing a deposit.");		
	}

}
