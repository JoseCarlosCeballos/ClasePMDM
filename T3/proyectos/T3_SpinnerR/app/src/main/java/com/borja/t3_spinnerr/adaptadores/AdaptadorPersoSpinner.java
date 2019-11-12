package com.borja.t3_spinnerr.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPersoSpinner extends BaseAdapter {

    ArrayList listaDatos;
    Context context;

    public AdaptadorPersoSpinner(ArrayList listaDatos, Context context) {
        // la lista que me pasa MainAct
        this.listaDatos = listaDatos;
        this.context = context;
    }

    // cuenta de las filas que tendrá el spinner
    @Override
    public int getCount() {
        return listaDatos.size();
    }

    // retorna el elemento (Object) que está en una posición concreta (i)
    @Override
    public Object getItem(int i) {

        return listaDatos.get(i);
    }

    // retorna el id del elemento que está seleccionado en una posición concreta (i)
    @Override
    public long getItemId(int i) {
        return 0;
    }

    // retorna un objeto de tipo view (el aspecto relleno de cada una de las filas)
    // el xml rellenado con los datos de la lista
    //
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        return null;
    }
}
