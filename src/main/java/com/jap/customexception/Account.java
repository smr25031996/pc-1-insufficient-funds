package com.jap.customexception;

public class Account {

    private final int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter


    public int getAccountBalance() {
        return accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdrawal amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @return remaining balance
     * @throws InsufficientFundException
     */
    public int withdraw(int amount) throws InsufficientFundException {
        if (amount < accountBalance) {
            return accountBalance - amount;
        } else {
            throw new InsufficientFundException("Insufficient Balance");
        }
    }

}
