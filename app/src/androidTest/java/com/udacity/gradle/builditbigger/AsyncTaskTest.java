package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import com.example.JokesTeller;

import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 * Created by jyodroid on 4/9/16.
 */
public class AsyncTaskTest extends AndroidTestCase {
    public void testVerifyAsyncTaskResponse() {

        //Arrange
        Random randomJokeNumber = new Random();
        final String EMPTY_STRING = "";
        JokesTeller jokesTeller = new JokesTeller();

        int jokeNumber = randomJokeNumber.nextInt(jokesTeller.getJokesSize());

        String joke = EMPTY_STRING;

        //Act
        try {
            joke =
                    new BackEndConnectTask()
                            .execute(new Pair<>(getContext(), jokeNumber)).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //Assert
        assertFalse("Joke is " + joke, joke.equals(EMPTY_STRING));
    }
}
