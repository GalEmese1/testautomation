# Gherkin formátum
Feature: Én mint egy vásárló szeretnék bejelentkezni a Tesco online áruházba.

  Rule: Van érvényes regisztrációm és pontosan adom meg az e-mail/psw-öt.

    Scenario: Bejelentkezés érvényes adatokkal
      Given nyito oldalon vagyok
      And cookiekat elfogadtam
      And a nyelv magyar
      When bejelentkezek a "emese.gal.id@gmail.com" és "Tesco!Tesco1" adatokkal
      Then bejelentkeztet, a megjelenik a(z) "Üdvözlünk" felirat

  Rule: Van érvényes regisztrációm és rosszul adom meg az e-mail/psw-öt.

    Scenario:
      Given nyito oldalon vagyok
      And cookiekat elfogadtam
      And a nyelv magyar
      When bejelentkezek a rossz "emese.galid@gmail.com" és "password1234" adatokkal
      Then Megjelenik a Sajnos nem sikerult azonosítani a megadott adatokat uzenet
