package com.example.mylauncher;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    private GradientDrawable roundedBackground(int color, float radius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(dp(radius));
        return drawable;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.rgb(10, 10, 12));
        getWindow().setNavigationBarColor(Color.rgb(10, 10, 12));

        // Main screen
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.HORIZONTAL);
        root.setPadding(dp(32), dp(24), dp(32), dp(24));
        root.setGravity(Gravity.CENTER_VERTICAL);
        root.setBackgroundColor(Color.rgb(12, 13, 16));

        // LEFT SIDE
        LinearLayout left = new LinearLayout(this);
        left.setOrientation(LinearLayout.VERTICAL);
        left.setGravity(Gravity.CENTER_VERTICAL);

        TextView brand = new TextView(this);
        brand.setText("MINECRAFT");
        brand.setTextColor(Color.WHITE);
        brand.setTextSize(32);
        brand.setTypeface(Typeface.DEFAULT, Typeface.BOLD);

        left.addView(brand);

        TextView subtitle = new TextView(this);
        subtitle.setText("JAVA EDITION");
        subtitle.setTextColor(Color.rgb(150, 155, 165));
        subtitle.setTextSize(15);
        subtitle.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        subtitle.setPadding(0, dp(4), 0, dp(18));

        left.addView(subtitle);

        TextView version = new TextView(this);
        version.setText("1.20.1");
        version.setTextColor(Color.rgb(190, 195, 205));
        version.setTextSize(14);
        version.setPadding(dp(14), dp(8), dp(14), dp(8));
        version.setBackground(
                roundedBackground(Color.rgb(28, 30, 36), 12)
        );

        left.addView(version);

        LinearLayout.LayoutParams leftParams =
                new LinearLayout.LayoutParams(0, -2, 1f);

        root.addView(left, leftParams);

        // RIGHT SIDE
        LinearLayout right = new LinearLayout(this);
        right.setOrientation(LinearLayout.VERTICAL);
        right.setGravity(Gravity.CENTER);

        TextView ready = new TextView(this);
        ready.setText("READY TO PLAY");
        ready.setTextColor(Color.rgb(145, 150, 160));
        ready.setTextSize(13);
        ready.setGravity(Gravity.CENTER);

        right.addView(ready);

        Button launch = new Button(this);
        launch.setText("PLAY");
        launch.setTextColor(Color.WHITE);
        launch.setTextSize(18);
        launch.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        launch.setAllCaps(false);
        launch.setGravity(Gravity.CENTER);

        launch.setBackground(
                roundedBackground(Color.rgb(55, 165, 75), 18)
        );

        LinearLayout.LayoutParams launchParams =
                new LinearLayout.LayoutParams(
                        dp(230),
                        dp(64)
                );

        launchParams.setMargins(0, dp(12), 0, 0);

        right.addView(launch, launchParams);

        LinearLayout.LayoutParams rightParams =
                new LinearLayout.LayoutParams(0, -2, 1f);

        root.addView(right, rightParams);

        setContentView(root);
    }
}
