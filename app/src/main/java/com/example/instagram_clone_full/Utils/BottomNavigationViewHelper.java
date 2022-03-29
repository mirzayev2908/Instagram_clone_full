package com.example.instagram_clone_full.Utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;

import com.example.instagram_clone_full.Likes.LikesActivity;
import com.example.instagram_clone_full.Main.MainActivity;
import com.example.instagram_clone_full.Profile.ProfileActivity;
import com.example.instagram_clone_full.R;
import com.example.instagram_clone_full.Search.SearchActivity;
import com.example.instagram_clone_full.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";


    public static void setupBottomNavigationView(BottomNavigationView bottomNavigationView) {
        Log.d(TAG, "setupBottomNavigationView: setting up Bottom navigation view");
//       bottomNavigationView.enableAnimation(false);
//       bottomNavigationView.enableItemShiftingMode(false);
//       bottomNavigationView.enableShiftingMode(false);
//       bottomNavigationView.setTextVisibility(false);
    }


    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent intent1=new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2=new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3=new Intent(context, ShareActivity.class);
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4=new Intent(context, LikesActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5=new Intent(context, ProfileActivity.class);
                        context.startActivity(intent5);
                        break;

                }
                return false;
            }
        });

    }
}
