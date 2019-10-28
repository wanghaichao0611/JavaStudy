package 分页参数RowBounds;


public class RowBounds {
    public static final int NO_ROW_OFFSET=0;//偏移量
    public static final int NO_ROW_LIMIT=Integer.MIN_VALUE ;//限制条数
    public static final RowBounds DEFAULT=new RowBounds();
    private int offset;
    private int limit;
    public RowBounds()
    {
        this.offset=NO_ROW_OFFSET;
        this.limit=NO_ROW_LIMIT;
    }
    public RowBounds(int offset,int limit)
    {
        this.offset=offset;
        this.limit=limit;
    }
    public void setOffset(int offset)

    {
        this.offset=offset;
    }
    public int getOffset()
    {
        return offset;
    }
    public void setLimit(int limit)
    {
        this.limit=limit;
    }
    public int getLimit()
    {
        return limit;
    }
}
