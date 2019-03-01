import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            if (((number >> i) % 2) == 1)
                signals.add(Signal.values()[i]);
        if (((number >> 4) % 2) == 1)
            Collections.reverse(signals);
        return signals;
    }
}

