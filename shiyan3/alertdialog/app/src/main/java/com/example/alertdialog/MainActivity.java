package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.custom_dialog_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog();
            }
        });
    }
    public void createDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        LayoutInflater inflater = getLayoutInflater();



        builder.setView(inflater.inflate(R.layout.user, null))
                .setTitle("ANDROID APP")
                .setPositiveButton("sign in", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int id) {
                        Toast toast = Toast.makeText(MainActivity.this,

                                "Sign in", Toast.LENGTH_SHORT);

                        toast.show();
                    }

                })

                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {
                        Toast toast = Toast.makeText(MainActivity.this,

                                "Cannel", Toast.LENGTH_SHORT);

                        toast.show();
                    }

                });

        builder.create();

        builder.show();

    }}
