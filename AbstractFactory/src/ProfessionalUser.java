public class ProfessionalUser implements User {
    @Override
    public Account createAccount() {
        return new Professional();
    }

    @Override
    public SecurityManager createSecurityManager() {
        return new Professional_SecurityManager();
    }
}
