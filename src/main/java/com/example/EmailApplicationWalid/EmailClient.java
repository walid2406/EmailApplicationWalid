package com.example.EmailApplicationWalid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


class EmailClient {

    private SpellChecker spellChecker;
   // private AdvancedSpellChecker basicSpellChecker;


    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    /* // pas besoin du constructeur parametre lors utlisation de l injection par setter methode 3

    public EmailClient(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }*/

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
