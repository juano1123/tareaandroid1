package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class registro extends Fragment {

    private ImageButton back;
    private ImageButton send;
    private Spinner opcion;
    private List<String> nuevo;
    private ArrayAdapter<String> adapter;
    IMain2Activity iMain2Activity;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registro, container, false);
        back = view.findViewById(R.id.imageButtonBack);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                iMain2Activity.cambiarFragment(1);
            }
        });
        send = view.findViewById(R.id.imageButtonSend);
        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                iMain2Activity.cambiarFragment(1);
            }
        });

        opcion = (Spinner) view.findViewById(R.id.opcion);
        nuevo = new ArrayList<>();
        String[] nuevo1 = new String[] {"Cliente", "Empleado"};
        Collections.addAll(nuevo,nuevo1);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item,nuevo);
        opcion.setAdapter(adapter);

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMain2Activity = (IMain2Activity) getActivity();
    }

}
