package mn.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main (String[] args) {
    /*String[] langs = {"Java", "C#", "Python", "php"};*/

    List<String> languages = Arrays.asList("Java", "C#", "Python", "php");

    for (String l : languages) {
      System.out.println("I want to learn " + l);
    }

    /*for (int i = 0; i < languages.size(); i++) {
      System.out.println("I want to learn " + languages.get(i));
    }*/
  }
}
