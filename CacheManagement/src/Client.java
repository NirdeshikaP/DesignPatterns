import Expression.*;

/**
 * Client that uses the cache manager to get the results of the expression.
 */
public class Client {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        // 3+2-1
        Expression e1 = new SubExpression(new AddExpression(new NumberExpression(3), new NumberExpression(2)), new NumberExpression(1));

        startTime = System.currentTimeMillis();
        System.out.println(ExpressionCacheManager.getResult(e1));
        endTime = System.currentTimeMillis();
        System.out.println("Initial time taken by e1= " + (endTime - startTime));


        Expression e2 = new SubExpression(new AddExpression(new NumberExpression(3), new NumberExpression(2)), new NumberExpression(1));
        startTime = System.currentTimeMillis();
        System.out.println(ExpressionCacheManager.getResult(e2));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by e2 using Cache = " + (endTime - startTime));

        // 3-2-1
        Expression e3 = new SubExpression(new SubExpression(new NumberExpression(3), new NumberExpression(2)), new NumberExpression(1));
        startTime = System.currentTimeMillis();
        System.out.println(ExpressionCacheManager.getResult(e3));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by a new expression e3 = " + (endTime - startTime));

    }
}
