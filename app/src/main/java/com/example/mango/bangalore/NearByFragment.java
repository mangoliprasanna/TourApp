package com.example.mango.bangalore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NearByFragment extends Fragment {


    public NearByFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_near_by, container, false);
        final ListView llistView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Place> allPlaces = new ArrayList<>();
        allPlaces.add(new Place(getString(R.string.nearBy_1), getString(R.string.nearBy_1_desc), getString(R.string.nearBy_1_rating), R.drawable.mysour));
        allPlaces.add(new Place(getString(R.string.nearBy_2), getString(R.string.nearBy_2_desc), getString(R.string.nearBy_2_rating), R.drawable.falls1));
        allPlaces.add(new Place(getString(R.string.nearBy_3), getString(R.string.nearBy_3_desc), getString(R.string.nearBy_3_rating), R.drawable.falls2));
        allPlaces.add(new Place(getString(R.string.nearBy_4), getString(R.string.nearBy_3_desc), getString(R.string.nearBy_3_rating), R.drawable.hills1));
        allPlaces.add(new Place(getString(R.string.nearBy_5), getString(R.string.nearBy_5_desc), getString(R.string.nearBy_5_rating), R.drawable.bnp));


        final PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), 0, allPlaces);
        llistView.setAdapter(placeAdapter);
        return view;
    }

}
