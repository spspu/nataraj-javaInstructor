package com.mainapp;

import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static int countWords(String text) {
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        return tokenizer.countTokens();
    }

    public static void main(String[] args) {

        int countWords = App.countWords("Hello, how are you ?");
        logger.info("Words Count = {}", countWords);

    }
}