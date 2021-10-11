package Object_Composition;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mukul");

        Address homeAddress = new Address("line1","Pune","123456");
        customer1.setHomeAddress(homeAddress);

        Address workAddress = new Address("line1","Mumbai","987654");
        customer1.setWorkAddress(workAddress);

        System.out.println(customer1.toString());

    }
}
