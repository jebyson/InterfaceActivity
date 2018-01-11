package com.company;

import java.io.File;

/**
 * Created by je565 on 1/11/18.
 */
public interface UI {
    void ok();
    void no();
    void cancel();
    void exit();
    String help();
    void setRes();
    void setTaskbar();
    void startOS();
    void runProgram(String programName);
    void startMouse();
    void keyboardInput(char key);
    void setWallPaper(File image);
    void setTime();
}
