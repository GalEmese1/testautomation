# Gherkin formátum
Feature: Én mint egy vásárló szeretnék bejelentkezni a Tesco online áruházba.

  Rule: Van érvényes regisztrációm és pontosan adom meg az e-mail/psw-öt.

    Scenario:
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When klikkelek a Bejelentkezés-re
      Then megjelenik a Bejelentkezés
      When pontosan megadom az e-mail-t
      And pontosan megadom a psw-öt
      And klikkelek a Bejelentkezés-re
      Then bejelentkeztet, az Üdvözlünk megjelenik

  Rule: Van érvényes regisztrációm és rosszul adom meg az e-mail/psw-öt.

    Scenario:
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When klikkelek a Bejelentkezés-re
      Then megjelenik a Bejelentkezés
      When rosszul adom meg az e-mail-t, de jó formátummal
      And akármilyen psw-öt adok meg
      And klikkelek a Bejelentkezés-re
      Then Megjelenik a "Sajnos nem sikerült azonosítani a megadott adatokat. Kérjük, ellenőrizd és próbálkozz újra! Ne feledd a kis- és nagy betűk használatát!" üzenet
