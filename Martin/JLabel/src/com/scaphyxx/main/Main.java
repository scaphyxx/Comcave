package com.scaphyxx.main;

import com.scaphyxx.components.*;
import com.scaphyxx.frames.MainFrame;

public class Main {

  // public static void main(String[] args) {

  public static void main(String[] args) {
    MainFrame f = new MainFrame();
    Avocado a = new Avocado();

    f.add(a);
  }
}
