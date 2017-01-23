/**
 * 
 */
package com.ouratm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adityap
 *
 */
public class RuleFactory {
	public static List<Rule> getRules(TransactionType transactionType) {
		
		List<Rule> rules = new ArrayList<Rule>();
		
		switch(transactionType) {
		case CHECK_BALANCE : 
			//return new CheckBalance();
			break;
		case DEPOSIT :
			//return new Deposit();
			break;
		case WITHDRAW : 
			rules.add(new CanWithdrawFrom());
			break;
		default:
			throw new IllegalArgumentException("TransactionFactory: Bad Transaction type entered: " + transactionType);
		}
		
		return rules;
	}
}
