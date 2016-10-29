package com.example.shaloin.fifthassignmentd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textID);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id =item.getItemId();
        switch (id){
            case R.id.action1ID:
                Toast.makeText(getApplicationContext(),"Action 1 selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action2ID:
                Toast.makeText(getApplicationContext(),"Action 2 selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action3ID:
                Toast.makeText(getApplicationContext(),"Action 3 selected",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}
