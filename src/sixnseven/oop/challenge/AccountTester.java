package sixnseven.oop.challenge;

public class AccountTester {
    public static void main(String[] args) {

        Account timsAccount = new Account();
        //Account timsAccount = new Account("12345", 100.00, "Tim", "tim@gmail.com", "987654");
        System.out.println(timsAccount.getNumber());
        System.out.println(timsAccount.getBalance());
        System.out.println(timsAccount.getCustomerName());
        System.out.println(timsAccount.getCustomerEmailAddress());
        System.out.println(timsAccount.getCustomerPhoneNumber());

        timsAccount.withdrawal(100.00);
        timsAccount.deposit(100.00);

        timsAccount.withdrawal(160.00);
        timsAccount.withdrawal(99.00);

        Account jamesAccount = new Account("James", "tim@gmail.com", "56565");
        System.out.println(jamesAccount.getNumber() + " name " + jamesAccount.getCustomerName());

        VIPCustomer customer1 = new VIPCustomer();
        System.out.println(customer1.getName());

        VIPCustomer person2 = new VIPCustomer("Tim", 25000.34);
        System.out.println(person2.getName());

        VIPCustomer person3 = new VIPCustomer("Blake", 354345.22, "blake@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());

    }
}
