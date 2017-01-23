/**
 *
 */
package com.ouratm.model;

/**
 * @author jaysh_000
 *
 */
public class CanWithdrawFrom extends Rule {
	public boolean execute(AccountInfo acInfo, double operationAmount) {		
		return (acInfo.getBalance() > operationAmount);			
	}
}
