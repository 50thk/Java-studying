package test;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        String[] slist = new String[10];
        ArrayList<String> list = new ArrayList<String>();
        ArrayList alist = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println(slist[i]);
            String s = (String)list.get(i); // object로 가져오기 떄문에 string으로 지정하지 않았을 때 형태를 알려주어야함
        }
    }
}
