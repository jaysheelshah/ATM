/**
 *
 */
package com.ouratm.model;

/**
 * @author jaysh_000
 *
 */
public class CanWithdrawFrom extends Rule {
	public boolean execute() {
		System.out.println("Rule: Executing can withdraw from.");
		return true;
	}
}
