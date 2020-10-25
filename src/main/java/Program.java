import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {
        ExpressionReader reader = new ExpressionReader();

        CalculatorProgram program =
            shouldUseSubtraction(args)
            ? new SubtractionProgram(reader, new ExpressionParser('-'))
            : new CalculatorProgram(reader, new ExpressionParser('+'), new AdditiveTotal());

        StringBuilder resultBuilder = program.readParseCalculateAndFormat();

        System.out.print(resultBuilder.toString());
    }

    private static boolean shouldUseSubtraction(String[] args) {
        return args.length > 0 && "sub".equals(args[0]);
    }

}
