package org.pltw.bored20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonl;

    buttonl.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View v)
        {
            startActivity(new Intent(YourCurrentActivity.this,
                                    YourNewActivity.class));
        }
    }
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
