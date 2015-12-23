package com.deepwelldevelopment.thefire.core.io

import java.io.File;
import java.io.Scanner;

public class Input {
  
  File source;
  Scanner scanner;
  String currentCommand;
  
  public Input(File source) {
    this.source = source;
    scanner = new Scanner(source);
  }
  
  public void pollInput() {
    currentCommand = scanner.nextln();
  }
  
  
}
