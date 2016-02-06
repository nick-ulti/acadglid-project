package com.example.aditykum.acadglidsession3assignment3;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText m_cardBalance;//card_balance
    private EditText m_interestRate;//interest_rate
    private EditText m_minimumPayment;//minimum_payment
    private EditText m_finalBalance;//final_balance
    private EditText m_monthsRemaining;//months_remaining
    private EditText m_interestpaid;//interest_paid
    private Button m_computebtn;//compute_btn
    private Button m_clearBtn;// clear_btn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        m_cardBalance = (EditText)findViewById(R.id.card_balance);
        m_interestRate = (EditText)findViewById(R.id.interest_rate);
        m_minimumPayment = (EditText)findViewById(R.id.minimum_payment);
        m_finalBalance = (EditText)findViewById(R.id.final_balance);
        m_monthsRemaining = (EditText)findViewById(R.id.months_remaining);
        m_interestpaid = (EditText)findViewById(R.id.interest_paid);
        m_computebtn = (Button)findViewById(R.id.compute_btn);
        m_clearBtn = (Button)findViewById(R.id.clear_btn);

        m_computebtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                double cardBalance = Double.parseDouble(m_cardBalance.getText().toString());
                                                double interestRate =Double.parseDouble(m_interestRate.getText().toString());
                                                double minPayment = Double.parseDouble(m_minimumPayment.getText().toString());
                                                double principle = cardBalance;
                                                double interestpaid = 0;
                                                int count =0;

                                                while(principle > minPayment) {
                                                    count++;
                                                    double monthlyFloatInterestpaid = Math.round(principle * (interestRate / (100 * 12)));
                                                    interestpaid += monthlyFloatInterestpaid;
                                                    double monthlyPrinciple = minPayment - monthlyFloatInterestpaid;
                                                    double monthlybalance = principle - monthlyPrinciple;
                                                    principle = monthlybalance;
                                                }


                                                m_finalBalance.setText(String.valueOf(principle));
                                                m_monthsRemaining.setText(String.valueOf(count));
                                                m_interestpaid.setText(String.valueOf(interestpaid));
                                            }
                                        }

        );
        m_clearBtn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              m_cardBalance.setText("");
                                              m_interestRate.setText("");
                                              m_finalBalance.setText("");
                                              m_interestpaid.setText("");
                                              m_minimumPayment.setText("");
                                              m_monthsRemaining.setText("");
                                          }
                                      }

        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
