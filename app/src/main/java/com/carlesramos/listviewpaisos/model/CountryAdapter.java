package com.carlesramos.listviewpaisos.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.carlesramos.listviewpaisos.R;

public class CountryAdapter extends ArrayAdapter<Country> {
    private Country[]datos;
    private Drawable d;
    public CountryAdapter(@NonNull Context context, Country[] objects) {
        super(context, R.layout.listitem_county, objects);
        datos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listitem_county, null);
        // nom pais
        TextView tvPais = item.findViewById(R.id.tvPais);
        tvPais.setText(datos[position].getCountryName());
        // nom Capital
        TextView tvCapital = item.findViewById(R.id.tvCapital);
        tvCapital.setText(datos[position].getCapital());
        //poblacio del pais
        TextView tvPoblacio = item.findViewById(R.id.tvPoblacio);
        tvPoblacio.setText(String.valueOf(datos[position].getPopulation()));
        //imagen
        ImageView ivBandera = item.findViewById(R.id.ivBandera);
        int id = this.getContext().getResources().getIdentifier("_"+datos[position].getCountryCode().toLowerCase()
                , "drawable", this.getContext().getPackageName());
        ivBandera.setImageResource(id);
        return item;
    }
}
