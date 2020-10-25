import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class The_program {
    @Test
    public void sums_numbers_and_grand_total() throws Exception {
        String expected =
            "1 + 1 = 2\n" +
            "1 + 2 = 3\n" +
            "5 + 10 = 15\n" +
            "1205 + 795 = 2000\n" +
            "Total: 2020\n";
        String actual = new CalculationReport(
                new ExpressionParser(new FileSystemExpressionReader(), BinaryOperator.Add),
                new Aggregation(BinaryOperator.Add),
                new AsciiFormatter()
            )
            .buildReport()
            .toString();
        assertEquals(expected, actual);
    }

    @Test
    public void subtracts_numbers() throws Exception {
        String expected =
            "1 - 1 = 0\n" +
            "1 - 2 = -1\n" +
            "5 - 10 = -5\n" +
            "1205 - 795 = 410\n" +
            "Total: -404\n";
        String actual = new CalculationReport(
                new ExpressionParser(new FileSystemExpressionReader(), BinaryOperator.Subtract),
                new Aggregation(BinaryOperator.Subtract),
                new AsciiFormatter()
            )
            .buildReport()
            .toString();
        assertEquals(expected, actual.toString());
    }
}
