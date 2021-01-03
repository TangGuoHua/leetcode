package utils;

import static java.lang.ClassLoader.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUtils {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner s = null;

    try {
      File f = new File("/Users/c5316753/Develop/leetcode/leetcode/java/src/test/resources/guohua.txt");
      System.out.println(f.getAbsolutePath());
//      URL url = StringUtils.class.getResource("/java/src/test/resources/guohua.txt");
      s = new Scanner(new BufferedReader(new FileReader(f)));
      List<String> list = new ArrayList<>();
      while (s.hasNext()) {

      }
    }catch (Exception e){
      e.printStackTrace();
    }
    finally {
      if (s != null) {
        s.close();
      }
    }
  }

}
