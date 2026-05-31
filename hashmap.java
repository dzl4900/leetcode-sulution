package ArrayList;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args){

        HashMap<String,Integer>map=new HashMap<>();
        //存入
        map.put("小明",90);
        map.put("小红",80);
        map.put("小粉",85);
        System.out.println(map.get("小明"));
        //取值
        System.out.println(map.containsKey("小红"));
        //判断
        map.remove("小李");
        //删除
        for (String name: map.keySet()){
            System.out.println(name+"分数为"+map.get(name));
        }
    }
    //通过某个id查找对应数据，键值对
}
