package com.example.administrator.danielrcs371hw2;

import android.app.Activity;
import android.media.Image;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.HashMap;

/**
 * Created by rothschi18 on 9/19/2015.
 */
public class TeamRoster {
    protected HashMap<String, PlayerStats> teamPlayers;
    protected String teamName;
    protected ImageView teamImage;
    protected HashMap<ImageButton, PlayerStats> Team;

    public TeamRoster(String teamName, ImageView teamImage)
    {
        this.teamName=teamName;
        this.teamImage = teamImage;
        teamPlayers = new HashMap<String, PlayerStats>();
        Team = new HashMap<ImageButton, PlayerStats>();
    }



    public void showPlayers(ImageButton[] buttons)
    {
        //now populate the hash map of team players
        int counter = 0;
        for(String key: teamPlayers.keySet())
        {
            Team.put(buttons[counter], teamPlayers.get(key));
            counter++;
        }

        //now display the images for each player
        for(ImageButton image: Team.keySet())
        {
            if(image!=null)
               image.setBackground(Team.get(image).playerImage.getDrawable());
        }

    }

    public void addPlayer(PlayerStats player)
    {
        String key = player.firstName +"**" + player.lastName;

        if(teamPlayers.containsKey(key))
        {
            return;
        }

        teamPlayers.put(key, player);

    }

    public String getTeamName()
    {
        return teamName;
    }
}
