# Aufgabenblatt 1
* Technologie: Eclipse Modeling Tool 2020-12 + OCL Basics and Example SDK

## a)
### EMF-Metamodellierung
* siehe Tag v0.0.1 in GitHub

## b)

### EMF-Metamodellierung
* siehe Tag v0.0.2 in GitHub

### Dokumenatation des Refactorings
1. _Common_ Package zur Auslagerung von wiederauftretendenn Elementen
2. _NamedElement_ als super type für alle Elemente, die einen Namen als Attribut haben
3. abstrakte Klasse _InterfaceCommunicator_ wird super type für _AbstractComponent_ und _System_ verwendet und Relationen zu Interface wurden umgenannt zur _parentProviderCommunicator_ und _parentRequirereeCommunicator_
4. Umbenennung der Relationen zwischen den AssemblyContexts mit provided und required Roles gemäß vorherigen Änderungen (3.)
5. Rückrichtungen _Role_ und _AssemblyContext_ hinzugefügt: _parentRequirereeAssemblyContext_ und _parentProviderAssemblyContext_
6. OCL-Anpassung gemäß der vorherigen Änderungen
7. neues OCL-Constraint bei _Role_: parentRequirereeAssemblyContext xor parentProviderAssemblyContext (MustHaveOnlyOneParent)