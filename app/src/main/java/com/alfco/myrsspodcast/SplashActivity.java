package com.alfco.myrsspodcast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import com.alfco.myrsspodcast.tools.Constants;
import com.squareup.picasso.Picasso;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.Timer;
import java.util.TimerTask;

@EActivity(R.layout.activity_splash)
public class SplashActivity extends Activity {

    @ViewById
    ImageView ivLogo;

    @AfterViews
    void init(){
        ivLogo.animate().rotationYBy(360 * 3).translationY(100).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(2000).setStartDelay(500).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                Intent i = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(i);
            }
        });

    }
}
