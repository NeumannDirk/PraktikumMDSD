# Aufgabenblatt 3
* Namenskonventions Haupt-/Mainsystem wird 'Sys' genannt


## Ecore Modell Anpassung
* Ecore-Modell muss angepasst werden, damit ein Mapping auf PCM stattfinden kann
* Ziel: Containment der Behaviour-Elemente ist nur noch optional in Description
* Referenzen von Branch und Loop auf Behaviour Element werden zu Containments, damit Loop nicht nur auf Behaviour Element zeigt, sondern beinhaltet (wie in Palladio)
* einfachere Verarbeitung, einfacher Transformation durchzuführen
* entspricht mehr der Logik
