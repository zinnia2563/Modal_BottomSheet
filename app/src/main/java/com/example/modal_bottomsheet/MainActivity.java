package com.example.modal_bottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleBottomSheetDialogue.BottomSheetListener{
    Button btnopen;
private TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnopen=findViewById(R.id.bottomsheetbtn_id);
        mTextview=findViewById(R.id.tv_id);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExampleBottomSheetDialogue bottomSheet=new ExampleBottomSheetDialogue();
                bottomSheet.show(getSupportFragmentManager(),"examplemodalbottomsheet");


            }
        });
    }

    @Override
    public void onButtonClicked(String text) {
    mTextview.setText(text);

    }
}
