package zmytest;

public class ExceotionTest extends RuntimeException{

    public ExceotionTest() {

//        super();
    }

    public ExceotionTest(String message) {

//        super(message);
    }

    public ExceotionTest(String message, Throwable cause) {
//        super(message, cause);
    }

    public ExceotionTest(Throwable cause) {

//        super(cause);
    }

    public static void main(String[] args) {
        throw new ExceotionTest();
    }
}
