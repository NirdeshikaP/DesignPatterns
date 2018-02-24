public class StandardUser implements User {
    @Override
    public Account createAccount() {
        return new Standard();
    }

    @Override
    public SecurityManager createSecurityManager() {
        return new Standard_SecurityManager();
    }
}
