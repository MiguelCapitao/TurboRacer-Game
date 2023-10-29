package org.codeforall.turboracer.initGAME;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MenuStart {

    private static Picture picture;


    public static void MenuStart(){
        picture = new Picture(10,0,"resources/images/menufinal.png");
        picture.draw();
    }




    public static void DeleteMenu(){
        picture.delete();
    }

}
