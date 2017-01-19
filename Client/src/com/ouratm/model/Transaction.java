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

	private Transaction() {
		this.rules = new ArrayList<Rule>();
	}

	public void AddRule(Rule rule) {
		this.rules.Add(rule);
	}

	public abstract void executeAction();

	public boolean Process() {
		boolean result = true;
		for(Rule rule : this.rules) {
			result &= rule.execute();
		}

		if(result)
			executeAction();

		return result;
	}
}
