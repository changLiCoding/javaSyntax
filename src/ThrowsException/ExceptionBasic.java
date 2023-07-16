package ThrowsException;

public class ExceptionBasic {
    public static void main(String[] args) throws Exception {
        String s = "123";
//        Integer i = s;
        Integer i = Integer.parseInt(s);
        System.out.println(i);
        System.out.println(i.getClass());

//        Java Error stackoverflowError
//        test();

//        Java Exception nullPointerException
//        RuntimeException
//        Exception
        User user = null;

        int j = 0;

        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
//            e.getMessage();
//            e.getCause();
            e.printStackTrace();
        } finally {
            System.out.println("Can not divided by Zero. ");
        }

        try {
            System.out.println(user.toString());

        } catch (NullPointerException e) {
            System.out.println("the user is null");
            e.printStackTrace();
        }catch (Exception e) {
            user = new User();
            user.toString();
        } finally {
            System.out.println("Something is wrong");
        }

        User user1 = new User();
        try {
            user1.printDivide(10, 0);

        } catch (Exception e) {
            throw new  Exception();
        }

        System.out.println("THE END");
    }

    public static void test() {
        test();
    }

    public static  void login (String account, String password) {
        if (!"admin".equals(account)) {

        }
        if (!"admin".equals(password)) {

        }
    }
}

class User {
    static public String name = "Chang";
    public void printDivide(int i, int j) throws Exception {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new Exception("You can not divided by 0");
        }

    }
}