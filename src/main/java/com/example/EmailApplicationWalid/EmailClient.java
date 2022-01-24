package com.example.EmailApplicationWalid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class EmailClient {

    @Autowired
    @Qualifier("advancedSpellChecker")
    //@Qualifier("basicSpellChecker")
    private SpellChecker spellChecker;
   // private AdvancedSpellChecker basicSpellChecker;


    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
/*  cette partie sera automatque en utilisant annotation autowired et quqlifier
    @Autowired  //ici ajouter au setter lors de scan
    public void setSpellChecker(@Qualifier("basicSpellChecker") SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
*/
    /* // pas besoin du constructeur parametre lors utlisation de l injection par setter methode 3

    public EmailClient(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }*/

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
