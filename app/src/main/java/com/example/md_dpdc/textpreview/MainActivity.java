package com.example.md_dpdc.textpreview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edittext = findViewById(R.id.editText);
        final TextView txtview = findViewById(R.id.textView2);

        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString().length() > 0){
                    if(editable.toString().charAt(0) == '-') {

                        txtview.setVisibility(View.VISIBLE);
                        editable.clear();
                    }
                    else
                        txtview.setVisibility(View.INVISIBLE);
                }



            }
        });

//        edittext.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if(i == KeyEvent.KEYCODE_MINUS)
//                {
//                    return true;
//                }
//                else
//                    return false;
//            }
//        });

//        edittext.setKeyListener(new KeyListener() {
//            @Override
//            public int getInputType() {
//                    return 0;
//            }
//
//            @Override
//            public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
//
//                return false;
//            }
//
//            @Override
//            public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
//                if(i == KeyEvent.KEYCODE_MINUS){
//                    return true;
//                }
//                else
//                    return false;
//
//            }
//
//            @Override
//            public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
//                return false;
//            }
//
//            @Override
//            public void clearMetaKeyState(View view, Editable editable, int i) {
//
//            }
//        });
    }


}
