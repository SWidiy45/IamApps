package com.apps.swidiy.semangatsiska;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_POSTING = "extra_posting";

   private TextView title;
   private TextView description;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Posting posting = getIntent().getParcelableExtra(EXTRA_POSTING);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle(posting.getTitle());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        title = findViewById(R.id.title_tv);
        description = findViewById(R.id.description_tv);

        String title1 = posting.getTitle();
        String description1 = posting.getDescription();

        title.setText(title1);
        description.setText(description1);

    }
}
