package Expression;
import java.util.Hashtable;

/**
 * The cache manager which caches the results of the expressions.
 */
public class ExpressionCacheManager {
    /* Make it private in order to restrict the Client making multiple cache managers and
    * caching the results in more than one manager leading to the loss of its capabilities.*/
    private ExpressionCacheManager() {

    }

    private static Hashtable<String,Integer> hashTable = new Hashtable();

    /**
     * Checks the hash table for existing cached results for the given expression.
     * If it is cached, return the result.
     * Else, store it for future use and then return the result.
     * @param expression Expression for which we need to evaluate the result
     * @return The evaluated results
     */
    public static int getResult(Expression expression){
        String key = expression.formKey();
        Integer cachedResult = hashTable.get(key);

        if(cachedResult == null){
            cachedResult = expression.evaluate();
            hashTable.put(key, cachedResult);
        }
        return cachedResult;
    }

}
