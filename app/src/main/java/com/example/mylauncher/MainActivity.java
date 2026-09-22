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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Main screen
        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setGravity(Gravity.CENTER);
        main.setPadding(40, 40, 40, 40);

        GradientDrawable background = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[] {
                        Color.rgb(15, 15, 18),
                        Color.rgb(35, 35, 42)
                }
        );

        main.setBackground(background);

        // Title
        TextView title = new TextView(this);
        title.setText("MINECRAFT JAVA");
        title.setTextColor(Color.WHITE);
        title.setTextSize(30);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        main.addView(title);

        // Version
        TextView version = new TextView(this);
        version.setText("Minecraft 1.20.1");
        version.setTextColor(Color.LTGRAY);
        version.setTextSize(16);
        version.setGravity(Gravity.CENTER);
        version.setPadding(0, 12, 0, 40);

        main.addView(version);

        // Launch button
        Button launch = new Button(this);
        launch.setText("LAUNCH GAME");
        launch.setTextColor(Color.WHITE);
        launch.setTextSize(16);

        GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(Color.rgb(60, 160, 70));
        buttonBackground.setCornerRadius(18);

        launch.setBackground(buttonBackground);

        LinearLayout.LayoutParams buttonParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        65
                );

        buttonParams.setMargins(20, 10, 20, 10);

        main.addView(launch, buttonParams);

        setContentView(main);
    }
}
