package ArrayList;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){



        HashSet<String> set= new HashSet<>();
        set.add("苹果");
        set.add("橘子");
        set.add("西瓜");
        set.add("苹果");//重复了不会加进去
        System.out.println(set.size());//->是3不是4
        System.out.println(set.contains("香蕉"));//判断是否存在
        //遍历
        for (String frut:set){
            System.out.println(frut);
        }
    //去掉重复元素，或者判断某个元素在不在
    }
}
