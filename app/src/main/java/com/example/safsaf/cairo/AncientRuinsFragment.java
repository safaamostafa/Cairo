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
public class AncientRuinsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.ancient), getString(R.string.ancient9), R.drawable.keops_pyramid));
        places.add(new Places(getString(R.string.ancient1), getString(R.string.ancient10), R.drawable.gizeh_plateau));
        places.add(new Places(getString(R.string.ancient2), getString(R.string.ancient11), R.drawable.saqqara_pyramids));
        places.add(new Places(getString(R.string.ancient3), getString(R.string.ancient12), R.drawable.dahshur));
        places.add(new Places(getString(R.string.ancient4), getString(R.string.ancient13), R.drawable.statue_ramesses));
        places.add(new Places(getString(R.string.ancient5), getString(R.string.ancient14), R.drawable.step_pyramid));
        places.add(new Places(getString(R.string.ancient6), getString(R.string.ancient15), R.drawable.mastaba_mereruka));
        places.add(new Places(getString(R.string.ancient7), getString(R.string.ancient16), R.drawable.tomb_nefertari));
        places.add(new Places(getString(R.string.ancient8), getString(R.string.ancient17), R.drawable.serapeum));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.purple_color);

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
