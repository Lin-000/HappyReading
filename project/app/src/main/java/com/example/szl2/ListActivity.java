package com.example.szl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private String[] data = {
            "Apple","Banana","orange","Watermelon","Apple","Pear","Cherry","Grape","Apple","Banana","orange","Watermelon","Apple","Pear","Cherry","Grape"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
