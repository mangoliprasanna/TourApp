package com.example.mango.bangalore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(Context context, int resource, List<Place> objects) {
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if(listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.place_list, parent, false);
        }

        TextView placeName = (TextView) listView.findViewById(R.id.placeName);
        TextView placeDesc = (TextView) listView.findViewById(R.id.placeDesc);
        ImageView placeImage = (ImageView) listView.findViewById(R.id.placeImage);
        RatingBar placeRating = (RatingBar) listView.findViewById(R.id.ratingBar);
        //ImageButton placeMap = (ImageButton) listView.findViewById(R.id.placeLink)

        Place currentPlace = getItem(position);
        placeRating.setRating(Float.parseFloat(currentPlace.getPlaceRating()));
        placeDesc.setText(currentPlace.getPlaceDesc());
        placeImage.setImageResource(currentPlace.getPlaceImage());
        placeName.setText(currentPlace.getPlaceName());

        return listView;
    }
}
