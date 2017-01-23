/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class TransactionFactory {
	
	public static Transaction getTransaction(TransactionType transactionType) {
		switch(transactionType) {
		case CHECK_BALANCE : 
			return new CheckBalance(transactionType);
		case DEPOSIT :
			return new Deposit(transactionType);
		case WITHDRAW : 
			return new Withdraw(transactionType);
		default:
			throw new IllegalArgumentException("TransactionFactory: Bad Transaction type entered: " + transactionType);
		}
	}
}