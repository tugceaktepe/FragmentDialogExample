package android.tugcekolcu.fragmentdialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by tugcekolcu on 25.02.2018.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener {


    Button btnYes, btnNo;
    Communicator com;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        com = (Communicator) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        setCancelable(false); //bosluga tikladiginda kapanmasin diye
        View rootView = inflater.inflate(R.layout.my_dialog, null, false);
        btnYes = (Button) rootView.findViewById(R.id.btnYes);
        btnNo = (Button) rootView.findViewById(R.id.btnNo);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnYes) {
            dismiss();//dialog penceresi kapansin diyr
            com.getMessage("Evet tiklandi");
            //Toast.makeText(getActivity(), "Evet tiklandi", Toast.LENGTH_LONG).show();
        } else {
            dismiss();
            com.getMessage("Hayir tiklandi");
            //Toast.makeText(getActivity(),"No tiklandi",Toast.LENGTH_LONG).show();
        }

    }



    interface Communicator{

        public void getMessage(String msg);
    }
}


