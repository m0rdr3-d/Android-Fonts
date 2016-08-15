package com.mordred.example;

/**
 * Created by mordred on 8/10/16.
 */
public final class Application extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        AddFonts.setDefaultFont(this, "DEFAULT", "Roboto-Medium.ttf");
        AddFonts.setDefaultFont(this, "MONOSPACE", "HelveticaNeue.ttf");
        AddFonts.setDefaultFont(this, "SANS", "freight-sans.ttf");
        AddFonts.setDefaultFont(this, "SERIF", "Lucida-handwriting-italic.ttf");

        //this allows you to use these fonts in your activities
        //you should typically not use up more than four fonts in one app
        //if for any reason you want to

      }
}
