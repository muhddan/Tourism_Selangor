package com.example.tourismselangor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class feedpage extends AppCompatActivity {

    // creating variables for our edittext, button and dbhandler
    private EditText userNameEdt, userEmailEdt, userFeedbackEdt;
    private Button addSubmitBtn;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedpage);

        // initializing all our variables.
        userNameEdt = findViewById(R.id.idEdtName);
        userEmailEdt = findViewById(R.id.idEdtEmail);
        userFeedbackEdt = findViewById(R.id.idEdtFeedback);
        addSubmitBtn = findViewById(R.id.idBtnSubmit);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(feedpage.this);

        // below line is to add on click listener for our add course button.
        addSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String userName = userNameEdt.getText().toString();
                String userEmail = userEmailEdt.getText().toString();
                String userFeedback = userFeedbackEdt.getText().toString();

                // validating if the text fields are empty or not.
                if (userName.isEmpty() && userEmail.isEmpty() && userFeedback.isEmpty() ) {
                    Toast.makeText(feedpage.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewCourse(userName, userEmail, userFeedback );

                // after adding the data we are displaying a toast message.
                Toast.makeText(feedpage.this, "Feedback has been submitted.", Toast.LENGTH_SHORT).show();
                userNameEdt.setText("");
                userEmailEdt.setText("");
                userFeedbackEdt.setText("");
            }
        });
    }
}
