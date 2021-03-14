package singleton;

public class MyOnlyOne {
    private static MyOnlyOne moo = null;

    private MyOnlyOne() {
    }

    // way 1 to prevent race condition
    // private static MyOnlyOne moo = new MyOnlyOne();

    // way 2 to prevent race condition
    // public synchronized static MyOnlyOne getMyOnlyOne() {
    public static MyOnlyOne getMyOnlyOne() {
        if (moo == null) {
            moo = new MyOnlyOne();
        }

        return moo;
    }
}
