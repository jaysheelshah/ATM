/**
 * 
 */
package com.ouratm.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jaysheelshah
 *
 */
public abstract class Transaction {
	
	List<Rule> rules = null;
	
	public Transaction() {
		this.rules = new ArrayList<Rule>();
	}
	
	public abstract void executeAction();
	
	public boolean executeRules() {
		boolean result = true;
		for(Rule rule : this.rules) {
			result &= rule.doAction();
		}
		
		return result;
	}
}
