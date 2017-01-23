/**
 *
 */
package com.ouratm.model;

/**
 * @author jaysheelshah
 *
 */
public abstract class Rule {
	
	public abstract boolean execute(AccountInfo acInfo, double operationAmount);
}
