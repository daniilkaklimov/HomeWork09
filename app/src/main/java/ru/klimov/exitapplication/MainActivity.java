package ru.klimov.exitapplication;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Вы действительно хотите выйти?")
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Выходим...", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }).setNegativeButton("Нeт", null).show();
    };
}