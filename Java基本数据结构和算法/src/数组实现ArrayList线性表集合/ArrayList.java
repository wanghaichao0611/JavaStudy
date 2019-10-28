package 数组实现ArrayList线性表集合;

public class ArrayList implements List {
    private int initCapacit=20;//初始数组大小
    private int size;//元素个数
    private Object[] elementData;//数据数组对象
    public ArrayList(){
        elementData=new Object[initCapacit];
    }
    public ArrayList(int initCapacit){
        elementData=new Object[initCapacit];
        this.initCapacit=initCapacit;
    }
    //添加元素
    @Override
    public void add(Object element) {
        if (size<initCapacit){
            elementData[size]=element;
            size++;
        }
        else {
            elementData=expandArray(elementData);
            elementData[size]=element;
            size++;
        }
    }
    //扩充List对象数组大小
    public Object[] expandArray(Object[] elementData){
        Object[] tempArray=new Object[elementData.length*2];//每次扩充为原来的2倍大小
        for (int i=0;i<elementData.length;i++){
            tempArray[i]=elementData[i];
        }
        return tempArray;
    }
    //获得元素
    @Override
    public Object get(int index) {
        return elementData[index];
    }
    //集合大小
    @Override
    public int size() {
        return size;
    }
    //删除元素
    @Override
    public Object remove(int index) {
        Object removeObj=elementData[index];
        //删除元素后面的元素前移
        for (int i=index;i<size;i++){
            elementData[i]=elementData[i+1];
        }
        size--;
        return removeObj;
    }
    //修改元素

    @Override
    public Object set(int index, Object element) {
        elementData[index]=element;
        return element;
    }
}
