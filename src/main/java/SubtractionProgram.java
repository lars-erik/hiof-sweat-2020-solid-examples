public class SubtractionProgram extends CalculatorProgram {
    public SubtractionProgram(ExpressionReader expressionReader, ExpressionParser expressionParser) {
        super(expressionReader, expressionParser);
    }

    @Override
    protected int aggregateTotal(int total, int subtotal) {
        return total - subtotal;
    }

    @Override
    protected int calculateItem(int[] operation) {
        return operation[0] - operation[1];
    }

    @Override
    protected String formatItem(int[] operation) {
        return operation[0] + " - " + operation[1];
    }
}