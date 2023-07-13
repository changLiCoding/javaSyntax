package OOP;

public class OOPBeanClass {
    public static void main(String[] args) {
        User user = new User("admin", "admin");
//        or user.setAccount("admin") and user.setPassword("admin")
        System.out.println(login(user));
    }

    public static boolean login(User user) {
        if(user.getAccount().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        }
        return false;
    }
}
class User {
    private String account;
    private String password;

    User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return this.account;
    }
    public  String getPassword() {
        return this.password;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}