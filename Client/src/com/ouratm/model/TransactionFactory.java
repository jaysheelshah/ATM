/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class TransactionFactory {
	
	public Transaction getTransaction(TransactionType transactionType) {
		switch(transactionType) {
		case CHECK_BALANCE : 
			return new CheckBalance();
		case DEPOSIT :
			return new Deposit();
		case WITHDRAW : 
			return new Withdraw();
		default:
			throw new IllegalArgumentException("TransactionFactory: Bad Transaction type entered: " + transactionType);
		}
	}
}