package decorator;

public class BlackAndWhiteDecorator extends PrinterDecorator {
    public BlackAndWhiteDecorator(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public String print(String photo) {
        return filter(super.print(photo));
    }

    private String filter(String photo) {
        return photo + ":blackAndWhite";
    }
}
