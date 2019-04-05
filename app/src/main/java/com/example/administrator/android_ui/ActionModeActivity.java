package com.example.administrator.android_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActionModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_mode);

        final String[] names = new String[]{"One","Two","Three","Four","Five","Six"};
        final int[] img = new int[]{R.drawable.timg,R.drawable.timg,R.drawable.timg,
                R.drawable.timg,R.drawable.timg,R.drawable.timg};
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("name",names[i]);
            item.put("picture",img[i]);
            lists.add(item);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lists,R.layout.actionmode_item_layout,
                new String[]{"name","picture"},new int[]{R.id.ac_name,R.id.img});
        ListView listView = (ListView) findViewById(R.id.action_mode_list);
        listView.setAdapter(simpleAdapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {

            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.actionmode_menu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_item_delete_crime:

                        mode.finish(); // Action picked, so close the CAB
                        return true;
                    default:
                        return false;
                }
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }
        });
    }

}
