package Part2;

public class Customer{
    private String customer_name, email, phone_number;
    public Customer(String customer_name, String email, String phone_number) {
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public void set_name(String name)
    {
        this.customer_name = name;
    }
    public String get_name()
    {
        return this.customer_name;
    }

    public void set_email(String email)
    {
        this.email = email;
    }
    public String get_email()
    {
        return this.email;
    }

    public void set_phone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }
    public String get_phone_number()
    {
        return this.phone_number;
    }




}