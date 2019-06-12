package com.example.imageviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class AnimalCustomAdapter extends ArrayAdapter<Animal> {

    Context context;
    int layoutResourceId;


    ArrayList<Animal> data;


    public AnimalCustomAdapter(Context context, int layoutResourceId, ArrayList<Animal> data) {
        super(context, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = new ArrayList<Animal>();
        this.data = data;



    }
    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        final AnimalHolder holder;





        if (row == null) {

            LayoutInflater inflater = ((MainActivity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new AnimalHolder();
            holder.animalName = row.findViewById(R.id.animal_name);
            holder.animalDescription = row.findViewById(R.id.animal_description);
            holder.animalImage = row.findViewById(R.id.animal_image);


            row.setTag(holder);

        } else {
            holder = (AnimalHolder) row.getTag();
        }

        final Animal animal = data.get(position);

        holder.animalName.setText(animal.getName());
        holder.animalDescription.setText(animal.getAnimalDescription());
        holder.animalImage.setImageResource(animal.getAnimalImage());

        //OnCLickListener

        holder.animalImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //    holder.animalImage =holder.selectedImage == View? null : holder.animalImage;
                //    int selectedImageId = holder.selectedImage == null ? 0: holder.animalImage.getId();

                //   holder.animalName.setVisibility(selectedImageId = true ? View.VISIBLE : View.INVISIBLE);
                //   holder.animalDescription.setVisibility(selectedImageId=true ? View.VISIBLE: View.INVISIBLE);


                holder.animalDescription.setVisibility(View.VISIBLE );
                holder.animalName.setVisibility(View.VISIBLE);
            }
        });









        return row;
    }



    static class AnimalHolder {

        TextView animalName;
        TextView animalDescription;
        ImageView animalImage;
        // ImageView selectedImage;

    }
}


