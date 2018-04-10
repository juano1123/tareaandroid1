package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class home_empleado extends Fragment {


    IMain3Activity iMain3Activity;
    private int año;
    private int mes;
    private int dia;
    private EditText campoFecha;
    private Button botonFecha;
   /* private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener escuchaFecha;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_empleado, container, false);
        campoFecha =  view.findViewById(R.id.editTextFecha);
        botonFecha = view.findViewById(R.id.buttonCalendario);
        Calendar calendario = Calendar.getInstance();
        año = calendario.get(Calendar.YEAR);
        mes=calendario.get(Calendar.MONTH);
        dia=calendario.get(Calendar.DAY_OF_MONTH);
        mostrarFecha();
        escuchaFecha = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                año = year;
                mes = month;
                dia = dayOfMonth;
                mostrarFecha();
            }
        };
        return view;
    }

    protected Dialog onCreateDialog(int id){
        switch (id) {
            case 0:
                return new DatePickerDialog(getActivity(),escuchaFecha,año,mes,dia);
        }
        return null;
    }



    public void mostrarFecha(){
        campoFecha.setText(dia+"/"+mes+"/"+año);
    }
*/
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMain3Activity = (IMain3Activity) getActivity();
    }



}
