# Gherkin formátum
Feature: Én, mint egy vásárló szeretnék visszajelzést küldeni a weboldal működéséről

  Rule: A Tesco főoldalon a jobb szélen megtalálható a működő Visszajelzés menüpont

    Scenario: Sikeres visszajelzés küldés
      Given nyito oldalon vagyok
      And a nyelv magyarra van beallitva
      And látszik a Visszajelzés menüpont
      When klikkelek a Visszajelzés-re
      Then felnyílik a "Véleményező kérdőív"
      When a csillagokat bejelölöm
      And a Nem-et kiválasztom
      When klikkelek az "Elküldés"-re
      Then megjelenik a "Köszönjük, hogy időt fordított..." felirat a kérdőíven
      When Klikk a kérdőív x-ére, azaz bezárni
      Then bezárt, eltűnt


