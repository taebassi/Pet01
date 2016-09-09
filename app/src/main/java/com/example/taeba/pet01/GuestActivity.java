package com.example.taeba.pet01;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

import static android.widget.Toast.*;



public class GuestActivity extends AppCompatActivity {

    private TabHost myTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);


        myTabHost = (TabHost)findViewById(R.id.tabHost);
        myTabHost.setup();

        TabHost.TabSpec tabspec;

        tabspec = myTabHost.newTabSpec("Cat");
        tabspec.setIndicator("Cat",getResources().getDrawable(R.drawable.cat));
        tabspec.setContent(R.id.linearlayout2);
        myTabHost.addTab(tabspec);

        tabspec = myTabHost.newTabSpec("Dog");
        tabspec.setIndicator("Dog",getResources().getDrawable(R.drawable.dog));
        tabspec.setContent(R.id.linearLayout3);
        myTabHost.addTab(tabspec);

        myTabHost.setCurrentTab(0);

    }

    /*public void showToast(CharSequence txt){

    }*/

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=this.getMenuInflater();
        inflater.inflate(R.menu.menuitem,menu);
        MenuItem menuSerach = menu.findItem(R.id.acserach);
        menuSerach.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(GuestActivity.this,SearchActivity.class);
                startActivity(intent);
                return false;
            }
        } );

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.acserach) {
            Toast.makeText(GuestActivity.this,"Search", LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);

    }


}
