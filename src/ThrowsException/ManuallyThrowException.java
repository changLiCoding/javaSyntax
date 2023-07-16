package ThrowsException;

public class ManuallyThrowException {
    public static void main(String[] args) throws Exception {


        try {
            login("chang", "wrong password");
        } catch (AccountException accountException) {
            System.out.println("Wrong account");
        } catch (PasswordException passwordException) {
            System.out.println("Wrong password");
        } catch (LoginException loginException) {
            System.out.println("Something else");
        }
        finally {
            System.out.println("COMPLETED");
        }
        System.out.println("The end");
    }

    public static void login (String account, String password) throws Exception {
        if (!"admin".equals(account)) {
            throw new AccountException("Wrong Account");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("Wrong Password");
        }
        System.out.println("Logged In!");
    }

}

class AccountException extends LoginException {
    public AccountException(String msg) {
        super(msg);
    }
}
class PasswordException extends LoginException {
    public PasswordException(String msg) {
        super(msg);
    }

}
class LoginException extends RuntimeException {
    public LoginException(String msg) {
        super(msg);
    }
}