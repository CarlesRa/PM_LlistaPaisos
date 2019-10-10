package com.carlesramos.listviewpaisos.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Icon;
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
        ivBandera.setImageDrawable(ivBandera.getResources().getDrawable(Icons[position]));
        return item;
    }

    public static final Integer[] Icons = {
            R.drawable._ad,
            R.drawable._ae,
            R.drawable._af,
            R.drawable._ag,
            R.drawable._ai,
            R.drawable._al,
            R.drawable._am,
            R.drawable._an,
            R.drawable._ao,
            R.drawable._aq,
            R.drawable._as,
            R.drawable._at,
            R.drawable._au,
            R.drawable._aw,
            R.drawable._az
    };
}
