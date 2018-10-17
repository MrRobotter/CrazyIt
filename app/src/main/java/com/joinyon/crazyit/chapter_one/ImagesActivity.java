package com.joinyon.crazyit.chapter_one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.joinyon.crazyit.R;

public class ImagesActivity extends AppCompatActivity {
    private int[] images = new int[]{R.drawable.image_one, R.drawable.image_two, R.drawable.image_three, R.drawable.image_four};

    private int currentImg = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        final ImageView image = new ImageView(this);
        main.addView(image);
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //算法问题
                image.setImageResource(images[++currentImg % images.length]);
            }
        });
    }
}
