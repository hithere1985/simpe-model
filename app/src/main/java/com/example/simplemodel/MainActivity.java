package com.example.simplemodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.simplemodel.databinding.ActivityMainBinding;
import com.example.simplemodel.models.TestModel;
import com.example.simplemodel.ui.TestAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final ArrayList<TestModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i = 0; i < 31; i++) {
            data.add(new TestModel(String.format("2021-12-%02d", i + 1)));
        }

        TestAdapter testAdapter = new TestAdapter(data);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerView.setAdapter(testAdapter);
        binding.button.setOnClickListener(v -> {
            data.get(10).setRed(true);
            data.get(15).setRed(true);
            testAdapter.notifyDataSetChanged();
        });

    }
}