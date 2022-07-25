package com.example.newwomansoccer.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.newwomansoccer.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock de Noticias
        List<News> news = new ArrayList<>();
        news.add(new News("Flamengo tem desfalque importante","Grew grewGrew grewGrew grewGrew grewGrew grew"));
        news.add(new News("Bahia joga no domingo","Grew grewGrew grewGrew grewGrew grewGrew grew"));
        news.add(new News("Copa do mundo feminina inicia no próximo sábado","Grew grewGrew grewGrew grewGrew grew"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}