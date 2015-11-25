package net.wiljoey.carinfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by wiljoey on 11/16/15.
 */
public class OnePieceListActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                ApplicationData.onePiece
        );
        setListAdapter(adapter);
        //啟用按鍵過濾功能
        //getListView().setTextFilterEnabled(true);

    }
}
