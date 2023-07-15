package ThrowsException;

public class ExceptionBasic {
    public static void main(String[] args) {
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
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }catch (Exception e) {
            user = new User();
            user.toString();
        } finally {
            System.out.println("Something is wrong");
        }
    }

    public static void test() {
        test();
    }
}

class User {

}