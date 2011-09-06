Advanced Scala
==============

Målet for denne workshopen er å lage et lite test-rammeverk i Scala.

Sammen med denne README filen finner dere også et skjelett i `src/main/scala/minitest/MiniTest.scala` samt eksempler på hvordan
rammeverket kan brukes i `src/test/scala`

Oppgave1.scala
=====
Kommenter inn koden og få testene til å kjøre
Her anbefales det å printe ut resultatet så man ser at man får forventet resultat

Oppgave2.scala
=====
Test rammeverket må støtte tester som kaster exceptions under kjøring
Kommenter inn koden og få testen til å kjøre med forventet resultat

Oppgave3.scala
=====
Implementer støtte for `pending` tester.
En pending test er hverken riktig eller feil - men pending

Oppgave4.scala
=====
Implementer ved hjelp av implicit conversions en mer fancy assertSyntax

Oppgave5.scala
=====
Implementer støtte for Before og After

Oppgave6.scala
=====
Skriv støtte for god rapportering.
Alle gode test-rammeverk burde produsere en vakker og informativ test-rapport.
Hvor mange tester feilet, hvor mange var ok, pending osv...
tips: linux/mac brukere kan printe ut fagekodene i Console for fargerik output f.eks println(Console.GREEN + "Hello World")

