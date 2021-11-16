package tjpu.edu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Lwq on 2021/11/15 10:22
 * 哈希表的三种遍历方法
 */
public class TraversalHashMap {
    
    /*
        第一种：遍历HashMap的entrySet键值对集合
        1. 通过HashMap.entrySet()得到键值对集合；
        2. 通过迭代器Iterator遍历键值对集合得到key值和value值；
     */
    public static void main(String[] args) {
        //创建一个key和value均为String的Map集合
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "11");
        map.put("2", "22");
        map.put("3", "33");
        //键和值
        String key = null;
        String value = null;
        //获取键值对的迭代器
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            key = next.getKey();
            value = next.getValue();
            System.out.println("key:" + key + "---" + "value:" + value);
        }
    }

    /*
        第二种：遍历HashMap键的Set集合获取值；
        1. 通过HashMap.keySet()获得键的Set集合；
        2. 遍历键的Set集合获取值；
     */
//    public static void main(String[] args) {
//        //创建一个key和value均为String的Map集合
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("1", "11");
//        map.put("2", "22");
//        map.put("3", "33");
//        //键和值
//        String key = null;
//        String value = null;
//        //获取键值对的迭代器
//        Iterator<String> it = map.keySet().iterator();
//        while (it.hasNext()) {
//            key = it.next();
//            value = map.get(key);
//            System.out.println("key:" + key + "---" + "value:" + value);
//        }
//    }


    /*
        第三种：遍历HashMap“值”的集合；
        1. 通过HashMap.values()得到“值”的集合
        2. 遍历“值”的集合；
     */
//    public static void main(String[] args) {
//        //创建一个key和value均为String的Map集合
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("1", "11");
//        map.put("2", "22");
//        map.put("3", "33");
//        //值
//        String value = null;
//        //获取键值对的迭代器
//        Iterator<String> it = map.values().iterator();
//        while (it.hasNext()) {
//            value = it.next();
//            System.out.println("value:" + value);
//        }
//    }
    
}
