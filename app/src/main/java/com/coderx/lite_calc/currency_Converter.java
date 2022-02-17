package com.coderx.lite_calc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class currency_Converter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_converter);

        String TAG ="Main" ;
        AutoCompleteTextView From_con = (AutoCompleteTextView) findViewById(R.id.from_Country_List);
        AutoCompleteTextView To_con = (AutoCompleteTextView) findViewById(R.id.to_country_List);
        TextInputEditText amount = (TextInputEditText) findViewById(R.id.Amount);
        Button convert = (Button) findViewById(R.id.Convert);
        EditText ET_Result = (EditText) findViewById(R.id.Result);
        //--------------------------------------------------------------------
        //  ----List of Counties ArrayList----
        ArrayList<String> listOfCountries = new ArrayList<>();
        listOfCountries.add(getString(R.string.USA));
        listOfCountries.add(getString(R.string.EGY));
        listOfCountries.add(getString(R.string.KSA));
        listOfCountries.add(getString(R.string.KWT));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.dropdown_menu, listOfCountries);

        From_con.setAdapter(arrayAdapter);
        To_con.setAdapter(arrayAdapter);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String from = From_con.getText().toString();
                String to = To_con.getText().toString();
                Log.d(TAG ,"Selected value "+ from);
                double Result = Double.parseDouble(amount.getText().toString());


                //---------------if Statement -----------------------
                switch (from) {
                    case "American Dollar":
                        switch (to) {
                            case "Saudi Riyal":
                                Result *= 3.75;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Egyptian Pound":
                                Result *= 15.73;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Kuwaiti Dinar":
                                Result *= 0.30;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            default:
                                Result *= 1;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                        }
                        break;
                    case "Egyptian Pound":
                        switch (to) {
                            case "American Dollar":
                                Result *= 0.064;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Saudi Riyal":
                                Result *= 0.24;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Kuwaiti Dinar":
                                Result *= 0.019;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            default:
                                Result *= 1;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                        }
                        break;
                    case "Saudi Riyal":
                        switch (to) {
                            case "American Dollar":
                                Result *= 0.27;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Egyptian Pound":
                                Result *= 4.20;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Kuwaiti Dinar":
                                Result *= 0.081;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            default:
                                Result *= 1;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                        }
                        break;
                    case "Kuwaiti Dinar":
                        switch (to) {
                            case "American Dollar":
                                Result *= 3.30;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Saudi Riyal":
                                Result *= 12.38;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            case "Egyptian Pound":
                                Result *= 51.94;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                            default:
                                Result *= 1;
                                ET_Result.setText((Double.toString(Result)));
                                break;
                        }
                        break;
                    default:
                        Result *= 1;
                        ET_Result.setText((Double.toString(Result)));
                        break;
                }
            }
        });

    }
}
