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
public class GamesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of hotels
        ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getString(R.string.games), getString(R.string.games21), R.drawable.kidzania));
        places.add(new Places(getString(R.string.games1), getString(R.string.games22), R.drawable.hinthunt));
        places.add(new Places(getString(R.string.games2), getString(R.string.games23), R.drawable.escape));
        places.add(new Places(getString(R.string.games3), getString(R.string.games24), R.drawable.escapers));
        places.add(new Places(getString(R.string.games4), getString(R.string.games25), R.drawable.breakout));
        places.add(new Places(getString(R.string.games5), getString(R.string.games26), R.drawable.xcape));
        places.add(new Places(getString(R.string.games6), getString(R.string.games27), R.drawable.trapped));
        places.add(new Places(getString(R.string.games7), getString(R.string.games28), R.drawable.mindmaze));
        places.add(new Places(getString(R.string.games8), getString(R.string.games29), R.drawable.escape_egypt));
        places.add(new Places(getString(R.string.games9), getString(R.string.games30), R.drawable.sherlocked));
        places.add(new Places(getString(R.string.games10), getString(R.string.games31), R.drawable.teamescape));
        places.add(new Places(getString(R.string.games11), getString(R.string.games32), R.drawable.horror));
        places.add(new Places(getString(R.string.games12), getString(R.string.games33), R.drawable.maze));
        places.add(new Places(getString(R.string.games13), getString(R.string.games34), R.drawable.place));
        places.add(new Places(getString(R.string.games14), getString(R.string.games35), R.drawable.lockedin));
        places.add(new Places(getString(R.string.games15), getString(R.string.games36), R.drawable.half));
        places.add(new Places(getString(R.string.games16), getString(R.string.games37), R.drawable.adrenalin));
        places.add(new Places(getString(R.string.games17), getString(R.string.games38), R.drawable.casino));
        places.add(new Places(getString(R.string.games18), getString(R.string.games39), R.drawable.exit));
        places.add(new Places(getString(R.string.games19), getString(R.string.games40), R.drawable.escape_games));
        places.add(new Places(getString(R.string.games20), getString(R.string.games41), R.drawable.music));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.grey_color);

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
