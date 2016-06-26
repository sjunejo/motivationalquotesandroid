package in.sadrudd.motivationalquotes.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by sjunjo on 26/06/2016.
 */
public class QuotesSlidePagerAdapter extends FragmentStatePagerAdapter {

    public QuotesSlidePagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new QuotesFragment();
    }

    @Override
    public int getCount() {
        return 0;
    }
}
