package com.example.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    // Here we are initilazing the variable using the constructor. @Autowired didn't work here because the spring application couldn't find the bean
    // as it is not inside this basePackages where ot looks for the beans, because ChuckNorrisQuotes is inside a dependency we added. Uncomment the below code if there is no config file inside onfig package.
   /* public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    //if we want it to find the class what we need to do is create a config class to return the instance. look at the config package to understand it more. Once you add the configuration @Autowired should work.


    @Override
    public String getJoke() {
        return  chuckNorrisQuotes.getRandomQuote();
    }
}
