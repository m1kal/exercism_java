import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {
    boolean bitTest(int number, int position) {
      return (((number >> position) & 1) == 1);
    }

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            if (bitTest(number, i))
                signals.add(Signal.values()[i]);
        if (bitTest(number, 4))
            Collections.reverse(signals);
        return signals;
    }
}

