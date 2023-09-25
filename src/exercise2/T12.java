package exercise2;

public class T12 {
     /* Create Registration Class in which you would have variables as email, userName and password that
have an access scope only within its own class. After creating an object of the class user should be able
to call methods and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain userName.
*/


    // Private instance variables
    private String email;
    private String userName;
    private String password;

    public T12(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    // Method to set the user's email
    public void setEmail(String email) {
        if (email.contains("@yahoo")) {
            this.email = email;
        } else {
            System.out.println("your email address is not valid");
        }
    }

    // Method to set the user's username
    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Your username is not valid");
        }
    }

    // Method to set the user's password
    public void setPassword(String password) {
        if (!password.isEmpty() && password != userName && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Your password is not valid");
        }
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}

class T12tester {


    public static void main(String[] args) {
        T12 e = new T12("myname.Mylastname@yahoo.com", "myFirstNameMyLastName", "123456789");
        System.out.println("Email: " + e.getEmail());
        System.out.println("Username: " + e.getUsername());
        System.out.println("Password: " + e.getPassword());
    }
}

