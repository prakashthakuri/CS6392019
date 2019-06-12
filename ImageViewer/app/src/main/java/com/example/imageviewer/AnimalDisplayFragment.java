package com.example.imageviewer;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class AnimalDisplayFragment extends Fragment {

    private ImageView selectedImage;
    private TextView selectedDescription;
    private TextView selectedName;


    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View function = inflater.inflate(R.layout.activity_main, container, false); // inflate activity_main.xml beacuse we have animalimage and animal description
        View function1 = inflater.inflate(R.layout.listview,container,false); //inflating listview.xml

        selectedImage = function1.findViewById(R.id.animal_image);
        selectedDescription = function1.findViewById(R.id.animal_description);
        selectedName = function1.findViewById(R.id.animal_name);



        return function; // returns the view that we inflated
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        //activity is created, lets attach the listeners

        addImageClickListeners();


    }

    private void addImageClickListeners() {

        View.OnClickListener imageListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedImage =selectedImage == view ? null : (ImageView) view;
                int selectedImageId = selectedImage == null ? 0: selectedImage.getId();

                selectedDescription.setVisibility(selectedImageId = View.VISIBLE);
                selectedName.setVisibility(selectedImageId=true ? View.VISIBLE: View.INVISIBLE);

            }
        };
        getView().findViewById(R.id.animal_image).setOnClickListener(imageListener);
        getView().findViewById(R.id.animal_description).setOnClickListener(imageListener);


    }







}
