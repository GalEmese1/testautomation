# Gherkin formátum
Feature: Én, mint egy vásárló szeretném a Tesco online áruház nyelvét angolról magyarra és magyarról angolra váltani.

  Rule: Angolról Magyarra válthat

    Scenario: Angolul van -> Magyarra vált
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      When klikk a Magyar menüpontra
      Then megjelenik az English menüpont

  Rule: Magyarról Angolra válthat

    Scenario: Magyarul van -> Angolra vált
      Given nyito oldalon vagyok
      And a nyelv angolra van beallitva
      When klikk az English menüpontra
      Then megjelenik a Magyar menüpont

