package com.shahnawazshaikh.checkingstringtype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    LinearLayout layoutQ, layoutOp1,layoutOp2,layoutOp3,layoutOp4;
    ImageView imgQ,imgOp1,imgOp2,imgOp3,imgOp4;
    TextView textQ,textOp1,textOp2,textOp3,textOp4;

    ArrayList<MyBean> list;
    int counter=-1;
    int buttonid=121;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<MyBean>();
        list.add(new MyBean("https://images-na.ssl-images-amazon.com/images/I/61f97HU97-L._AC_.jpg","C programming","Java Programming","Cpp Programming","Python Programming"));
        list.add( new MyBean("https://www.sitesbay.com/program/images/Fibonacci-Series.png","Programming-1","Programming-2","Programming-3","Programming-4"));

        list.add( new MyBean("What is the name of your pet ?","Jack n Jone","Spy Heart","Lucofi The dog","Novilia estranee"));
        list.add( new MyBean("What is the name of your College ?","MAIT","https://images.static-collegedunia.com/public/college_data/images/logos/1511782600Logo.jpg","MSIT","https://www.gniotgroup.edu.in/index/images/GNIOT-Logo.png"));
        list.add( new MyBean("https://www.sitesbay.com/program/images/Fibonacci-Series.png","1 2 3 4 5","https://images.static-collegedunia.com/public/college_data/images/logos/1511782600Logo.jpg","https://images-na.ssl-images-amazon.com/images/I/61f97HU97-L._AC_.jpg","https://www.gniotgroup.edu.in/index/images/GNIOT-Logo.png"));
        layout = findViewById(R.id.layoutmain);
         layoutOp1= findViewById(R.id.LayoutOp1);
        layoutOp2= findViewById(R.id.LayoutOp2);
        layoutOp3= findViewById(R.id.LayoutOp3);
        layoutOp4= findViewById(R.id.LayoutOp4);


        imgQ=findViewById(R.id.ImgQ);
        textQ=findViewById(R.id.TextQ);


        imgOp1=findViewById(R.id.ImgOp1);
        imgOp2=findViewById(R.id.ImgOp2);
        imgOp3=findViewById(R.id.ImgOp3);
        imgOp4=findViewById(R.id.ImgOp4);

        textOp1=findViewById(R.id.TextOp1);
        textOp2=findViewById(R.id.TextOp2);
        textOp3=findViewById(R.id.TextOp3);
        textOp4=findViewById(R.id.TextOp4);


        counter+=1;
        loadQuestions(counter);

        layoutOp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               counter+=1;
               loadQuestions(counter);
            }
        });
        layoutOp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                loadQuestions(counter);
            }
        });
        layoutOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                loadQuestions(counter);
            }
        });
        layoutOp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                loadQuestions(counter);
            }
        });

    }
    private void loadQuestions(final int counter) {
//
//        Toast.makeText(MainActivity.this,"Counter="+counter,Toast.LENGTH_SHORT).show();
        if(counter<list.size()){
            imgOp1.setVisibility(View.GONE);
            imgOp2.setVisibility(View.GONE);
            imgOp3.setVisibility(View.GONE);
            imgOp4.setVisibility(View.GONE);
            textOp1.setVisibility(View.GONE);
            textOp2.setVisibility(View.GONE);
            textOp3.setVisibility(View.GONE);
            textOp4.setVisibility(View.GONE);

            imgQ.setVisibility(View.GONE);
            textQ.setVisibility(View.GONE);
            MyBean myBean=list.get(counter);
            if(myBean.isViewableImage(myBean.getQuestion())){

//                 ImageView question = new ImageView(MainActivity.this);
//                question.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                question.setMaxHeight(400);
//                question.setMaxWidth(400);
//                question.setId(R.id.img1);
//                layout.addView(question);
                imgQ.setVisibility(View.VISIBLE);
                Picasso.get().load(myBean.getQuestion()).into(imgQ);
            }
            else{
//                TextView question=new TextView(MainActivity.this);
//                question.setText(myBean.getQuestion());
//                question.setId(R.id.img1);
//                question.setTextSize(22);
//                layout.addView(question);
                textQ.setVisibility(View.VISIBLE);
                textQ.setText(myBean.getQuestion());
            }
            if(myBean.isViewableImage(myBean.getQ1())){
//                ImageView option1 = new ImageView(MainActivity.this);
//                option1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                option1.setMaxHeight(400);
//                option1.setMaxWidth(400);
//                option1.setId(R.id.img2);
//                layout.addView(option1);
                imgOp1.setVisibility(View.VISIBLE);
                Picasso.get().load(myBean.getQ1()).into(imgOp1);

//                imgOp1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
////                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });
            }
            else{
//                TextView option1=new TextView(MainActivity.this);
//                option1.setText(myBean.getQ1());
//                option1.setId(R.id.img2);
//                option1.setTextSize(20);
//                layout.addView(option1);

                textOp1.setVisibility(View.VISIBLE);
                textOp1.setText(myBean.getQ1());
//                textOp1.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
////                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });


            }
            if(myBean.isViewableImage(myBean.getQ2())){

//                ImageView option2 = new ImageView(MainActivity.this);
//                option2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                option2.setMaxHeight(400);
//                option2.setMaxWidth(400);
//                option2.setId(R.id.img3);
//                layout.addView(option2);
                imgOp2.setVisibility(View.VISIBLE);
                Picasso.get().load(myBean.getQ2()).into(imgOp2);
//                imgOp2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });
            }
            else{
//                TextView option2=new TextView(MainActivity.this);
//                option2.setText(myBean.getQ2());
//                option2.setId(R.id.img3);
//                option2.setTextSize(20);
//                layout.addView(option2);

                textOp2.setVisibility(View.VISIBLE);
                textOp2.setText(myBean.getQ2());
//                textOp2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });


            }
            if(myBean.isViewableImage(myBean.getQ3())){
//                ImageView option3 = new ImageView(MainActivity.this);
//                option3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                option3.setMaxHeight(400);
//                option3.setMaxWidth(400);
//                option3.setId(R.id.img4);
//                layout.addView(option3);
                imgOp3.setVisibility(View.VISIBLE);
                Picasso.get().load(myBean.getQ3()).into(imgOp3);
//                imgOp2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });

            }
            else{
//                TextView option3=new TextView(MainActivity.this);
//                option3.setText(myBean.getQ3());
//                option3.setId(R.id.img4);
//                option3.setTextSize(20);
//                layout.addView(option3);

                textOp3.setVisibility(View.VISIBLE);
                textOp3.setText(myBean.getQ3());
//                textOp3.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });
            }
            if(myBean.isViewableImage(myBean.getQ4())){
//                ImageView option4 = new ImageView(MainActivity.this);
//                option4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                option4.setMaxHeight(400);
//                option4.setMaxWidth(400);
//                option4.setId(R.id.img5);
//                layout.addView(option4);
                imgOp4.setVisibility(View.VISIBLE);
                Picasso.get().load(myBean.getQ4()).into(imgOp4);
//                imgOp4.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });

            }
            else{
//                TextView option4=new TextView(MainActivity.this);
//                option4.setText(myBean.getQ4());
//                option4.setId(R.id.img5);
//                option4.setTextSize(20);
//                layout.addView(option4);

                textOp4.setVisibility(View.VISIBLE);
                textOp4.setText(myBean.getQ4());
//                textOp4.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        int counter2=counter;
//                        layout.removeAllViews();
//                        counter2+=1;
//                        loadQuestions(counter2);
//                    }
//                });
            }
        }
        else{
            Toast.makeText(MainActivity.this,"Question is finished",Toast.LENGTH_SHORT).show();
            return;
        }
    }

}
