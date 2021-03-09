package decorator;

public class PhotoPrinter extends Printer {
    @Override
    public String print(String photo) {
        return photo + ":default";
    }
}
