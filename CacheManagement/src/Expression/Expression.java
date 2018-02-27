package Expression;

/**
 * Expression base class
 */
public abstract class Expression {
    Expression leftExpression;
    Expression rightExpression;

    /**
     * Default constructor
     */
    public Expression(){

    }

    /**
     * Set the left and right operands. The operands can in turn be expressions.
     * @param leftExpression
     * @param rightExpression
     */
    public Expression(Expression leftExpression, Expression rightExpression){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * Evalaute the expression and return the result.
     */
    protected abstract int evaluate();

    /**
     * Forms the key for the expression.
     * @return The key
     * Example: new SubExpression(new AddExpression(new NumberExpression(3), new NumberExpression(2)), new NumberExpression(1))
     * returns "3+2-1" as the key.
     */
    public abstract String formKey();
}
