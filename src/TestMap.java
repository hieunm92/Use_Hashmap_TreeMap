import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Huong",27);
        hashMap.put("Trang",27);
        hashMap.put("Duyet",32);
        hashMap.put("Nam",23);
        hashMap.put("Linh",25);
        hashMap.put("Hai",26);
        hashMap.put("Cuong",29);
        System.out.println("Hien thi trong HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hien thi cac muc nhap theo thu tu tang dan: ");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Huong",27);
        linkedHashMap.put("Nam",23);
        linkedHashMap.put("Linh",26);
        linkedHashMap.put("Thuy",28);
        linkedHashMap.put("Hoang",29);
        System.out.println("Tuoi cua Huong la: " + linkedHashMap.get("Huong"));
    }
}
