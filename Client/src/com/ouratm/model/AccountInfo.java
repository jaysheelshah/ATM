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
<<<<<<< HEAD
    private String accountName;

    public AccountInfo(AccountType type, double balance, String name)
=======
    private string accountName;

    public AccountInfo(AccountType type, double balance, string name)
>>>>>>> a355abc21031ed5c312fb39209231639312347a7
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

<<<<<<< HEAD
    public String getAccountName()
    {
        return this.accountName;
    }
    
    public void setBalance(double amount)
    {
    	this.balance = amount;
    }
=======
    public string getAccountName()
    {
        return this.accountName;
    }
>>>>>>> a355abc21031ed5c312fb39209231639312347a7
}


