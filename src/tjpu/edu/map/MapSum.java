package tjpu.edu.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lwq on 2021/11/15 9:27
 * https://leetcode-cn.com/problems/map-sum-pairs/
 * 677. 键值映射
 */

/*
    方法1：暴力求解
    学会哈希表的遍历
    学会startsWith()方法
 */
public class MapSum {
    Map<String, Integer> map;
    
    public MapSum() {
        map = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int res = 0;  //记录以前缀 prefix 开头的键 key 的值的总和
        //这里要学会哈希表的遍历方法
        for (String s : map.keySet()) {
            if (s.startsWith(prefix)) {
                res = res + map.get(s);
            }
        }
        return res;
    }
    
}
