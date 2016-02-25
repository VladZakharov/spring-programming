package foo.bar;

/**
 * Created by etc on 20.03.2015.
 */
public class Juggler implements Performer {

    int countOfBeanbags;

    Poem poem = null;

    public Juggler(int countOfBeanbags, Poem poem){
        this.countOfBeanbags = countOfBeanbags;
        this.poem = poem;
    }

    public void perform(){
        System.out.println("juggling with " + countOfBeanbags + " beanbags");
        poem.recite();
    }

}
