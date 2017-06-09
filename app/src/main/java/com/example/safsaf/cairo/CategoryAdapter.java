package com.example.safsaf.cairo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Safsaf on 6/9/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else if (position == 3) {
            return new AncientRuinsFragment();
        } else if (position == 4) {
            return new ReligiousSitesFragment();
        } else if (position == 5) {
            return new ParksFragment();
        } else if (position == 6) {
            return new ShoppingCentersFragment();
        } else {
            return new GamesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 3) {
            return mContext.getString(R.string.category_ancient_ruins);
        } else if (position == 4) {
            return mContext.getString(R.string.category_religious_sites);
        } else if (position == 5) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 6) {
            return mContext.getString(R.string.category_shopping_centers);
        } else {
            return mContext.getString(R.string.category_games);
        }
    }
}
