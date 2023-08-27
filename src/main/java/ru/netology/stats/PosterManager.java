package ru.netology.stats;


public class PosterManager {
    private int lim = 5;

    //Инкапсуляция lim
    public int getLim() {
        return lim;
    }

    public int setLim(int newLim) {
        lim = newLim;
        return lim;

    }

    //Конструкоры PosterManager
    public PosterManager() {
    }

    public PosterManager(int a) {
        lim = setLim(a);

    }

    // Пустой массив
    private Movies[] movie = new Movies[0];

    //добавление фильма
    public void save(Movies item) {
        Movies[] tmp = new Movies[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = item;
        movie = tmp;
    }


    //возвращение фильмов
    public Movies[] getMovie() {
        return movie;
    }

    //Вывод всех фильмов в порядке добавления
    public Movies[] findAll() {
        Movies[] all = getMovie();
        return all;
    }


    // Вывод максимально лимит штук последних добавленных фильмов в обратном от добавления порядке
    public Movies[] findLast() {
        Movies[] all = findAll();
        Movies[] reversed = new Movies[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        Movies[] back = new Movies[getLim()];
        for (int i = 0; i < back.length; i++) {
            back[i] = reversed[i];
        }
        return back;
    }
}





