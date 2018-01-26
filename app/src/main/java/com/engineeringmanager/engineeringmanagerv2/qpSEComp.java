package com.engineeringmanager.engineeringmanagerv2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.Toast;

public class qpSEComp extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    GridLayout mainGrid;
    String link;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qp_secomp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
    }
    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(qpSEComp.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(qpSEComp.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {


            CardView cardView = (CardView) mainGrid.getChildAt(i);

            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI==0){
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://goo.gl/QxJf5s";
                        intent.putExtra("info",link);
                        startActivity(intent);

                    }

                    else if(finalI==1) // This is for SE IT
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1HJSnU-fz4qmtabzHGiJA7nv_uRN7fPp0";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==2) // This is for SE Civil
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1wpb_XxrxN4j6vHx0XRUpyBUHR17HWyWd";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==3) // This is for ENTC SE
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1KGsCvgOy5BXFp0Fo3KvsuM1NKYv8pZvQ";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==4) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==5) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==6) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==7) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://goo.gl/QxJf5s";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==8) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==9) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                    else if(finalI==10) // This is for SE MECH
                    {
                        Toast.makeText(qpSEComp.this, Integer.toString(finalI), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(qpSEComp.this,syllabusWebView.class);
                        link="https://drive.google.com/open?id=1z-deGUG5W1woOgxxT_-wGpLMLum1YCEM";
                        intent.putExtra("info",link);
                        startActivity(intent);
                    }
                }
            });
        }
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
        getMenuInflater().inflate(R.menu.question_papers_home, menu);
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

        if (id == R.id.syllabus) {
            Intent intent= new Intent(qpSEComp.this,syllabus.class);
            startActivity(intent);

        } else if (id == R.id.practicals) {

        } else if (id == R.id.qpapers) {
            Intent intent= new Intent(qpSEComp.this,questionPapersHome.class);
            startActivity(intent);


        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
