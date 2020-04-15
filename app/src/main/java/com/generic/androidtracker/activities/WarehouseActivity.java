package com.generic.androidtracker.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.generic.androidtracker.R;
import com.generic.androidtracker.adapter.WarehouseAdapter;
import com.generic.models.Warehouse;
import com.generic.models.WarehouseFactory;

public class WarehouseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.my_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.cardList);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        WarehouseFactory warehouseFactory = WarehouseFactory.getInstance();
        Warehouse warehouse = new Warehouse("W121", "12100");
        Warehouse warehouse2 = new Warehouse("W1213", "12110");
        Warehouse warehouse3 = new Warehouse("W1293", "10110");

        warehouseFactory.addWarehouse(warehouse);
        warehouseFactory.addWarehouse(warehouse2);
        warehouseFactory.addWarehouse(warehouse3);


        WarehouseAdapter warehouseAdapter = new WarehouseAdapter(warehouseFactory.getWarehouseList());

        recyclerView.setAdapter(warehouseAdapter);

    }
}
