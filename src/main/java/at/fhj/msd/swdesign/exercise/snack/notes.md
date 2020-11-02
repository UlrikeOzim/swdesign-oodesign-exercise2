# Beispiel Refactor to SOLID

```FoodMarket``` hat verschiedene *Snackbars*, jede *Snackbar* hat als Ergebnis ein Objekt ```Snack```





**Problem** 
Analyse des Codes, stellen Sie fest wo die Prinzipien von SOLID verletzt werden und wie die SOLID Prinzipien besser angewendet werden können.



### Aufgaben 


#### 1. Analyse der Snack-Anwendung


**ISP**

wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden
(Tipp es gibt nur ein Interface)

**OCP**

wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden
(Tipp doppelter Code in Bars)

**DIP**

wo findet man eine Verletzung diese Prinzips, wie kann dies geändert werden
(Tipp Klasse Foodmarket)


**TODO**:

Wo befinden sich die genannten Schwachstellen?

Erstellen sie ein Dokument (pdf) mit der Beschreibung (welcher Codeteil, Screenshot, Begründung)    



    	
####  2. Refactor to SOLID

1. ISP - Wie geht man damit um, dass nicht alle Funktionen des Interfaces genutzt werden?
  
2. OCP - In den Klassen *EspressoMachine/FilterMachine* befindet sich doppelter Code, wie kann dies vermieden werden?
	
3. DIP - In der Klasse *Coffeeshop* finden sich Instanzen der *EspressoMachine/FilterMachine*, wie kann dies vermieden werden? 

Die Klasse *CoffeeMain* bleibt unverändert und die Ausgabe soll in etwa so aussehen

    This is a tasty Espresso
    This is a tasty Filter Coffee 
    

**TODO**:

- Ändern Sie den Source-Code 
- Erstellen sie ein Dokument (pdf) mit der Beschreibung der Änderungen (welcher Codeteil, Screenshot, Begründung)    



