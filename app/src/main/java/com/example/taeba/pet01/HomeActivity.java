package com.example.taeba.pet01;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TabHost myTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,PostActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=this.getMenuInflater();
        inflater.inflate(R.menu.menuitem,menu);
        MenuItem menuSerach = menu.findItem(R.id.acserach);
        menuSerach.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent intent = new Intent(HomeActivity.this,SearchActivity.class);
                startActivity(intent);
                return false;
            }
        } );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.acserach) {
            Toast.makeText(HomeActivity.this,"Search", LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_profile) {
            MenuItem item1 = (MenuItem)findViewById(R.id.nav_profile);
            item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent intent = new Intent(HomeActivity.this,ProfileActivity.class);
                    startActivity(intent);
                    return false;
                }
            });
        } else if (id == R.id.nav_favorite) {
            MenuItem item1 = (MenuItem)findViewById(R.id.nav_profile);
            item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent intent = new Intent(HomeActivity.this,FavoriteActivity.class);
                    startActivity(intent);
                    return false;
                }
            });

        } else if (id == R.id.nav_mypost) {
            MenuItem item1 = (MenuItem)findViewById(R.id.nav_profile);
            item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent intent = new Intent(HomeActivity.this,MypostActivity.class);
                    startActivity(intent);
                    return false;
                }
            });

        } else if (id == R.id.nav_message) {


        } else if (id == R.id.nav_setting) {
            MenuItem item1 = (MenuItem)findViewById(R.id.nav_profile);
            item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent intent = new Intent(HomeActivity.this,SettingsActivity.class);
                    startActivity(intent);
                    return false;
                }
            });

        } else if (id == R.id.nav_about) {
            MenuItem item1 = (MenuItem)findViewById(R.id.nav_profile);
            item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    Intent intent = new Intent(HomeActivity.this,AboutActivity.class);
                    startActivity(intent);
                    return false;
                }
            });

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
