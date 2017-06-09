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
public class ReligiousSitesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.sites), getString(R.string.sites9), R.drawable.mohamed_ali));
        places.add(new Places(getString(R.string.sites1), getString(R.string.sites10), R.drawable.hanging_church));
        places.add(new Places(getString(R.string.sites2), getString(R.string.sites11), R.drawable.citadel));
        places.add(new Places(getString(R.string.sites3), getString(R.string.sites12), R.drawable.mosque));
        places.add(new Places(getString(R.string.sites4), getString(R.string.sites13), R.drawable.mosque_azhar));
        places.add(new Places(getString(R.string.sites5), getString(R.string.sites14), R.drawable.coptic_church));
        places.add(new Places(getString(R.string.sites6), getString(R.string.sites15), R.drawable.rifai_mosque));
        places.add(new Places(getString(R.string.sites7), getString(R.string.sites16), R.drawable.ben_ezra));
        places.add(new Places(getString(R.string.sites8), getString(R.string.sites17), R.drawable.church_barbara));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.indigo_color);

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
