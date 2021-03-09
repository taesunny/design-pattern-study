package decorator;

public abstract class PrinterDecorator extends Printer {
    private Printer decoratedPrinter;

    public PrinterDecorator(Printer decoratedPrinter) {
        this.decoratedPrinter = decoratedPrinter;
    }

    @Override
    public String print(String photo) {
        return decoratedPrinter.print(photo);
    }
}
