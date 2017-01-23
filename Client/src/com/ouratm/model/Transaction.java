/**
 *
 */
package com.ouratm.model;
import java.util.List;

/**
 * @author jaysheelshah
 *
 */
public abstract class Transaction {

	protected AccountInfo acInfo = null;
	protected double operationAmount = 0;
	private TransactionType tType; 
	
	protected Transaction() {}
	
	protected Transaction(TransactionType type) {
		this.tType = type;
	}
	
	public void setAccountInfo(AccountInfo acInfo) {
		this.acInfo = acInfo;
	}
	
	public void setOperationAmount(double amount) {
		this.operationAmount = amount;
	}
	
	public abstract void executeAction();

	public boolean process() {
		boolean result = true;
		
		List<Rule> rules = RuleFactory.getRules(this.tType);
		
		for(Rule rule : rules) {
			result &= rule.execute(this.acInfo, operationAmount);
		}

		if(result)
			executeAction();

		return result;
	}
}
