package com.company;

/**
 * Created by i.lapshinov on 26.04.2018.
 */
public class Player {
    int number = 0;

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}
