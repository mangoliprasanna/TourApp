package com.example.mango.bangalore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends Fragment {


    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_place, container, false);
        final ListView llistView = (ListView) view.findViewById(R.id.listView);

        ArrayList<Place> allPlaces = new ArrayList<>();
        allPlaces.add(new Place(getString(R.string.vidhanSoudh), getString(R.string.vidhanSoudha_desc), getString(R.string.vidhanSoudha_rating), R.drawable.vidhansoudha));
        allPlaces.add(new Place(getString(R.string.lalBagh), getString(R.string.lalBagh_desc), getString(R.string.lalBagh_rating), R.drawable.lal_bagh));
        allPlaces.add(new Place(getString(R.string.cubbonPark), getString(R.string.cubbonPark_desc), getString(R.string.cubbonPark_rating), R.drawable.cubbonpark));
        allPlaces.add(new Place(getString(R.string.wonderLa), getString(R.string.wonderLa_desc), getString(R.string.wonderLa_rating), R.drawable.wonderla));
        allPlaces.add(new Place(getString(R.string.iskontempl), getString(R.string.iskontempl_desc), getString(R.string.iskontempl_rating), R.drawable.iskon));


        final PlaceAdapter placeAdapter = new PlaceAdapter(getContext(), 0, allPlaces);
        llistView.setAdapter(placeAdapter);
        return view;
    }

}
