# Gherkin formátum
Feature: Én mint egy vásárló szeretnék bejelentkezni a Tesco online áruházba.

  Rule: Van érvényes regisztrációm és pontosan adom meg az e-mail/psw-öt.

    Scenario:
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When klikkelek a Bejelentkezes-re
      Then megjelenik a Bejelentkezes
      When pontosan megadom az e-mail-t
      And pontosan megadom a psw-ot
      And klikkelek a Bejelentkezes-re
      Then bejelentkeztet, az Udvozlunk megjelenik

  Rule: Van érvényes regisztrációm és rosszul adom meg az e-mail/psw-öt.

    Scenario:
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When klikkelek a Bejelentkezes-re
      Then megjelenik a Bejelentkezes
      When rosszul adom meg az e-mail-t, de jo formatummal
      And akármilyen psw-ot adok meg
      And klikkelek a Bejelentkezes-re
      Then Megjelenik a Sajnos nem sikerult azonosítani a megadott adatokat uzenet
