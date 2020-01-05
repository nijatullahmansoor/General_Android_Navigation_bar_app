package com.example.genral;


import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ContextualActionModeActivity extends AppCompatActivity {

    private ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_action_mode);

        TextView textView=findViewById(R.id.contextual_action_textView);

        textView.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {

                if (mActionMode!=null){

                    return false;

                }else {

                    mActionMode=startActionMode(mActionModeCallback);
                    return true;
                }
            }
        });

    }

    private ActionMode.Callback mActionModeCallback=new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {

            actionMode.getMenuInflater().inflate(R.menu.contetual_menu,menu);
            actionMode.setTitle("Chose your option");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {

            switch (menuItem.getItemId()) {
                case R.id.option1:
                    Toast.makeText(getApplicationContext(), "Option 1 selected", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                case R.id.option2:
                    Toast.makeText(getApplicationContext(), "Option 2 selected", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                default:
                    return false;
            }

        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

            mActionMode=null;
        }
    };
}
