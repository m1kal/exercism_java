import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.math.BigInteger;

class Signal_ {
  Signal s;
  public Signal_(Signal s) {
    this.s = s;
  }
  public boolean isOk(BigInteger x) {
    return x.testBit(s.ordinal());
  }
}

class HandshakeCalculator {

    List<Signal> calculateHandshake(BigInteger number) {
      List<Signal> signals = Stream.of(Signal.values())
                                   .map(s->new Signal_(s))
                                   .filter(x-> x.isOk(number))
                                   .map(s->s.s)
                                   .collect(Collectors.toList());
      if (number.testBit(4))
        Collections.reverse(signals);
      return signals;
    }

    List<Signal> calculateHandshake(int number) {
      return calculateHandshake(BigInteger.valueOf(number));
    }
}

