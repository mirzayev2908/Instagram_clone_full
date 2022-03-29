package com.example.instagram_clone_full.Profile;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.instagram_clone_full.R;
import com.example.instagram_clone_full.Utils.BottomNavigationViewHelper;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //setupBottomNavigationView();
        setUpToolbar();
    }

     private void setUpToolbar(){
         Toolbar toolbar=(Toolbar) findViewById(R.id.profileToolBar);
         setSupportActionBar(toolbar);
         toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
             @Override
             public boolean onMenuItemClick(MenuItem item) {
                 Log.d(TAG, "onMenuItemClick: clicked menu item"+item);
                 switch (item.getItemId()){
                     case R.id.profileMenu:
                         Log.d(TAG, "onMenuItemClick: Navigating to Profile Preferences.");
                 }
                 return false;
             }
         });

}
/*bottom navigation view setup */

    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView);
        BottomNavigationViewHelper.enableNavigation(ProfileActivity.this,bottomNavigationView);
        Menu menu= bottomNavigationView.getMenu();
        MenuItem menuItem=menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return true;
    }
}