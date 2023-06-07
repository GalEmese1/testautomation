# Gherkin formátum
Feature: Én, mint egy vásárló szeretnék kijelentkezni a Tesco online áruházból.

  Rule: Bejelentkezés után szabályosan kilép.

    Scenario: Bejelentkezés után szabályosan kilép.
      Given nyito oldalon vagyok
      And be vagyok jelentkezve
      And a nyelv magyarra van beallitva
      When klikkelek a Kijelentkezésre
      Then kijelentkeztet, megjelenik a Bejelentkezés menüpont

