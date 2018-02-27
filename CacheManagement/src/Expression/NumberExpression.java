package Expression;

/**
 * Expression class to represent numbers.
 */
public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    protected int evaluate() {
        return number;
    }

    @Override
    public String formKey() {
        return number+"";
    }
}
