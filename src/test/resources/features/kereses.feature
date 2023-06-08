# Gherkin formátum
Feature: Én, mint egy vásárló szeretnék terméket keresni a Tesco online webáruházban.

  Rule: Létező termék keresése esetén feljön a találati lista

    Scenario: Létező termék keresése
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When keresek egy letezo termeket
      Then megjelenik a talalati lista

  Rule: Nem létező termék keresése esetén feljön a "Sajnos nem található ilyen termék" üzenet

    Scenario: Nem létező termék keresése
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When keresek egy nem letezo termeket
      Then megjelenik a "Sajnos nem található ilyen termék" üzenet