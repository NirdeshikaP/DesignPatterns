package Expression;

/**
 * The expression class to represent additions
 */
public class AddExpression extends Expression {

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
    }

    @Override
    protected int evaluate() {
        /* To simulate time consuming calculation*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return leftExpression.evaluate() + rightExpression.evaluate();
    }

    @Override
    public String formKey() {
        return leftExpression.formKey() + "+" + rightExpression.formKey();
    }
}
