import java.util.*;
class IsogramChecker {
  boolean isIsogram(String phrase) {
    char[] chars = phrase.toLowerCase().replaceAll("\\W","").toCharArray();
    Set set = new HashSet();
    for (char e : chars)
      set.add(e);
    return (set.size() == chars.length);
    }
}
