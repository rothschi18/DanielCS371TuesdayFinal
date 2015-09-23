package com.example.administrator.danielrcs371hw2;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static com.example.administrator.danielrcs371hw2.R.mipmap.player1;


public class MainActivity extends ActionBarActivity {


    public TeamRosterDatabase TeamData;
    //I want to preserve the order that teams are shown on the main page
    public LinkedHashMap<TeamRoster, Button> mainTeamButtons;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeamData = new TeamRosterDatabase(this);
        //TeamData.setMainTeamButtons();
        TeamData.declareTeams();
        TeamData.viewTeams();

    }

    public void sendButtonID(View view)
    {
        TeamRoster team = TeamData.getTeamRoster(view);

        for(TeamRoster teams : TeamData.mainTeamButtons.keySet())
        {
            if(TeamData.mainTeamButtons.get(teams).getId() == view.getId())
            {
                //now instantiate an array of buttons to the players in the teamroster
               ImageButton[] playerButtons = new ImageButton[15];

               playerButtons[0] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[1] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[2] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[3] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[4] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[5] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[6] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[7] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[8] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[9] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[10] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[11] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[12] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[13] = (ImageButton)this.findViewById(R.id.player1);
                playerButtons[14] = (ImageButton)this.findViewById(R.id.player1);



                TeamData.declareTeams();


                teams.showPlayers(playerButtons);



            }

        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
