package net.wiljoey.carinfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by wiljoey on 11/25/15.
 */
public class SimpleList extends Activity {
    //private ArrayList<HashMap<String, String>> simpleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        ArrayList<HashMap<String,Object>> simpleData = getSimpleData();
        ListView listView = (ListView) findViewById(R.id.onePiece);

        //新增SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(
                this,
                simpleData,
                R.layout.simple_item,
                new String[] { "title","city", "town", "photo" },
                new int[] { R.id.txtTitle, R.id.txtCity, R.id.txtTown, R.id.imgPhoto } );
        listView.setAdapter(adapter);

    }

    public ArrayList<HashMap<String, Object>> getSimpleData() {
        ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();

        HashMap<String, Object> item = new HashMap<>();
        item.put("seq", 1125);
        item.put("title", "玉蘭花開─走進宜蘭大同玉蘭富麗農村");
        item.put("city", "宜蘭縣");
        item.put("town", "大同鄉");
        item.put("photo",R.drawable.pic1125);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1127);
        item.put("title", "宜蘭港邊社區旅遊實錄");
        item.put("city", "宜蘭縣");
        item.put("town", "蘇澳鎮");
        item.put("photo",R.drawable.pic1127);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1129);
        item.put("title", "大溪好好玩");
        item.put("city", "桃園市");
        item.put("town", "大溪區");
        item.put("photo",R.drawable.pic1129);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1131);
        item.put("title", "落羽松下燜雞香");
        item.put("city", "新竹縣");
        item.put("town", "新埔鎮");
        item.put("photo",R.drawable.pic1131);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1133);
        item.put("title", "銅鑼九湖遇見杭菊的絕妙季節");
        item.put("city", "苗栗縣");
        item.put("town", "銅鑼鄉");
        item.put("photo",R.drawable.pic1133);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1134);
        item.put("title", "再走一趟梅山");
        item.put("city", "嘉義縣");
        item.put("town", "梅山鄉");
        item.put("photo",R.drawable.pic1134);
        list.add(item);

        item = new HashMap<>();
        item.put("seq", 1140);
        item.put("title", "悠遊雲林漁鄉之旅");
        item.put("city", "雲林縣");
        item.put("town", "口湖鄉");
        item.put("photo",R.drawable.pic1140);
        list.add(item);

        return list;
    }
}
