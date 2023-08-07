# Magic-the-Gathering-manatarkistin
--------Tehtävänanto--------

Magic the Gatherin (MTG) on maailmankuulu korttipeli. Peliä sinun ei tarvitse ymmärtää, jotta voit tehdä
tämän tehtävän.
Jokainen kortti vaatii tietyn määrän manaa.
Manaa löytyy seuraavissa väreissä:
(W) white, (U) blue, (B) black, (R) red, (G) green ja (C) colorless.
Jokaisella kortilla on oma hinta manalle (manacost).
Jokaisella pelaajalla on tietty määrä manaa käytettävissään (manapool).
Jos manacost on osoitettu numerolla, niin sen voi maksaa millä tahansa manalla.
Jos manacost on osoitettu tietyllä värillä, niin kyseinen mana tulee maksaa sillä värillä. Yksittäinen kirjain
tarkoittaa yhtä väriä
Esimerkki:
Manapool = WRRGU
Manacost = 2RR (maksaa siis kaksi mitä tahansa ja kaksi punaista manaa)
Jos hinnassa on numero ensimmäisenä, niin voi sen maksaa neutraalilla manalla eli millä tahansa manalla.
Mutta kirjaimilla osoitetut hinnat tulee maksaa samalla manalla. Esimerkin hinnan pystyy maksamaan,
koska manapoolissa on kaksi punaista ja kolme muun väristä, niin riittää mana.
Kaikissa manacosteissa ei ole numeroa alussa, mutta sinun tulee ottaa huomioon, jos on.
Kirjoita funktio, joka tarkistaa, että onko tämänhetkisen manapoolin avulla mahdollista pelata haluttu
kortti. Argumentteina manapool ja hinta.
HasEnoughMana(”RRRR”,”2RR”)  True
HasEnoughMana(”WRUGB, ”3WW”)  False
Ohjelman tulee ottaa huomioon, että neutraalia manaa voi tarvita kuinka paljon tahansa.
Jotkin kortit eivät maksa mitään, jolloin hinnan tulee olla nolla.
