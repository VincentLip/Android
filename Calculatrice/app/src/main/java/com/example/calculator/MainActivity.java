package com.example.calculator;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText operation;
    private EditText resultat;
    private double result;

    private String operator ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        operation = findViewById(R.id.operation);

        TableLayout tableLayout = findViewById(R.id.mainTable);
        for (int i = 0; i < tableLayout.getChildCount() ; i++) {
            TableRow tableRow = (TableRow) tableLayout.getChildAt(i);
            for (int j = 0; j < tableRow.getChildCount(); j++) {
                Button button = (Button) tableRow.getChildAt(j);
                button.setOnClickListener((e) -> {
                    operation.setText(((Button)e).getText());

                });
            }

        }

//        private void calcul() {
//            if (operator. equals ("+")) {
//                result = result + Double.valueOf(resultat. getText (). toString ()).doubleValue();
//                resultat.setText(String.valueOf (result));
//            }
//
//            if(operator. equals ("-")){
//                result = result - Double.valueOf (resultat. getText (). toString ()). doubleValue();
//                resultat.setText(String.valueOf (result));
//            }
//
//            if(operator. equals ("*")){
//                result = result * Double.valueOf (resultat. getText (). toString ()). doubleValue();
//                resultat.setText(String.valueOf (result));
//            }
//
//            if(operator.equals("/")){
//                try{
//                    result = result / Double.valueOf(resultat.getText().toString()).doubleValue();
//                    resultat.setText(String.valueOf(result));
//                }catch(ArithmeticException e){
//                    resultat. setText ("0");
//                }
//            }
    }
}