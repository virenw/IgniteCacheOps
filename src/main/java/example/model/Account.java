/*
 * User: viren
 * Copyright (c) 2018.
 */

package example.model;

public class Account {

    private int id;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}
