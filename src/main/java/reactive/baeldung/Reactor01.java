package reactive.baeldung;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import java.util.ArrayList;
import java.util.List;

public class Reactor01 {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();

        Flux.just(1, 2, 3, 4)
                .log()
                .subscribe(elements::add);

    }
}
