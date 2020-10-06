package com.bam.q.barbershop;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.example.brad.barbershop.R;

public class BarberGallery extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    Integer[] imageIDs =
            {
                    R.drawable.gal1,
                    R.drawable.gal2,
                    R.drawable.gal3,
                    R.drawable.gal4,
                    R.drawable.gal5,
                    R.drawable.gal6,
                    R.drawable.gal7,
                    R.drawable.gal8,
                    R.drawable.gal9,
                    R.drawable.gal10,
                    R.drawable.gal11};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber_gallery);
        Gallery gallery = findViewById(R.id.mygallery);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView adapterView,View view,int position,long id)
    {
        ImageView imageView= findViewById(R.id.myimage);
        imageView.setImageResource(imageIDs[position]);
    }

    public class ImageAdapter extends BaseAdapter
    {
        Context ctx;
        int itemBackground;
        public ImageAdapter(Context ctx)
        {
            this.ctx = ctx;
            TypedArray array = obtainStyledAttributes(R.styleable.MyGallery);
            itemBackground = array.getResourceId
                    (R.styleable.MyGallery_android_galleryItemBackground, 0);
            array.recycle();
        }
        public int getCount()
        {
            return imageIDs.length;
        }
        public Object getItem(int position)
        {
            return position;
        }
        public long getItemId(int position)
        {
            return position;
        }
        public View getView(int position, View convertView, ViewGroup parent)
        {
            ImageView imageView=new ImageView(ctx);
            imageView.setImageResource(imageIDs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new Gallery.LayoutParams(400,400));
            return imageView;
        }
    }
}