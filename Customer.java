public class Customer extends Person {
    private int customerId;

    public Customer(int customerId, String name, String phone) {
        super(name, phone);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer ID : " + customerId);
        super.displayDetails();
    }
}
