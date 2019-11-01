package com.example.szl2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import com.leon.lib.settingview.LSettingItem;

public class meActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        LSettingItem one =(LSettingItem)findViewById(R.id.item_one);
        one.setmOnLSettingItemClick(new LSettingItem.OnLSettingItemClick() {

            public void click() {
                Toast.makeText(meActivity.this,"点击了钱包",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
