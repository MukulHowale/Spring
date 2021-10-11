package Object_Composition;

public class Customer {
    private String name;

    private Address homeAddress;

    private Address workAddress;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("Name - [%s] Home Address - [%s] Work Address - [%s]",name,homeAddress,workAddress);
    }
}
