package Expression;

/**
 * The expression class to represent subtractions
 */
public class SubExpression extends Expression {

    public SubExpression(Expression leftExpression, Expression rightExpression) {
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
        return leftExpression.evaluate() - rightExpression.evaluate();
    }

    @Override
    public String formKey() {
        return leftExpression.formKey() + "-" + rightExpression.formKey();
    }
}
