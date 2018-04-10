package tareaandroiduno.tecnoinfsanjose.com.tareaandroid1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class login extends Fragment {


    private TextView Login;
    private TextView RegisterHere;
    IMain2Activity iMain2Activity;
    IMain3Activity iMain3Activity;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        RegisterHere = view.findViewById(R.id.textViewRegisterHere);
        Login = view.findViewById(R.id.textViewLogin);
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                iMain2Activity.cambiarActivity(1);
            }
        });
        RegisterHere.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1){
                iMain2Activity.cambiarFragment(2);
            }
        });

        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMain2Activity = (IMain2Activity) getActivity();
    }


}
