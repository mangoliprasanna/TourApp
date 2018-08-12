package com.example.mango.bangalore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        final ListView llistView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Place> allPlaces = new ArrayList<>();
        allPlaces.add(new Place(getString(R.string.restaurant_1), getString(R.string.restaurant_1_desc), getString(R.string.restaurant_1_rating), R.drawable.ic_restaurant));
        allPlaces.add(new Place(getString(R.string.restaurant_2), getString(R.string.restaurant_2_desc), getString(R.string.restaurant_2_rating), R.drawable.ic_restaurant));
        allPlaces.add(new Place(getString(R.string.restaurant_3), getString(R.string.restaurant_3_desc), getString(R.string.restaurant_3_rating), R.drawable.ic_restaurant));
        allPlaces.add(new Place(getString(R.string.restaurant_4), getString(R.string.restaurant_4_desc), getString(R.string.restaurant_4_rating), R.drawable.ic_restaurant));
        allPlaces.add(new Place(getString(R.string.restaurant_5), getString(R.string.restaurant_5_desc), getString(R.string.restaurant_5_rating), R.drawable.ic_restaurant));


        final PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), 0, allPlaces);
        llistView.setAdapter(placeAdapter);
        return view;
    }

}
