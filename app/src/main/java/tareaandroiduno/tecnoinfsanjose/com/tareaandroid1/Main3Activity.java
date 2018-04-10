package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity implements IMain3Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cambiarFragment(1);
    }

    private void doFragmentTransaction(Fragment fragment, String tag) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedor1, fragment, tag);
        transaction.commit();
    }

    @Override
    public void cambiarFragment(int id) {
        if (id == 1) {
            home_cliente fragment1 = new home_cliente();
            doFragmentTransaction(fragment1, "home_cliente");
        } else if (id == 2) {
            home_empleado fragment1 = new home_empleado();
            doFragmentTransaction(fragment1, "home_empleado");
        }
    }




}





