package de.fnortheim.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * created by sebastian on Apr, 2019
 */
@Service
public class JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
