public class SubtractionProgram extends CalculatorProgram {
    public SubtractionProgram(ExpressionReader expressionReader, ExpressionParser expressionParser) {
        super(expressionReader, expressionParser, new AggregateExpression());
    }

    @Override
    protected int aggregateTotal(int total, int subtotal) {
        return total - subtotal;
    }

}
