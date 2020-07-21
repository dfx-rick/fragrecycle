package com.example.fragrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {

    TextView tvname, tvnum;
    EditText etname;
    EditText etnum;
    Button addbutton;
    ListFrag listFrag;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname=findViewById(R.id.tvname);
        tvnum=findViewById(R.id.tvnum);
        etname=findViewById(R.id.etname);
        etnum=findViewById(R.id.etnum);
        addbutton=findViewById(R.id.addbutton);
        fragmentManager=this.getSupportFragmentManager();
        listFrag=(ListFrag) fragmentManager.findFragmentById(R.id.fragment);

        addbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(etname.getText().toString().isEmpty()||etnum.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please Enter All Fields", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    Applicationclass.people.add(new Person(etname.getText().toString().trim(), etnum.getText().toString().trim()));
                    Toast.makeText(MainActivity.this, "Person Added successfully", Toast.LENGTH_SHORT).show();
                    etname.setText(null);
                    etnum.setText(null);
                    listFrag.notifydatachange();
                }

            }
        });
    onItemClicked(0);
    }

    @Override
    public void onItemClicked(int index) {

        tvname.setText(Applicationclass.people.get(index).getName());
        tvnum.setText(Applicationclass.people.get(index).getTelmun());

    }
}