package com.example.mgibbon.gardenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView januaryDescription;
    TextView februaryDescription;
    TextView marchDescription;
    TextView aprilDescription;
    TextView mayDescription;
    TextView juneDescription;
    TextView julyDescription;
    TextView augustDescription;
    TextView septemberDescription;
    TextView octoberDescription;
    TextView novemberDescription;
    TextView decemberDescription;
    TextView flowersDescription;
    TextView bushesDescription;
    TextView fruittreeDescription;
    LinearLayout calenderOverview;
    TextView mainHeadline;
    RelativeLayout buttons;
    LinearLayout plants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        januaryDescription = (TextView) findViewById(R.id.january_text);
        februaryDescription = (TextView) findViewById(R.id.february_text);
        marchDescription = (TextView) findViewById(R.id.march_text);
        aprilDescription = (TextView) findViewById(R.id.april_text);
        mayDescription = (TextView) findViewById(R.id.may_text);
        juneDescription = (TextView) findViewById(R.id.june_text);
        julyDescription = (TextView) findViewById(R.id.july_text);
        augustDescription = (TextView) findViewById(R.id.august_text);
        septemberDescription = (TextView) findViewById(R.id.september_text);
        octoberDescription = (TextView) findViewById(R.id.october_text);
        novemberDescription = (TextView) findViewById(R.id.november_text);
        decemberDescription = (TextView) findViewById(R.id.december_text);
        flowersDescription = (TextView) findViewById(R.id.flowers_text);
        bushesDescription = (TextView) findViewById(R.id.bushes_text) ;
        fruittreeDescription = (TextView) findViewById(R.id.fruittree_text);
        calenderOverview = (LinearLayout) findViewById(R.id.calender);
        mainHeadline = (TextView) findViewById(R.id.my_garden);
        buttons = (RelativeLayout) findViewById(R.id.buttons);
        plants = (LinearLayout) findViewById(R.id.plants);

    }

    /**
     * toggle Calender
     */
    public void toggleCalender(View view) {
        if (calenderOverview.getVisibility() == View.VISIBLE) {
            calenderOverview.setVisibility(View.GONE);
            mainHeadline.setVisibility(View.VISIBLE);
            buttons.setVisibility(View.VISIBLE);
            januaryDescription.setVisibility(View.GONE);
            februaryDescription.setVisibility(View.GONE);
            marchDescription.setVisibility(View.GONE);
            aprilDescription.setVisibility(View.GONE);
            mayDescription.setVisibility(View.GONE);
            juneDescription.setVisibility(View.GONE);
            julyDescription.setVisibility(View.GONE);
            augustDescription.setVisibility(View.GONE);
            septemberDescription.setVisibility(View.GONE);
            octoberDescription.setVisibility(View.GONE);
            novemberDescription.setVisibility(View.GONE);
            decemberDescription.setVisibility(View.GONE);

        } else {
            calenderOverview.setVisibility(View.VISIBLE);
            mainHeadline.setVisibility(View.GONE);
            buttons.setVisibility(View.GONE);
        }
    }

    /**
     * toggle Plants
     */
    public void togglePlants(View view) {
        if (plants.getVisibility() == View.VISIBLE) {
            plants.setVisibility(View.GONE);
            mainHeadline.setVisibility(View.VISIBLE);
            buttons.setVisibility(View.VISIBLE);
            flowersDescription.setVisibility(View.GONE);
            bushesDescription.setVisibility(View.GONE);
            fruittreeDescription.setVisibility(View.GONE);
        } else {
            plants.setVisibility(View.VISIBLE);
            mainHeadline.setVisibility(View.GONE);
            buttons.setVisibility(View.GONE);
        }
    }

    /**
     * toggle monthly texts visible/not visible
     */

    public void toggleJanuaryText(View view) {
        if (januaryDescription.getVisibility() == View.VISIBLE) {
            januaryDescription.setVisibility(View.GONE);
        } else {
            januaryDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleFebruaryText(View view) {
        if (februaryDescription.getVisibility() == View.VISIBLE) {
            februaryDescription.setVisibility(View.GONE);
        } else {
            februaryDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleMarchText(View view) {
        if (marchDescription.getVisibility() == View.VISIBLE) {
            marchDescription.setVisibility(View.GONE);
        } else {
            marchDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleAprilText(View view) {

        if (aprilDescription.getVisibility() == View.VISIBLE) {
            aprilDescription.setVisibility(View.GONE);
        } else {
            aprilDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleMayText(View view) {

        if (mayDescription.getVisibility() == View.VISIBLE) {
            mayDescription.setVisibility(View.GONE);
        } else {
            mayDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleJuneText(View view) {

        if (juneDescription.getVisibility() == View.VISIBLE) {
            juneDescription.setVisibility(View.GONE);
        } else {
            juneDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleJulyText(View view) {

        if (julyDescription.getVisibility() == View.VISIBLE) {
            julyDescription.setVisibility(View.GONE);
        } else {
            julyDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleAugustText(View view) {
        if (augustDescription.getVisibility() == View.VISIBLE) {
            augustDescription.setVisibility(View.GONE);
        } else {
            augustDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleSeptemberText(View view) {
        if (septemberDescription.getVisibility() == View.VISIBLE) {
            septemberDescription.setVisibility(View.GONE);
        } else {
            septemberDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleOctoberText(View view) {
        if (octoberDescription.getVisibility() == View.VISIBLE) {
            octoberDescription.setVisibility(View.GONE);
        } else {
            octoberDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleNovemberText(View view) {
        if (novemberDescription.getVisibility() == View.VISIBLE) {
            novemberDescription.setVisibility(View.GONE);
        } else {
            novemberDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleDecemberText(View view) {
        if (decemberDescription.getVisibility() == View.VISIBLE) {
            decemberDescription.setVisibility(View.GONE);
        } else {
            decemberDescription.setVisibility(View.VISIBLE);
        }
    }

    /**
     * toggle plants texts visible/invisible
     */
    public void toggleFlowersText(View view) {
        if (flowersDescription.getVisibility() == View.VISIBLE) {
            flowersDescription.setVisibility(View.GONE);
        } else {
            flowersDescription.setVisibility(View.VISIBLE);
        }
    }

    public void toggleBushesText(View view) {
        if (bushesDescription.getVisibility() == View.VISIBLE) {
            bushesDescription.setVisibility(View.GONE);
        } else {
            bushesDescription.setVisibility(View.VISIBLE);
        }
    }
    public void toggleFruitTreeText(View view) {
        if (fruittreeDescription.getVisibility() == View.VISIBLE) {
            fruittreeDescription.setVisibility(View.GONE);
        } else {
            fruittreeDescription.setVisibility(View.VISIBLE);
        }
    }

}
