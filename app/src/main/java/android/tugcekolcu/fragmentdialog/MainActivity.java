package android.tugcekolcu.fragmentdialog;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View v){


        FragmentManager fm = getFragmentManager();
        MyDialog fragment = new MyDialog();
        fragment.show(fm,"Dialog");

    }

    @Override
    public void getMessage(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
