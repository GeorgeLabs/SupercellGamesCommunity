package com.georgestudios.supercellgamescommunity.view.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.georgestudios.supercellgamescommunity.R;
import com.georgestudios.supercellgamescommunity.adapter.PictureAdapterRecyclerView;
import com.georgestudios.supercellgamescommunity.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchFragment);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo5.jpg", "Edwin Jorge", "4 días", "117 Me gusta"));
        pictures.add(new Picture("http://images.eldiario.es/canariasahora/sociedad/fondos-acentejojpg_EDIIMA20140403_0542_13.jpg", "Liz Neldy", "2 días", "200 Me gusta"));
        pictures.add(new Picture("http://coolmusic.jinradio.com/wp-content/uploads/sites/2/2014/03/CoolBack7.jpg", "Elizabeth Arroyo", "1 días", "77 Me gusta"));
        return pictures;
    }

}
