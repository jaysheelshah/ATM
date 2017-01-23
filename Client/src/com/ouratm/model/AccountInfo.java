/**
 *
 */
package com.ouratm.model;

/**
 * @author adityap
 *
 */
public class AccountInfo {
    private AccountType accountType;
    private double balance;
    private String accountName;

    public AccountInfo(AccountType type, double balance, String name)
    {
        this.accountType = type;
        this.balance = balance;
        this.accountName = name;
    }

    public AccountType getAccountType()
    {
        return this.accountType;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getAccountName()
    {
        return this.accountName;
    }
    
    public void setBalance(double amount)
    {
    	this.balance = amount;
    }
}


