package com.example.astroid_neostats;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String TAG= MainActivity.class.getCanonicalName();
    Boolean startDateStatus = false, endDateStatus = false;
    DatePickerDialog picker;
    EditText startDateText, endDateText;
    Button btnGet;
    TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTextView = findViewById(R.id.dateText);
        startDateText = findViewById(R.id.startDateText);
        startDateText.setInputType(InputType.TYPE_NULL);
        startDateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                startDateText.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                                startDateStatus = true;
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        endDateText = findViewById(R.id.endDateText);
        endDateText.setInputType(InputType.TYPE_NULL);
        endDateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                                Long minDate = Long.parseLong(startDateText.getText().toString());
//                                view.setMinDate(minDate);
                                endDateText.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                                endDateStatus = true;
                            }
                        }, year, month, day);
                picker.show();
            }
        });


        btnGet = findViewById(R.id.dataButton);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startDateStatus && endDateStatus) {
                    dateTextView.setText("https://api.nasa.gov/neo/rest/v1/feed?start_date=" + startDateText.getText() +
                            "&end_date=" + endDateText.getText() + "&api_key=DEMO_KEY");
                    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.nasa.gov").addConverterFactory(GsonConverterFactory.create()).build();
                    AstroidNeoStatInterface service = retrofit.create(AstroidNeoStatInterface.class);
                    service.getAstroidData(startDateText.getText().toString(),endDateText.getText().toString(),"DEMO_KEY")
                            .enqueue(new Callback<List<NeoData>>() {
                                @Override
                                public void onResponse(Call<List<NeoData>> call, Response<List<NeoData>> response) {
                                    if(!response.isSuccessful()){

                                        if (response.code() == 403) {
                                            Headers headers = response.headers();
                                            Set<String> headerNames = headers.names();

                                            long rateLimitReset = 0;

                                            for (String headerName : headerNames) {
                                                String headerValue = headers.get(headerName);
                                                if (headerValue == null) {
                                                    continue;
                                                }
                                                if (headerName.equals("X-RateLimit-Reset")) {
                                                    rateLimitReset = Long.valueOf(headers.get(headerName));
                                                    break;
                                                }
                                            }

                                            if (rateLimitReset != 0) {
                                                Date resetData = new Date(rateLimitReset * 1000);
                                                String resetTimeText = DateFormat.getTimeInstance().format(resetData);
                                                Log.i(TAG, "You exided your API Rate limit . Try again after" + resetTimeText);
                                            }

                                        }
                                        Log.i(TAG, "");
                                        return;
                                    }

                                    if(response.body()!=null){
                                        Log.i(TAG, "onResponse: "+response.body().toString());
                                    }
                                }

                                @Override
                                public void onFailure(Call<List<NeoData>> call, Throwable t) {
                                    Log.i(TAG, "onFailure: "+t.getLocalizedMessage());
                                }
                            });


                } else {
                    dateTextView.setText("Select StartDate and EndDate");
                }
            }
        });
    }
}
