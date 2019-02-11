import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.math.BigInteger;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number_) {
      final BigInteger number = BigInteger.valueOf(number_);
      List<Signal> signals = Stream.of(Signal.values())
                                   .filter(s->number.testBit(s.ordinal()))
                                   .collect(Collectors.toList());
      if (number.testBit(4))
        Collections.reverse(signals);
      return signals;
    }
}
