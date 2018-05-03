package com.company;

/**
 * Created by i.lapshinov on 26.04.2018.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;



    public void startGame()
    {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetnumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9 ...");

        while (true){
            System.out.println("Число которые нужно угадать, - " + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("1 игрок думает, что это - " + guessp1);
            guessp2 = p2.number;
            System.out.println("2 игрок думает, что это - " + guessp2);
            guessp3 = p3.number;
            System.out.println("3 игрок думает, что это - " + guessp3);

            if (guessp1 == targetnumber){
                p1isRight = true;
            }
            if (guessp2 == targetnumber){
                p2isRight = true;
            }
            if (guessp3 == targetnumber){
                p3isRight = true;
            }

            if (p2isRight || p2isRight || p3isRight)
            {
                System.out.println("У нас есть победитель!");
                System.out.printf("1 игрок угадал? " + p1isRight);
                System.out.printf("2 игрок угадал? " + p2isRight);
                System.out.printf("3 игрок угадал? " + p3isRight);
                System.out.println("gave over");
                break;
            }
            else
            {
                System.out.println("никто не угадал");
            }
        }

    }
}
