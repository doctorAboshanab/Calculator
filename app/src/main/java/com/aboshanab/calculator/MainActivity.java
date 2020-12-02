package com.aboshanab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    //declaration
    double firstnum;
    double secondnum;
    double result;
    String operation;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnequal, btnplus, btnmin,
            btndiv, btnmul, btndot, btnpluswmin, btnback, btnclear;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calling();
        handling();
    }

    void calling() {
        btn0 = findViewById(R.id.btnzero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnpluswmin = findViewById(R.id.btnpluswmin);
        btndot = findViewById(R.id.btndot);
        btnequal = findViewById(R.id.btnequal);
        btnback = findViewById(R.id.btnback);
        btnclear = findViewById(R.id.btnclear);
        editText = findViewById(R.id.editText);

    }

    void handling() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(" ");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(editText.getText().toString());
                editText.setText(" ");
                operation = "+";
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(editText.getText().toString());
                editText.setText(" ");
                operation = "-";
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(editText.getText().toString());
                editText.setText(" ");
                operation = "*";
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(editText.getText().toString());
                editText.setText(" ");
                operation = "/";
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondnum = Double.parseDouble(editText.getText().toString());
//                if (operation == "+") {
//                    result = firstnum + secondnum;
//                    editText.setText(String.valueOf(result));
//                } else if (operation == "-") {
//                    result = firstnum - secondnum;
//
//                    editText.setText(String.valueOf(result));
//                } else if (operation == "*") {
//                    result = firstnum * secondnum;
//
//                    editText.setText(String.valueOf(result));
//                } else if (operation == "/") {
//                    result = firstnum / secondnum;
//
//                    editText.setText(String.valueOf(result));
//                }
                switch (operation) {
                    case "+": result = firstnum + secondnum;
                        editText.setText(String.valueOf(result));
                        break;
                    case "-": result = firstnum - secondnum;
                        editText.setText(String.valueOf(result));
                        break;
                    case "*": result = firstnum * secondnum;
                        editText.setText(String.valueOf(result));
                        break;
                    case "/": result = firstnum / secondnum;
                        editText.setText(String.valueOf(result));
                        break;

                }

            }

        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().length() > 0) {

                    StringBuffer strB = new StringBuffer(editText.getText());
                    strB.deleteCharAt(editText.getText().length() - 1);

                    editText.setText(String.valueOf(strB));


                }
            }
        });
        btnpluswmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double turnButton = Double.parseDouble(editText.getText().toString());
                turnButton = turnButton * (-1);
                editText.setText(String.valueOf(turnButton));

            }
        });

    }
}