package com.sriyanksiddhartha.multiplescreendemo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sriyanksiddhartha.multiplescreendemo.R;
import com.sriyanksiddhartha.multiplescreendemo.data.Landscape;
import com.sriyanksiddhartha.multiplescreendemo.data.RecyclerAdapter;

public class ListFragmentA extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_a_list, null);

		setupRecyclerView(view);

		return view;
	}

	private void setupRecyclerView(View view) {

		RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
		RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), Landscape.getData());
		recyclerView.setAdapter(adapter);

		LinearLayoutManager manager = new LinearLayoutManager(getActivity());
		manager.setOrientation(LinearLayoutManager.VERTICAL);
		recyclerView.setLayoutManager(manager);
	}
}
