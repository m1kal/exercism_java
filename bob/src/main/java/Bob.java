import java.util.Optional;

class Bob{
 
 String hey(String message) {
   return Optional.ofNullable(yell_question(message))
           .orElse(Optional.ofNullable(question(message))
           .orElse(Optional.ofNullable(yell(message))
           .orElse(Optional.ofNullable(empty(message))
           .orElse("Whatever."))));
 }

  private String question(String message) {
    return (message.matches(".*\\?\\s*$")) ? "Sure." : null;
  }

  private String yell(String message) {
    return ((message.matches("[^a-z]*")) &&
    (message.matches(".*[A-Z].*"))) ? "Whoa, chill out!" : null;
  }


  private String yell_question(String message) {
    return ((yell(message) == null) || (question(message) == null)) ?
             null : "Calm down, I know what I'm doing!";
  }


  private String empty(String message) {
    return (message.matches("\\s*")) ? "Fine. Be that way!" : null;
  }


}
