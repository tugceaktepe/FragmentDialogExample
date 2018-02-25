package android.tugcekolcu.fragmentdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by tugcekolcu on 25.02.2018.
 */

public class MyAlert extends DialogFragment {

    String [] gunler  = {"Pazartesi" , "Salı" , "Çarşamba", "Perşembe","Cuma"};
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Dialog Penceresi");
        /*builder.setMessage("Egitimi begendiniz mi");
        builder.setItems(gunler, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Secilen gun : " + gunler[which],Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Hayir tiklandi",Toast.LENGTH_LONG).show();
            }
        });
        builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Evet tiklandi",Toast.LENGTH_LONG).show();
            }
        });*/
        Dialog dialog = builder.create();

        return dialog;

    }
}
