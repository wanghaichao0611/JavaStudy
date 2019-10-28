package Bean;

public class ApplicationtScopeBean {
    private int accessCount=1;

    public int getAccessCount() {
        return (accessCount++);
    }
}
