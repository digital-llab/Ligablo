package com.llab.ligablo.controllers.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.llab.ligablo.R;

public class ConfigurationDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        if (getArguments() != null) {
            if (getArguments().getBoolean("notAlertDialog")) {
                return super.onCreateDialog(savedInstanceState);
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Alert Dialog");
        builder.setMessage("Alert Dialog inside DialogFragment");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });

        return builder.create();

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample_dialog, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





        Button btnRegisterMyBusiness = view.findViewById(R.id.btnRegisterMyBusiness);
        btnRegisterMyBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //DialogListener dialogListener = (DialogListener) getActivity();
                //dialogListener.onFinishEditDialog(editText.getText().toString());
                Intent i= new Intent(getContext(),Etablissement_Creation.class);

                startActivity(i);
                dismiss();
            }
        });

        Button btnAddExtensions = view.findViewById(R.id.btnAddExtensions);
        btnAddExtensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //DialogListener dialogListener = (DialogListener) getActivity();
                //dialogListener.onFinishEditDialog(editText.getText().toString());
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
