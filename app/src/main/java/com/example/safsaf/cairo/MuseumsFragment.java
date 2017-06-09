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
public class MuseumsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
// Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.museums), getString(R.string.museums9), R.drawable.egyptian_antiquities));
        places.add(new Places(getString(R.string.museums1), getString(R.string.museums10), R.drawable.coptic_museum));
        places.add(new Places(getString(R.string.museums2), getString(R.string.museums11), R.drawable.memphis_museum));
        places.add(new Places(getString(R.string.museums3), getString(R.string.museums12), R.drawable.gayer_anderson));
        places.add(new Places(getString(R.string.museums4), getString(R.string.museums13), R.drawable.manial_palace));
        places.add(new Places(getString(R.string.museums5), getString(R.string.museums14), R.drawable.islamic_arts));
        places.add(new Places(getString(R.string.museums6), getString(R.string.museums15), R.drawable.bayt));
        places.add(new Places(getString(R.string.museums7), getString(R.string.museums16), R.drawable.abdeen_palace));
        places.add(new Places(getString(R.string.museums8), getString(R.string.museums17), R.drawable.unknown_soldier));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.bink_color);


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
