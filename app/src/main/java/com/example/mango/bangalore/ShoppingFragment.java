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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        final ListView llistView = (ListView) view.findViewById(R.id.listView);
        ArrayList<Place> allPlaces = new ArrayList<>();
        allPlaces.add(new Place(getString(R.string.orionMall), getString(R.string.orionMall_desc), getString(R.string.orionMall_rating), R.drawable.orion));
        allPlaces.add(new Place(getString(R.string.phoneix), getString(R.string.phoneix_desc), getString(R.string.phoneix_rating), R.drawable.phonix));
        allPlaces.add(new Place(getString(R.string.centralMall), getString(R.string.centralMall_desc), getString(R.string.centralMall_rating), R.drawable.central));
        allPlaces.add(new Place(getString(R.string.squareMall), getString(R.string.squareMall_desc), getString(R.string.squareMall_rating), R.drawable.square));


        final PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), 0, allPlaces);
        llistView.setAdapter(placeAdapter);
        return view;
    }

}
