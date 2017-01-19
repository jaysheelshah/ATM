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
    private string accountName;

    public AccountInfo(AccountType type, double balance, string name)
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

    public string getAccountName()
    {
        return this.accountName;
    }
}


