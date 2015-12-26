package com.dmardevelops.bgcolorswitch;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.blackButton).setOnClickListener(this);
        findViewById(R.id.blueButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.blackButton:
                themeUtils.changeToTheme(this, themeUtils.BLACK);
                break;
            case R.id.blueButton:
                themeUtils.changeToTheme(this, themeUtils.BLUE);
                break;
        }
    }
}
