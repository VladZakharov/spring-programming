package foo.bar;

/**
 * Created by etc on 20.03.2015.
 */
public class Poem {

    private String text;

    public Poem(){}

    public Poem(String text) {
        this.text = text;
    }

    public void recite(){
        if (text == null) {
            System.out.println("I don't know any poem... :(");
        }
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
