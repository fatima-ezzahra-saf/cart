package com.fati.cart;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import java.util.ArrayList;

public class details extends AppCompatActivity {
TextView namePrd,description,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        int imageResource = intent.getIntExtra("image", 0);
        String name = intent.getStringExtra("name");

        namePrd=findViewById(R.id.textView1);
        description=findViewById(R.id.textView2);
        price=findViewById(R.id.textView3);
        ImageSlider imageSlider=findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(imageResource, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.im1_1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.im1_2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.im1_3, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        getSupportActionBar().setTitle(R.string.app_name);
        namePrd.setText(name);
        description.setText("nature");
        price.setText("prix:123dh");
    }
}