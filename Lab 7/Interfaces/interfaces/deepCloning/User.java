package interfaces.deepCloning;

class User implements Cloneable {

    private String firstName;
    private String lastName;
    private Address address;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();

        User clonedUser = (User) super.clone();
        clonedUser.address = (Address) clonedUser.getAddress().clone();
        return clonedUser;
    }
}
