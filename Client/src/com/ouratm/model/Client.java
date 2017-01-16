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
		TransactionFactory transactionFactory = new TransactionFactory();
		TransactionType tType = TransactionType.WITHDRAW;
		Transaction tr = transactionFactory.getTransaction(tType);
		
		switch(tType) {
		case CHECK_BALANCE : 
			System.out.println("Client: Just checking the balance.");
			break;
		case DEPOSIT :
			System.out.println("Client: Making a deposit.");
			break;
		case WITHDRAW :
			Rule ruleCanWithdrawFrom = new CanWithdrawFrom(); 
			tr.rules.add(ruleCanWithdrawFrom);
			System.out.println("Client: Please give me some moolah.");
			break;
		default:
			throw new IllegalArgumentException("Client: Bad Transaction type entered: " + tType); 
		}
		
		if(tr.executeRules()) {
			tr.executeAction();
		}
	}
}
