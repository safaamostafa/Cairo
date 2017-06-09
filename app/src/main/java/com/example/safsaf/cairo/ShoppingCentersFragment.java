package com.example.safsaf.cairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingCentersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
// Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.shop), getString(R.string.shop8), R.drawable.khan_al));
        places.add(new Places(getString(R.string.shop1), getString(R.string.shop9), R.drawable.festival));
        places.add(new Places(getString(R.string.shop2), getString(R.string.shop10), R.drawable.city));
        places.add(new Places(getString(R.string.shop3), getString(R.string.shop11), R.drawable.mall));
        places.add(new Places(getString(R.string.shop4), getString(R.string.shop12), R.drawable.wekalet));
        places.add(new Places(getString(R.string.shop5), getString(R.string.shop13), R.drawable.birqash_camel));
        places.add(new Places(getString(R.string.shop6), getString(R.string.shop14), R.drawable.street));
        places.add(new Places(getString(R.string.shop7), getString(R.string.shop15), R.drawable.souq));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.yellow_color);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        return rootView;
    }


}
