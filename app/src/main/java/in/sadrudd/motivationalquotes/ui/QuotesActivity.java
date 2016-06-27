package in.sadrudd.motivationalquotes.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import in.sadrudd.motivationalquotes.R;

public class QuotesActivity extends AppCompatActivity implements QuotesFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
