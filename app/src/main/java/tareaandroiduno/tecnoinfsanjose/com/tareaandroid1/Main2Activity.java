package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity implements IMain2Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cambiarFragment(1);
    }

    private void doFragmentTransaction(Fragment fragment, String tag){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedor, fragment, tag);
        transaction.commit();
    }

    @Override
    public void cambiarFragment(int id) {
        if(id == 1){
            login fragment = new login();
            doFragmentTransaction(fragment, "login");
        }
        else if(id == 2){
            registro fragment = new registro();
            doFragmentTransaction(fragment, "registro");
        }

    }

    @Override
    public void cambiarActivity (int id){
        if (id == 1){
            Intent nuevo = new Intent(this, Main3Activity.class);
            startActivity(nuevo);
        }
        else if(id == 2){
            Intent nuevo = new Intent(this, Main3Activity.class);
            startActivity(nuevo);
        }
    }




}

