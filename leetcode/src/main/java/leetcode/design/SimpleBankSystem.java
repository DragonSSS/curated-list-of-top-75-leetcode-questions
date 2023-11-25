package leetcode.design;

public class SimpleBankSystem {
    long[] balance;
    int n;
    public SimpleBankSystem(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (account2 < 1 || account2 > n || money < 0 || !withdraw(account1, money)) {
            return false;
        }
        return deposit(account2, money);
    }
    
    public boolean deposit(int account, long money) {
        if (account < 1 || account > n || money < 0) {
            return false;
        }
        balance[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if (account < 1 || account > n || money < 0 || balance[account - 1] < money) {
            return false;
        }
        balance[account - 1] -= money;
        return true;
    }    
}
