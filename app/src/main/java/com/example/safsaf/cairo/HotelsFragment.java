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
public class HotelsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.hotel), getString(R.string.hotel9), R.drawable.four_seasons));
        places.add(new Places(getString(R.string.hotel1), getString(R.string.hotel10), R.drawable.kmpinski));
        places.add(new Places(getString(R.string.hotel2), getString(R.string.hotel11), R.drawable.fairmont));
        places.add(new Places(getString(R.string.hotel3), getString(R.string.hotel12), R.drawable.jw_marriott));
        places.add(new Places(getString(R.string.hotel4), getString(R.string.hotel13), R.drawable.conrad));
        places.add(new Places(getString(R.string.hotel5), getString(R.string.hotel14), R.drawable.ramses_hilton));
        places.add(new Places(getString(R.string.hotel6), getString(R.string.hotel15), R.drawable.hilton_cairo));
        places.add(new Places(getString(R.string.hotel7), getString(R.string.hotel16), R.drawable.city_view));
        places.add(new Places(getString(R.string.hotel8), getString(R.string.hotel17), R.drawable.novotel));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.red_color);

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
