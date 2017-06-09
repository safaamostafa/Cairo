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
public class ParksFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
// Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.parks), getString(R.string.parks9), R.drawable.al_azhar));
        places.add(new Places(getString(R.string.parks1), getString(R.string.parks10), R.drawable.zamalek));
        places.add(new Places(getString(R.string.parks2), getString(R.string.parks11), R.drawable.nilometer));
        places.add(new Places(getString(R.string.parks3), getString(R.string.parks12), R.drawable.wadi_degla));
        places.add(new Places(getString(R.string.parks4), getString(R.string.parks13), R.drawable.mokkatom_mountain));
        places.add(new Places(getString(R.string.parks5), getString(R.string.parks14), R.drawable.japanese_garden));
        places.add(new Places(getString(R.string.parks6), getString(R.string.parks15), R.drawable.zoo));
        places.add(new Places(getString(R.string.parks7), getString(R.string.parks16), R.drawable.chaar_hachamaim));
        places.add(new Places(getString(R.string.parks8), getString(R.string.parks17), R.drawable.gabalaya_park));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.teal_color);
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
