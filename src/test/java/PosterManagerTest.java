import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Movies;
import ru.netology.stats.PosterManager;

public class PosterManagerTest {

    Movies one = new Movies("Бладшот");
    Movies two = new Movies("Вперёд");
    Movies three = new Movies("Отель Белград");
    Movies four = new Movies("Джентельмены");
    Movies five = new Movies("Человек-Неведимка");
    Movies six = new Movies("Тролли. Мироваой Тур");
    Movies seven = new Movies("Номер Один");


    // Тест getMovie
    @Test
    public void getMovie() {
        PosterManager movie = new PosterManager();
        movie.save(one);
        movie.save(two);
        Movies[] expected = {one, two};
        Movies[] actual = movie.getMovie();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Тест вывода всех фильмов в порядке добавления
    @Test
    public void findAllTest() {
        PosterManager movie = new PosterManager();
        movie.save(one);
        movie.save(two);
        movie.save(three);
        movie.save(four);
        movie.save(five);
        movie.save(six);
        movie.save(seven);
        Movies[] expected = {one, two, three, four, five, six, seven};
        Movies[] actual = movie.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Тест вывода всех фильмов в порядке добавления
    @Test
    public void findLast() {
        PosterManager movie = new PosterManager();
        movie.save(one);
        movie.save(two);
        movie.save(three);
        movie.save(four);
        movie.save(five);
        movie.save(six);
        movie.save(seven);
        Movies[] expected = {seven, six, five, four, three};
        Movies[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNext() {
        PosterManager movie = new PosterManager(4);
        movie.save(one);
        movie.save(two);
        movie.save(three);
        movie.save(four);
        movie.save(five);
        movie.save(six);
        movie.save(seven);
        Movies[] expected = {seven, six, five, four};
        Movies[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}


