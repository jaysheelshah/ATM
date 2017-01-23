/**
 * 
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccountInfo acInfo = new AccountInfo(AccountType.Checking, 10000.23, "My awesome checking account");
		
		System.out.println("Balance: " + acInfo.getBalance());
		
		TransactionType tType = TransactionType.WITHDRAW;
		Transaction tr = TransactionFactory.getTransaction(tType);
		tr.setAccountInfo(acInfo);
		tr.setOperationAmount(100);
		tr.process();
		
		System.out.println("New Balance: " + acInfo.getBalance());
	}
}
