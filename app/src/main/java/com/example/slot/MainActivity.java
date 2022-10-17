package com.example.slot;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;

;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ImageView img1x1, img1x2, img1x3;
    ImageView img2x1, img2x2, img2x3;
    ImageView img3x1, img3x2, img3x3;
    ImageView img4x1, img4x2, img4x3;
    ImageView img5x1, img5x2, img5x3;

    ImageView imgReel1x4, imgReel1x5, imgReel1x6;
    ImageView imgReel2x4, imgReel2x5, imgReel2x6;
    ImageView imgReel3x4, imgReel3x5, imgReel3x6;
    ImageView imgReel4x4, imgReel4x5, imgReel4x6;
    ImageView imgReel5x4, imgReel5x5, imgReel5x6;


    int intIcon1x1, intIcon1x2, intIcon1x3;
    int intIcon2x1, intIcon2x2, intIcon2x3;
    int intIcon3x1, intIcon3x2, intIcon3x3;
    int intIcon4x1, intIcon4x2, intIcon4x3;
    int intIcon5x1, intIcon5x2, intIcon5x3;


    int intIcons;

    TextView textCredits;
    TextView textBet;

    Animation animReelIn1, animReelOut1;
    Animation animReelIn2, animReelOut2;
    Animation animReelIn3, animReelOut3;
    Animation animReelIn4, animReelOut4;
    Animation animReelIn5, animReelOut5;

    ViewSwitcher viewSwitcherR1, viewSwitcherR2, viewSwitcherR3, viewSwitcherR4, viewSwitcherR5;

    Handler hand1, hand2, hand3, hand4, hand5;




    int IntIcons1x1, IntIcons1x2, IntIcons1x3;
    int IntIcons2x1, IntIcons2x2, IntIcons2x3;
    int IntIcons3x1, IntIcons3x2, IntIcons3x3;
    int IntIcons4x1, IntIcons4x2, IntIcons4x3;
    int IntIcons5x1, IntIcons5x2, IntIcons5x3;


    boolean bolSpinReels;

    int spinReels1, spinReels2, spinReels3, spinReels4, spinReels5;

    ImageView imageViewSpin;
    ImageView imageViewPlus;
    ImageView imageViewMinus;



    int CREDITS=10000;
    int BET=100;
    int TOTALBET;
    int COUNT_WIN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1x1 = findViewById(R.id.ImageReel1x1);
        img1x2 = findViewById(R.id.ImageReel1x2);
        img1x3 = findViewById(R.id.ImageReel1x3);
        img2x1 = findViewById(R.id.ImageReel2x1);
        img2x2 = findViewById(R.id.ImageReel2x2);
        img2x3 = findViewById(R.id.ImageReel2x3);
        img3x1 = findViewById(R.id.ImageReel3x1);
        img3x2 = findViewById(R.id.ImageReel3x2);
        img3x3 = findViewById(R.id.ImageReel3x3);
        img4x1 = findViewById(R.id.ImageReel4x1);
        img4x2 = findViewById(R.id.ImageReel4x2);
        img4x3 = findViewById(R.id.ImageReel4x3);
        img5x1 = findViewById(R.id.ImageReel5x1);
        img5x2 = findViewById(R.id.ImageReel5x2);
        img5x3 = findViewById(R.id.ImageReel5x3);


        imgReel1x4 = findViewById(R.id.ImageReel1x4);
        imgReel1x5 = findViewById(R.id.ImageReel1x5);
        imgReel1x6 = findViewById(R.id.ImageReel1x6);
        imgReel2x4 = findViewById(R.id.ImageReel2x4);
        imgReel2x5 = findViewById(R.id.ImageReel2x5);
        imgReel2x6 = findViewById(R.id.ImageReel2x6);
        imgReel3x4 = findViewById(R.id.ImageReel3x4);
        imgReel3x5 = findViewById(R.id.ImageReel3x5);
        imgReel3x6 = findViewById(R.id.ImageReel3x6);
        imgReel4x4 = findViewById(R.id.ImageReel4x4);
        imgReel4x5 = findViewById(R.id.ImageReel4x5);
        imgReel4x6 = findViewById(R.id.ImageReel4x6);
        imgReel5x4 = findViewById(R.id.ImageReel5x4);
        imgReel5x5 = findViewById(R.id.ImageReel5x5);
        imgReel5x6 = findViewById(R.id.ImageReel5x6);





        animReelIn1 = AnimationUtils.loadAnimation(this, R.anim.a_reel_in);
        animReelOut1 = AnimationUtils.loadAnimation(this, R.anim.a_reel_out);
        animReelIn2 = AnimationUtils.loadAnimation(this, R.anim.a_reel_in);
        animReelOut2 = AnimationUtils.loadAnimation(this, R.anim.a_reel_out);
        animReelIn3 = AnimationUtils.loadAnimation(this, R.anim.a_reel_in);
        animReelOut3 = AnimationUtils.loadAnimation(this, R.anim.a_reel_out);
        animReelIn4 = AnimationUtils.loadAnimation(this, R.anim.a_reel_in);
        animReelOut4 = AnimationUtils.loadAnimation(this, R.anim.a_reel_out);
        animReelIn5 = AnimationUtils.loadAnimation(this, R.anim.a_reel_in);
        animReelOut5 = AnimationUtils.loadAnimation(this, R.anim.a_reel_out);

        viewSwitcherR1 = findViewById(R.id.viewSwitcher1);
        viewSwitcherR2 = findViewById(R.id.viewSwitcher2);
        viewSwitcherR3 = findViewById(R.id.viewSwitcher3);
        viewSwitcherR4 = findViewById(R.id.viewSwitcher4);
        viewSwitcherR5 = findViewById(R.id.viewSwitcher5);

        textCredits = findViewById(R.id.textViewCredits);
        textCredits.setText(String.valueOf(CREDITS));

        textBet = findViewById(R.id.textViewBet);
        textBet.setText(String.valueOf(BET));

        imageViewSpin = findViewById(R.id.imageViewSpin);
        imageViewSpin.setOnClickListener(this);

        imageViewPlus = findViewById(R.id.imageViewPlus);
        imageViewPlus.setOnClickListener(this);

        imageViewMinus = findViewById(R.id.imageViewMinus);
        imageViewMinus.setOnClickListener(this);


        SlotStart();

    }

    private void SlotStart() {
        img1x1.setImageResource(R.drawable.i_icon_1);
        img1x2.setImageResource(R.drawable.i_icon_2);
        img1x3.setImageResource(R.drawable.i_icon_3);

        img2x1.setImageResource(R.drawable.i_icon_4);
        img2x2.setImageResource(R.drawable.i_icon_5);
        img2x3.setImageResource(R.drawable.i_icon_6);

        img3x1.setImageResource(R.drawable.i_icon_7);
        img3x2.setImageResource(R.drawable.i_icon_8);
        img3x3.setImageResource(R.drawable.i_icon_9);

        img4x1.setImageResource(R.drawable.i_icon_10);
        img4x2.setImageResource(R.drawable.i_icon_5);
        img4x3.setImageResource(R.drawable.i_icon_8);

        img5x1.setImageResource(R.drawable.i_icon_1);
        img5x2.setImageResource(R.drawable.i_icon_3);
        img5x3.setImageResource(R.drawable.i_icon_6);

        imgReel1x4.setImageResource(R.drawable.i_icon_3);
        imgReel1x5.setImageResource(R.drawable.i_icon_5);
        imgReel1x6.setImageResource(R.drawable.i_icon_1);

        imgReel2x4.setImageResource(R.drawable.i_icon_4);
        imgReel2x5.setImageResource(R.drawable.i_icon_6);
        imgReel2x6.setImageResource(R.drawable.i_icon_9);

        imgReel3x4.setImageResource(R.drawable.i_icon_10);
        imgReel3x5.setImageResource(R.drawable.i_icon_5);
        imgReel3x6.setImageResource(R.drawable.i_icon_1);

        imgReel4x4.setImageResource(R.drawable.i_icon_8);
        imgReel4x5.setImageResource(R.drawable.i_icon_5);
        imgReel4x6.setImageResource(R.drawable.i_icon_10);

        imgReel5x4.setImageResource(R.drawable.i_icon_3);
        imgReel5x5.setImageResource(R.drawable.i_icon_3);
        imgReel5x6.setImageResource(R.drawable.i_icon_3);
        textBet = findViewById(R.id.textViewBet);


        ShowCredits();
        ShowBet();

    }

    @Override
    public void onClick(View view) {
      int button = view.getId();
        if (button == R.id.imageViewMinus) {
            if (BET != 1) {
                if (BET == 100) BET = 50;
                else if (BET == 50) BET = 40;
                else if (BET == 40) BET = 30;
                else if (BET == 30) BET = 20;
                else if (BET == 20) BET = 15;
                else if (BET == 15) BET = 10;
                else if (BET == 10) BET = 5;
                else if (BET == 5) BET = 4;
                else if (BET == 4) BET = 3;
                else if (BET == 3) BET = 2;
                else if (BET == 2) BET = 1;


                ShowBet();
            }

        }
       if (button == R.id.imageViewPlus) {
               if (BET == 1) BET = 2;
               else if (BET == 2) BET = 3;
                else if (BET == 3) BET = 4;
                else if (BET == 4) BET = 5;
                else if (BET == 5) BET = 10;
                else if (BET == 10) BET = 15;
                else if (BET == 15) BET = 20;
               else if (BET == 20) BET = 30;
                else if (BET == 30) BET = 40;
                else if (BET == 40) BET = 50;
                else if (BET == 50) BET = 100;

               ShowBet();
                //CheckBet();
                //CheckLine();


        }
        if (button == R.id.imageViewSpin) {
            if (!bolSpinReels) {
               bolSpinReels = true;
               SpinReels();

            }
        }if(COUNT_WIN > 0) {
            CREDITS = CREDITS + COUNT_WIN;
            ShowCredits();
            COUNT_WIN = 0;

        }else if(COUNT_WIN == 0) {
            COUNT_WIN = 1000;
        }

        }



    public void SpinReels() {
        spinReels1 = 0;
        hand1 = new Handler();
        viewSwitcherR3.setOutAnimation(animReelOut1);
        viewSwitcherR1.setInAnimation(animReelIn1);
        animReelOut1.setDuration(200);
        animReelIn1.setDuration(200);
        SpinReel1First();

        spinReels2 = 0;
        hand2 = new Handler();
        viewSwitcherR2.setOutAnimation(animReelOut2);
        viewSwitcherR2.setInAnimation(animReelIn2);
        animReelOut2.setDuration(200);
        animReelIn2.setDuration(200);
        SpinReel2First();

        spinReels3 = 0;
        hand3 = new Handler();
        viewSwitcherR3.setOutAnimation(animReelOut3);
        viewSwitcherR3.setInAnimation(animReelIn3);
        animReelOut3.setDuration(200);
        animReelIn3.setDuration(200);
        SpinReel3First();

        spinReels4 = 0;
        hand4 = new Handler();
        viewSwitcherR4.setOutAnimation(animReelOut4);
        viewSwitcherR4.setInAnimation(animReelIn4);
        animReelOut4.setDuration(200);
        animReelIn4.setDuration(200);
        SpinReel4First();

        spinReels5 = 0;
        hand5 = new Handler();
        viewSwitcherR5.setOutAnimation(animReelOut5);
        viewSwitcherR5.setInAnimation(animReelIn5);
        animReelOut5.setDuration(200);
        animReelIn5.setDuration(200);
        SpinReel5First();
    }

    public void RandomIcons() {
        int random = (int) (Math.random() * 56) + 1;

        if(random < 11) intIcons = 1;
        else if(random <=22) intIcons = 2;
        else if(random <=31) intIcons = 3;
        else if(random <=40) intIcons = 4;
        else if(random <=46) intIcons = 5;
        else if(random <=52) intIcons = 6;
        else if(random <=55) intIcons = 7;
        else intIcons = 8;

    }

    public void RandomScatter() {
        int random = (int) (Math.random() * 18) + 1;

        if(random < 4) intIcons = 1;
        else if(random <=8) intIcons = 2;
        else if(random <=11) intIcons = 3;
        else if(random <=13) intIcons = 4;
        else if(random <=15) intIcons = 5;
        else if(random <=17) intIcons = 6;
        else if(random <=18) intIcons = 7;

    }



    public void SpinReel1First() {
        spinReels1 = spinReels1 + 1;
        viewSwitcherR1.showNext();

        hand1.postDelayed(() ->
        {
            if (spinReels1 == 4)
                SpinReel1Stop();
            else
                SpinReel1Second();
        }, 200);
    }

    private void SpinReel1Stop() {
        RandomScatter();
        intIcon1x3 = intIcons;
        if(intIcon1x3 ==8 ) RandomIcons();
        else RandomScatter();

        intIcon1x2 = intIcons;
        img1x2.setImageResource(R.drawable.i_icon_2);

        if(intIcon1x2 == 8|| intIcon1x3 == 8) RandomIcons();
        else RandomScatter();

        intIcon1x1 = intIcons;
        img1x1.setImageResource(R.drawable.i_icon_1);
        animReelOut1.setDuration(400);
        animReelIn1.setDuration(400);
        viewSwitcherR1.showPrevious();
    }

    private void SpinReel1Second() {
        viewSwitcherR1.showPrevious();

        hand1.postDelayed(this::SpinReel1First, 200);
    }


    public void SpinReel2First() {
        spinReels2 = spinReels2 + 1;
        viewSwitcherR2.showNext();

        hand2.postDelayed(() ->
        {
            if (spinReels2 == 5)
                SpinReel2Stop();
            else
                SpinReel2Second();
        }, 200);
    }

    private void SpinReel2Stop() {
        animReelOut2.setDuration(400);
        animReelIn2.setDuration(400);
        viewSwitcherR2.showPrevious();
    }

    private void SpinReel2Second() {
        viewSwitcherR2.showPrevious();
        hand2.postDelayed(this::SpinReel2First, 200);
    }


    public void SpinReel3First() {
        spinReels3 = spinReels3 + 1;
        viewSwitcherR3.showNext();

        hand2.postDelayed(() ->
        {
            if (spinReels3 == 6)
                SpinReel3Stop();
            else
                SpinReel3Second();
        }, 200);
    }

    private void SpinReel3Stop() {
        animReelOut3.setDuration(400);
        animReelIn3.setDuration(400);
        viewSwitcherR3.showPrevious();
    }

    private void SpinReel3Second() {
        viewSwitcherR3.showPrevious();
        hand3.postDelayed(this::SpinReel3First, 200);
    }


    public void SpinReel4First() {
        spinReels4 = spinReels4 + 1;
        viewSwitcherR4.showNext();

        hand2.postDelayed(() ->
        {
            if (spinReels4 == 7)
                SpinReel4Stop();
            else
                SpinReel4Second();
        }, 200);
    }

    private void SpinReel4Stop() {
        animReelOut4.setDuration(400);
        animReelIn4.setDuration(400);
        viewSwitcherR4.showPrevious();
    }

    private void SpinReel4Second() {
        viewSwitcherR4.showPrevious();
        hand4.postDelayed(this::SpinReel4First, 200);
    }


    public void SpinReel5First() {
        spinReels5 = spinReels5 + 1;
        viewSwitcherR5.showNext();

        hand2.postDelayed(() ->
        {
            if (spinReels5 == 8)
                SpinReel5Stop();
            else
                SpinReel5Second();
        }, 200);
    }

    private void SpinReel5Second() {
        viewSwitcherR5.showPrevious();
        hand5.postDelayed(this::SpinReel5First, 200);

    }

    private void SpinReel5Stop() {
        animReelOut5.setDuration(400);
        animReelIn5.setDuration(400);
        viewSwitcherR5.showPrevious();
        stopReels();
    }

    private void stopReels() {

        bolSpinReels = false;

        hand1.removeCallbacksAndMessages(null);
        hand2.removeCallbacksAndMessages(null);
        hand3.removeCallbacksAndMessages(null);
        hand4.removeCallbacksAndMessages(null);
        hand5.removeCallbacksAndMessages(null);


        viewSwitcherR1.setOutAnimation(null);
        viewSwitcherR2.setOutAnimation(null);
        viewSwitcherR3.setOutAnimation(null);
        viewSwitcherR4.setOutAnimation(null);
        viewSwitcherR5.setOutAnimation(null);


        viewSwitcherR1.setInAnimation(null);
        viewSwitcherR2.setInAnimation(null);
        viewSwitcherR3.setInAnimation(null);
        viewSwitcherR4.setInAnimation(null);
        viewSwitcherR5.setInAnimation(null);
    }


    public void ShowCredits() {
        String strCredits = "" + (CREDITS);

    }

    public void ShowBet() {
        textBet.setText(String.valueOf(BET));
    }

}

