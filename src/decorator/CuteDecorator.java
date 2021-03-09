package decorator;

public class CuteDecorator extends PrinterDecorator {
    public CuteDecorator(Printer decoratedPrinter) {
        super(decoratedPrinter);
    }

    @Override
    public String print(String photo) {
        return filter(super.print(photo));
    }

    private String filter(String photo) {
        return photo + ":cute";
    }
}
