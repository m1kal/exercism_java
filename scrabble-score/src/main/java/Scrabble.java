import java.util.stream.*;

class Scrabble {

  Stream<Character> letters;

  Scrabble(String word) {
    letters = word.toUpperCase().chars().mapToObj(c -> (char)c);
  }

  int getScore() {
    return letters.map(c -> Scrabble.letterValue(c)).reduce(0, (a,b) -> a + b);
  }

  static int letterValue(char letter) {
    switch (letter) {
      case 'D': case 'G': return 2;
      case 'B': case 'C': case 'M': case 'P': return 3;
      case 'F':case 'H':case 'V':case 'W':case 'Y': return 4;
      case 'K': return 5;
      case 'J':case 'X': return 8;
      case 'Q':case 'Z': return 10;
      default: return 1;
    }
  }
}
