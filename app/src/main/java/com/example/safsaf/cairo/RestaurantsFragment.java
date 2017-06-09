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
public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add( new Places(getString(R.string.restaurant),getString(R.string.restaurant9),R.drawable.fayruz));
        places.add( new Places(getString(R.string.restaurant1),getString(R.string.restaurant10),R.drawable.shogun));
        places.add( new Places(getString(R.string.restaurant2),getString(R.string.restaurant11),R.drawable.birdcage));
        places.add( new Places(getString(R.string.restaurant3),getString(R.string.restaurant12),R.drawable.left));
        places.add( new Places(getString(R.string.restaurant4),getString(R.string.restaurant13),R.drawable.kosharyabou));
        places.add( new Places(getString(R.string.restaurant5),getString(R.string.restaurant14),R.drawable.carlo));
        places.add( new Places(getString(R.string.restaurant6),getString(R.string.restaurant15),R.drawable.windowsrestaurant));
        places.add( new Places(getString(R.string.restaurant7),getString(R.string.restaurant16),R.drawable.elfishawi));
        places.add( new Places(getString(R.string.restaurant8),getString(R.string.restaurant17),R.drawable.zooba));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.green_color);



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
