package foo.bar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

//        Juggler juggler = new Juggler(10, new Poem());
//        juggler.perform();

        // запустить приложение, не внося изменений, для проверки общей работоспособности

        // в класс Poem добавить атрибут "текст поэмы"
        // в xml-конфигурацию добавить инициализацию атрибута "текст поэмы"
        // изменить метод Poem.recite() так, чтобы выводился текст поэмы
        // запустить приложение

        // добавить класс "конферансье", который вызывает на сцену исполнителя
        // изменить xml-конфигурацию и код HelloApp так, чтобы жонглер (Juggler) вызывался посредством конферансье
        // запустить приложение

        // добавить произвольного нового исполнителя по аналогии с жонглером
        // создать вторую xml-конфигурацию, в которой конферансье вызывает вашего нового исполнителя
        // запустить приложение с новой конфигурацией

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Compere compere = (Compere) context.getBean("oleg");

        Performer juggler = (Performer) context.getBean("vasya");
        Performer dancer = (Performer) context.getBean("super_dancer");
        compere.call(new Performer[]{juggler, dancer});

    }
}
