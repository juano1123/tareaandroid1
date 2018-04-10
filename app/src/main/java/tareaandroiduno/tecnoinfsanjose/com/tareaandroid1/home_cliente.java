package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;


public class home_cliente extends Fragment {


    IMain3Activity iMain3Activity;
    private int año;
    private int mes;
    private int dia;
    private EditText campoFecha;
    private Button botonFecha;
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener escuchaFecha;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_cliente, container, false);
        campoFecha = view.findViewById(R.id.editTextFecha);
        botonFecha = view.findViewById(R.id.buttonCalendario);
        Calendar aCurrentDate;
        int day;
        int month;
        int year;
        aCurrentDate = Calendar.getInstance();
        day = aCurrentDate.get(Calendar.DAY_OF_MONTH);
        month = aCurrentDate.get(Calendar.MONTH);
        year = aCurrentDate.get(Calendar.YEAR);

        month = month+1;
        campoFecha.setText(day+"/"+month+"/"+year);

       /*botonFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month+1;
                        campoFecha.setText(dayOfMonth+"/"+month+"/"+year);
                    }
                }, day, month, year);
                datePickerDialog.show();
            }
        });*/
    return view;
    }






    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMain3Activity = (IMain3Activity) getActivity();
    }




}

