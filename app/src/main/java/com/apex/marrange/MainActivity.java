package com.apex.marrange;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView parties,weddings,birthday,corporateEvents;
    ImageView jovon_id,challange_id,camrage_id,coverimg_id;
    FrameLayout layoutFrame;
    LinearLayout close_btn;
    LinearLayout fullImage;


//    RecyclerView recyclerView;
//    ArrayList<String> datasource;
//    LinearLayoutManager linearLayoutManager;
//    MyRvAdapter myRvAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        layoutFrame = findViewById(R.id.layoutFrame);
        fullImage = findViewById(R.id.fullImage);
        layoutFrame.setVisibility(View.GONE);
        jovon_id = findViewById(R.id.jovon_id);
        jovon_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFrame.setVisibility(View.VISIBLE);
                fullImage.setBackgroundResource(R.drawable.jovon);
            }
        });
        challange_id = findViewById(R.id.challange_id);
        challange_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFrame.setVisibility(View.VISIBLE);
                fullImage.setBackgroundResource(R.drawable.challange);
            }
        });
        camrage_id = findViewById(R.id.camrage_id);
        camrage_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFrame.setVisibility(View.VISIBLE);
                fullImage.setBackgroundResource(R.drawable.camrage);
            }
        });
        coverimg_id = findViewById(R.id.coverimg_id);
        coverimg_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFrame.setVisibility(View.VISIBLE);
                fullImage.setBackgroundResource(R.drawable.coverimg);
            }
        });
        close_btn = findViewById(R.id.close_btn);
        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutFrame.setVisibility(View.GONE);
            }
        });
        //        MOVE ACTIVITY TO PARTIES
        parties = findViewById(R.id.parties);
        parties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),parties.class);
                startActivity(intent);
            }
        });
        //        END ACTIVITY PARTIES


        //        MOVE ACTIVITY TO WEDDINGS
        weddings = findViewById(R.id.weddings);
        weddings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,wedding.class);
                startActivity(intent);
            }
        });
        //        END ACTIVITY WEDDINGS


        //        MOVE ACTIVITY TO BIRTHDAY
        birthday = findViewById(R.id.birthday);
        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),birthday.class);
                startActivity(intent);
            }
        });
        //        END ACTIVITY BIRTHDAY

        //        MOVE ACTIVITY TO CORPORATE EVENTS
        corporateEvents = findViewById(R.id.corporateEvents);
        corporateEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),corporateEvents.class);
                startActivity(intent);
            }
        });

        //        END ACTIVITY CORPORATES EVENTS

        //datasource of RecyclerView;

//        datasource = new ArrayList<>();
//        datasource.add("Birthday");
//        datasource.add("Parties");
//        datasource.add("Corporation Events");
//        datasource.add("Weddings");
//        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
//        myRvAdapter = new MyRvAdapter(datasource);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(myRvAdapter);
        //  <-------------------------------------->

    }
    //recyclerView adapter
//    class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.myHolder> {
//        ArrayList<String> data;
//        public MyRvAdapter(ArrayList<String> data) {
//            this.data = data;
//        }
//
//        @NonNull
//        @Override
//        public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.rv_item, parent, false);
//            return new myHolder(view);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull myHolder holder, int position) {
//            holder.textView.setText(data.get(position));
//        }
//
//        @Override
//        public int getItemCount() {
//
//            return data.size();
//        }
//
//        class myHolder extends RecyclerView.ViewHolder{
//
//            TextView textView;
//            public myHolder(@NonNull View itemView) {
//                super(itemView);
//                textView = itemView.findViewById(R.id.tvText);
//            }
//        }
//    }
}