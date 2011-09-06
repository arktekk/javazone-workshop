Advanced Scala
==============

Målet for denne workshopen er å lage et lite testrammeverk i Scala.

Sammen med denne README-filen finner dere et skjelett vi skal ta utgangspunkt i. Dette skjelettet består av et Scala-prosjekt med standard struktur, som bruker simple build tool (sbt) som byggeverktøy. En liten oversikt over sbt finner du i roten av git-repositoriet.

Under `src/test/scala/` ligger et sett av testklasser. Disse klassene inneholder tester som viser hvordan testrammeverket kan brukes. Forløpig er alle testene utkommentert, men det skal vi gjøre noe med. Ta for dere hver av stegende beskrevet under. For å gjøre det enklest mulig for dere selv, anbefaler vi å utkommentere litt og litt. Målet er å få alle testene til å kjøre, uten å endre testklassene.

Oppgave1.scala - Enkle assertions
=====
Kommenter inn koden og få testene til å kjøre.
Her anbefaler vi å printe ut resultatet slik at man ser at resultat er som forventet.

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

