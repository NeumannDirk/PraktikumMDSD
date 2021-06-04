# Aufgabenblatt 2
## xtext
1. xmi generation wurde hinzugefügt
2. neues xtext simplepalladio, das alle view types in einer datei zusammengefasst 
## Änderungen am Metamodel
1. System wurde zu einem NamedElement refactored
2. Role wurde zu einem NamedElement refactored
3. Interfaces können auch alleinstehend definiert werden ohne validierungsfehler zu erzeugen
4. Fehler in ConnectedAssemblyContextsMustBeOnConnectedContainers behoben
	1. Typen konnten nicht nicht aufgelöst werden
	2. Verknüpfte Container wurden nicht korrekt überprüft
