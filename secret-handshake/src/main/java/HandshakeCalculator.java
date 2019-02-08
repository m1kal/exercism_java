import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;

class HandshakeCalculator {

    boolean bitTest(int number, int bit) {
      return ((number & (1 << bit)) > 0);
    }

    List<Signal> calculateHandshake(int number) {
      List<Signal> signals = Stream.of(Signal.values())
                                   .filter(s -> bitTest(number, s.ordinal()))
                                   .collect(Collectors.toList());
      if (bitTest(number, 4))
        Collections.reverse(signals);
      return signals;
    }
}
