package fr.utbm.gl52.androidapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import fr.utbm.gl52.androidapp.Fragments.AccountFragment;
import fr.utbm.gl52.androidapp.Fragments.DashboardFragment;
import fr.utbm.gl52.androidapp.Fragments.SettingsFragment;
import fr.utbm.gl52.androidapp.Fragments.UrgenceFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initFragmentAtLunch();
    }

    protected void initFragmentAtLunch() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        DashboardFragment dash = new DashboardFragment();
        fragmentTransaction.add(R.id.frag_container, dash, "Dashboard");
        fragmentTransaction.commit();
        navigationView.getMenu().getItem(0).setChecked(true);
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_dashboard) {
            if (fragmentManager.findFragmentByTag("Dashboard") == null) {
                Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag_container, new DashboardFragment(), "Dashboard");
                fragmentTransaction.commit();
            }
        } else if (id == R.id.nav_urgence) {
            if (fragmentManager.findFragmentByTag("Urgence") == null) {
                Toast.makeText(this, "nav_urgence", Toast.LENGTH_SHORT).show();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag_container, new UrgenceFragment(), "Urgence");
                fragmentTransaction.commit();
            }
        } else if (id == R.id.nav_myaccount) {
            if (fragmentManager.findFragmentByTag("Account") == null) {
                Toast.makeText(this, "nav_myaccount", Toast.LENGTH_SHORT).show();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag_container, new AccountFragment(), "MyAccount");
                fragmentTransaction.commit();
            }
        } else if (id == R.id.nav_settings) {
            if (fragmentManager.findFragmentByTag("Settings") == null) {

                Toast.makeText(this, "nav_settings", Toast.LENGTH_SHORT).show();
                fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frag_container, new SettingsFragment(), "Settings");
                fragmentTransaction.commit();
            }
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}