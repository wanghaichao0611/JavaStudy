package 哈希表;

public class TestHashMap {
    public static void main(String[] args){
        HashMap map=new HashMap();
        map.put(1,"高效学习");
        map.put("success","终身成长");
        System.out.println(map.get(1));
        System.out.println(map.get("success"));
    }
}
