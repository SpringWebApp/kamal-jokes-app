package com.kamal.springframework.kamaljokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getRandomJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
