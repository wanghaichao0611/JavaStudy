package 控制器接受各种请求参数;
public class Pojo {
    private String roleName;
    private String note;
    private int start;//查询参数

    public Pojo getPojo() {
        return pojo;
    }

    public void setPojo(Pojo pojo) {
        this.pojo = pojo;
    }

    private int limit;
    private Pojo pojo=null;//分页参数

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
