package demo.showcase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.attr.value;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }


    protected void goToReports(){
        Intent myIntent = new Intent(MainPageActivity.this, ReportActivity.class);
        MainPageActivity.this.startActivity(myIntent);
    }

    static {
        System.loadLibrary("native-lib");
    }
}
