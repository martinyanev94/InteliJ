public class Withdraw {
    String banner = "Banner";
    double currentBalance = 11900.66;
    double interest = 0.0355;
    double withdraw = 4000;
    double moneyLeft = getaDouble();

    private double getaDouble() {
        return currentBalance - withdraw - withdraw * interest;
    }
}
