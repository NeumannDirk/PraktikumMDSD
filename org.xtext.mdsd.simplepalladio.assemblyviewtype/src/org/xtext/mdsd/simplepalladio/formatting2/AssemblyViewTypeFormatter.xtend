/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.mdsd.simplepalladio.services.AssemblyViewTypeGrammarAccess
import simplePalladio.AssemblyViewPoint.AssemblyViewType

class AssemblyViewTypeFormatter extends AbstractFormatter2 {
	
	@Inject extension AssemblyViewTypeGrammarAccess

	def dispatch void format(AssemblyViewType assemblyViewType, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (system : assemblyViewType.systems) {
			system.format
		}
	}

	def dispatch void format(simplePalladio.AssemblyViewPoint.System system, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractSystemElement : system.systemElements) {
			abstractSystemElement.format
		}
	}
	
}
