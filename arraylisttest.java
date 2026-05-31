package ArrayList;

import java.util.ArrayList;

public class arraylisttest {
    public static void main(String[] args){

        ArrayList<String>list= new ArrayList<>();
        list.add("熊猫");
        list.add("香蕉");
        list.add("西瓜");
        //增
        String result1= list.getFirst();
        System.out.println(result1);
        System.out.println(list.get(1));
        //查
        System.out.println(list.size());
        list.set(1,"葡萄");
        //改
        list.remove("西瓜");
        list.remove(0);
        //删
        for (String fruit:list){
            System.out.println(fruit);
        }//

        //遍历
    }
}
