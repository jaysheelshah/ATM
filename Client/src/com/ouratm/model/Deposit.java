/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class Deposit extends Transaction {

	@Override
	public void executeAction() {
		System.out.println("Transaction: Executing a deposit.");		
	}

}
