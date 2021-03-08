package singleton;

public class MyOnlyOne {
    private static MyOnlyOne moo = null;

    public static MyOnlyOne getMyOnlyOne() {
        if (moo == null) {
            moo = new MyOnlyOne();
        }

        return moo;
    }
}
