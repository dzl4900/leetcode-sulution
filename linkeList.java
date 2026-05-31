package ArrayList;

import java.util.LinkedList;

public class linkeList {
    public static void main(String[] args){
        LinkedList<String>queue= new LinkedList<>();
        queue.offer("第一个");
        queue.offer("第二个");//往后加
        queue.offer("第三个");
        //当站和队列用
        System.out.println(queue.poll());//取出队首并删除头部
        System.out.println(queue.peek());//第二个(只看不删）
        queue.push("A");//加在头部[b,a,,1,2,3]
        queue.push("B");
        //先进后出
        System.out.println(queue.pop());//->B，取出头站并删除
    }
}
