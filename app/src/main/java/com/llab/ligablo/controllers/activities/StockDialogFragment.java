package com.llab.ligablo.controllers.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.llab.ligablo.R;

public class StockDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        if (getArguments() != null) {
            if (getArguments().getBoolean("stockAlertDialog")) {
                return super.onCreateDialog(savedInstanceState);
            }
        }

        return null;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stock_dialog, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




//open products activity
        Button btnProducts = view.findViewById(R.id.btnProducts);
        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i= new Intent(getContext(),Formulaire_Extension.class);

                startActivity(i);
                dismiss();
            }
        });
  //open stock activity

        Button btnStock = view.findViewById(R.id.btnStock);
        btnStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i= new Intent(getContext(),Formulaire_Extension.class);

                startActivity(i);
                dismiss();
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public interface DialogListener {
        void onFinishEditDialog(String inputText);
    }


}
