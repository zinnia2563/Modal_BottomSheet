package com.example.modal_bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.zip.Inflater;

public class ExampleBottomSheetDialogue extends BottomSheetDialogFragment {
    private BottomSheetListener mlistener;
    Button btn1,btn2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet,container,false);
        btn1=v.findViewById(R.id.btn1_id);
        btn2=v.findViewById(R.id.btn2_id);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onButtonClicked("Button 1 Clicked");
                dismiss();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onButtonClicked("Button 2 Clicked");
                dismiss();

            }
        });


        return v;
    }
    public interface BottomSheetListener{
        void onButtonClicked(String text);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            mlistener = (BottomSheetListener) context;
        }
        catch(ClassCastException e){
            throw new ClassCastException(context.toString()
            +"must implement BottomSheetListener");
        }
    }
}
