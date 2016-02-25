package foo.bar;

import java.util.List;

/**
 * Created by vlad on 11.02.16.
 */
public class Compere {

    public void call(Performer p) {
        p.perform();
    }

    public void call(Performer[] perfs) {
        for (Performer prf : perfs) {
            prf.perform();
        }
    }

    public void call(List<Performer> perfs) {
        for (Performer prf : perfs) {
            prf.perform();
        }
    }

}
