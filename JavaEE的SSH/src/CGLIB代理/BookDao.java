package CGLIB代理;

public class BookDao {
    public void save()
    {
        System.out.println("save添加图书");
    }
    public void update()
    {
        System.out.println("update修改图书");
    }
    public void delete()
    {
        System.out.println("delete删除图书");
    }
    public void find()
    {
        System.out.println("find查询图书");
    }
}
