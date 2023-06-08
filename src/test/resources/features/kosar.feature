# Gherkin formátum
Feature: Én, mint egy vásárló szeretnék terméket betenni ill. kivenni a kosárból.

  Rule: Sikeresen betesz a kosárba egy terméket a megkeresése után.

    Scenario: Sikeres kosárbahelyezés
      Given a Találatok oldalon vagyok
      And be vagyok jelentkezve
      And a nyelv magyarra van beallitva
      And megjelenítve 1-től valamennyi termék
      When kattintok az első termékre
      Then megjelenik a termék oldala
      And megjelent a Hozzáad gomb
      When klikkelek a Hozzáad-ra
      Then kiírja, hogy "1 db a kosárban"

  Rule: Sikeresen kivesz a kosárból egy terméket a betétele után.

    Scenario: Sikeres kosárból kivétel
      Given a főoldalon vagyok
      And be vagyok jelentkezve
      And van termék a kosárban
      And a nyelv magyarra van állítva
      When kattintok a Kosárra
      Then megjelenik a Kosár oldala
      And megjelent a Kosár ürítése gomb
      When klikkelek a Kosár ürítése-re
      Then kiírja, hogy "Biztosan törölni szeretnéd a kosarad tartalmát?"
      When kattintok a Törlésre
      Then megjelenik a "A kosarad jelenleg üres" felirat
