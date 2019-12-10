package wagwalking;

public class Client {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private String street;
    private String city;
    private String apt;
    private String state;
    private String zipCode;
    private String creditCardNumber;
    private String mm;
    private String cvc;

    public Client(String email, String password, String firstName, String lastName, String phone, String street,
                  String city, String apt, String state, String zipCode, String creditCardNumber, String mm, String cvc)
    {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.apt = apt;
        this.state = state;
        this.zipCode = zipCode;
        this.creditCardNumber = creditCardNumber;
        this.mm = mm;
        this.cvc = cvc;

    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public String getStreet() {return street; }
    public String getCity() {return city; }
    public String getApt() { return apt; }
    public String getState() {return state; }
    public String getZipCode() {return zipCode; }
    public String getCreditCardNumber() {return creditCardNumber; }
    public String getMm() { return mm; }
    public String getCvc() {return cvc; }

}
