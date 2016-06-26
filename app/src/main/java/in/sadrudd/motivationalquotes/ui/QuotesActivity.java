package in.sadrudd.motivationalquotes.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import in.sadrudd.motivationalquotes.R;
import in.sadrudd.motivationalquotes.api.QuotesAPIHandler;

public class QuotesActivity extends AppCompatActivity implements QuotesFragment.OnFragmentInteractionListener {

    private ViewPager quotesViewPager;
    private PagerAdapter quotesPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //quotesViewPager = (ViewPager) findViewById(R.id.vpQuotes);
        //quotesPagerAdapter = new QuotesSlidePagerAdapter(getSupportFragmentManager());
        //quotesViewPager.setAdapter(quotesPagerAdapter);

        // Initialise quotesAPIHandler
        QuotesAPIHandler quotesAPIHandler = new QuotesAPIHandler();
        quotesAPIHandler.getFamousQuote();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
