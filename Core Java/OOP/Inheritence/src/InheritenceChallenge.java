public class InheritenceChallenge {
    public static void main(String[] args) {
        HourlyEmployee Mary = new HourlyEmployee("Mary","05/05/1970", "03/03/2021", "03/03/2021",15);

        System.out.println(Mary);
        System.out.println("Mary's paycheck = $" + Mary.collectPay());
        System.out.println("Mary's Holiday pay = $" + Mary.getDoublePay() );
    }
}
