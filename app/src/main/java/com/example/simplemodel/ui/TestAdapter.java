package com.example.simplemodel.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplemodel.databinding.ItemTestBinding;
import com.example.simplemodel.models.TestModel;

import java.util.ArrayList;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {
    private final ArrayList<TestModel> data;

    public TestAdapter(ArrayList<TestModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemTestBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TestModel value = data.get(position);
        holder.binding.date.setText(value.getDate());
        holder.binding.red.setVisibility(value.isRed() ? View.VISIBLE : View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemTestBinding binding;

        public ViewHolder(ItemTestBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
