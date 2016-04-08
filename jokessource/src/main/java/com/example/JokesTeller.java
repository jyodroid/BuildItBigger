package com.example;

public class JokesTeller {

    private static final String[] jokes = {
            "Normal people believe that if it ain't broke, don't fix it. \n" +
                    "\n" +
                    "Engineers believe that if it ain't broke, it doesn't have enough features yet.",

            "To the optimist, the glass is half-full. \n" +
                    "To the pessimist, the glass is half-empty. \n" +
                    "To the engineer, the glass is twice as big as it needs to be. \n",

            "The graduate with a science degree asks, \"Why does it work?\" \n" +
                    "The graduate with an engineering degree asks, \"How does it work?\" \n" +
                    "The graduate with an accounting degree asks, \"How much will it cost?\" \n" +
                    "The graduate with an arts degree asks, \"Do you want fries with that?\" \n",

            "Ordinarily, staring is creepy. But if you spread your attention across many individuals, then it's just people watching.",

            "A neutron walks into a bar and orders a drink. When the neutron gets his drink, he asks, \"Bartender, how much do I owe you?\"\n" +
                    "The bartender replies, \"For you, neutron, no charge.\"",

            "Q: What does D.A.M stand for?\n" +
                    "A: Mothers Against Dyslexia."
    };

    public String tellJoke(int jokeNumber) {

        if (jokeNumber > jokes.length - 1) {
            jokeNumber = 0;
        }

        return jokes[jokeNumber];
    }

    public int getJokesSize() {
        return jokes.length;
    }
}
