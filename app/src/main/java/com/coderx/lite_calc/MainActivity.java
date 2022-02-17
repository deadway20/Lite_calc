package com.coderx.lite_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button num1, num2, num3, num4, num5, num6, num7, num8, num9, zero, sum, sub, mul, div, equal, point, conv, del;
    TextInputEditText nums;
    float number1, number2;
    boolean isSum, isSub, isMul, isDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nums = (TextInputEditText) findViewById(R.id.nums_txt);
        num1 = (Button) findViewById(R.id.num_one);
        num2 = (Button) findViewById(R.id.num_two);
        num3 = (Button) findViewById(R.id.num_three);
        num4 = (Button) findViewById(R.id.num_four);
        num5 = (Button) findViewById(R.id.num_five);
        num6 = (Button) findViewById(R.id.num_six);
        num7 = (Button) findViewById(R.id.num_seven);
        num8 = (Button) findViewById(R.id.num_eight);
        num9 = (Button) findViewById(R.id.num_nine);
        zero = (Button) findViewById(R.id.zero);
        sum = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.multiply);
        div = (Button) findViewById(R.id.divider);
        point = (Button) findViewById(R.id.point);
        equal = (Button) findViewById(R.id.equal);
        conv = (Button) findViewById(R.id.converter);
        del = (Button) findViewById(R.id.del);

        conv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.converter");
                startActivity(i);
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nums.setText(nums.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nums.setText(nums.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "5");
                ;
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + "0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nums.setText(nums.getText() + ".");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    number1 = Float.parseFloat(nums.getText() + "");
                    isSum = true;
                    nums.setText(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    number1 = Float.parseFloat(nums.getText() + "");
                    isSub = true;
                    nums.setText(null);
                } catch (Exception e) {
                    e.printStackTrace();

                }


            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    number1 = Float.parseFloat(nums.getText() + "");
                    isMul = true;
                    nums.setText(null);
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    number1 = Float.parseFloat(nums.getText() + "");
                    isDiv = true;
                    nums.setText(null);
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    number2 = Float.parseFloat(nums.getText() + "");

                    if (isSum == true) {
                        nums.setText(number1 + number2 + "");
                        isSum = false;
                    } else if (isSub == true) {
                        nums.setText(number1 - number2 + "");
                        isSub = false;
                    } else if (isMul == true) {
                        nums.setText(number1 * number2 + "");
                        isMul = false;
                    } else if (isDiv = true) {
                        nums.setText(number1 / number2 + "");
                        isDiv = false;
                    }
                } catch (Exception e) {
                }


            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


               String delete = nums.getText().toString();
               delete=delete.substring(0, delete.length() -1);
                nums.setText(delete);
                number1 = 0.0f;
                number2 = 0.0f;
                }catch (Exception x){

                }

            }
        });
    }
}