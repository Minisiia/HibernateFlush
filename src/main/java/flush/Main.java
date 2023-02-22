package flush;

import org.apache.log4j.PropertyConfigurator;
import org.jboss.logging.Logger;

/**
 * Создайте в цикле 200 объектов author и сохраните в БД.
 * Значения полей могут быть любыми.
 *  метод flush для каждых 10 объектов.
 * Метод сommit выполняйте один раз в конце.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();
        ah.add200Authors();
    }
}
