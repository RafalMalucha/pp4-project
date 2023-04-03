package pl.rmalucha.creditcard;

import java.util.ArrayList;

public class BillingCycle {
    private ArrayList<Withdrawal> withdrawals = new ArrayList<>();

    public void addWithdrawal(Withdrawal withdrawal) {
        if (withdrawals.size() >= 10) {
            throw new TooManyWithdrawalsInBillingCycleException();
        }
        withdrawals.add(withdrawal);
    }

    public ArrayList<Withdrawal> getWithdrawals() {
        return this.withdrawals;
    }
}
