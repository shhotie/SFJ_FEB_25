package controlstatement;

public enum Operator {
    ADD('+'),
    SUBSTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MODULO('%');

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }


    public static Operator fromSymbol(char symbol) {
        for (Operator op : values()) {
            if (op.symbol == symbol) {
                return op;
            }
        }
        return null; // Invalid operator
    }
}
