package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 05/07/2017.
 */

public class Game {
    private ArrayList<String> options;

    public Game(){
        this.options = new ArrayList<String>();
        this.setUpOptions();

    }

    public void setUpOptions() {
        String[] optionsArray = {"Rock", "Paper", "Scissors"};
        for (String option : optionsArray) {
            this.options.add(option);
        }
    }

    public String getOptionAtIndex(int index) {
        return this.options.get(index);
    }

    public String getOption(){
        Random rand = new Random();
        int listSize = options.size();
        int index = rand.nextInt(listSize);
        String option = this.getOptionAtIndex(index);
        return option;
    }

    public String run(String player) {
        String computer = this.getOption();
        if (player == computer) {
            return "Draw!";
        }
        else if (player == "Rock") {
            return computer == "Paper" ? "You lose, computer chose paper!" : "You win, computer chose scissors!";
        }
        else if (player == "Paper") {
            return computer == "Scissors" ? "You lose, computer chose scissors!" : "You win, computer chose rock!";
        }
        else if (player == "Scissors") {
            return computer == "Rock" ? "You lose, computer chose rock!" : "You win, computer chose paper!";
        }
        return null;
    }
}

