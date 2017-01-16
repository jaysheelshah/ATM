/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class CheckBalance extends Transaction {

	@Override
	public void executeAction() {
		System.out.println("Transaction: Checking the balance.");	
	}
}
