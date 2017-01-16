/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class Withdraw extends Transaction {

	@Override
	public void executeAction() {
		System.out.println("Transaction: Withdrawing money.");
	}

}
