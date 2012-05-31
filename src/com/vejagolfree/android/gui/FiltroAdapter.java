package com.vejagolfree.android.gui;

import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.vejagolfree.android.R;

public class FiltroAdapter extends BaseAdapter {

	private Context context;
	private List<String> listaFiltros;
	
	public FiltroAdapter(Context newContext, List<String> newListaFiltro, List<String> newListaFiltrosSelecionados) {
		this.context = newContext;
		this.listaFiltros = newListaFiltro;
	}
	
	@Override
	public int getCount() {
		return this.listaFiltros.size();
	}

	@Override
	public Object getItem(int position) {
		return this.listaFiltros.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Resources resources = context.getResources();
		String filtro = listaFiltros.get(position);
		
		View view = LayoutInflater.from(context).inflate(R.layout.linha_filtro, null);
		
		ImageView ivBandeiraFiltro = (ImageView)view.findViewById(R.id.ivBandeiraFiltro);
		ivBandeiraFiltro.setImageDrawable(resources.getDrawable(JogoAdapter.bandeiras.get(filtro)));
		
		TextView txtFiltro = (TextView)view.findViewById(R.id.txtFiltro);
		txtFiltro.setText(filtro);
		txtFiltro.setTextColor(context.getResources().getColor(R.color.texto_linha_filtro));
		
		return view;
	}

}
