package com.fati.cart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView=findViewById(R.id.gridView);
        String[] itemName = {"Rose","Lotus","Lily","Jasmine", "Tulip","Orchid","Levender","RoseMarry","Sunflower"};
        int[] itemImages = {R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im1,R.drawable.im2,R.drawable.im3,R.drawable.im1,R.drawable.im2,R.drawable.im3};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,itemName,itemImages);
        gridView.setAdapter(gridAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,details.class);
                intent.putExtra("image",itemImages[position]);
                intent.putExtra("name",itemName[position]);
                getSupportActionBar().setTitle(R.string.app_name);
                startActivity(intent);
            }
    });
}
}