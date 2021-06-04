/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mdsd.simplepalladio.generator

import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.XtextResourceSet
import simplePalladio.DeploymentViewPoint.AllocationViewType

import static extension org.eclipse.emf.common.util.URI.createPlatformResourceURI

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AllocationViewTypeGenerator extends AbstractGenerator {
	@Inject 
	extension FileExtensionProvider;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		serialize(resource.toOutputURI, (resource.contents.head as AllocationViewType))
	}

	private def serialize(URI outputURI, AllocationViewType allocation) {
		val resource = new XtextResourceSet().createResource(outputURI)
		resource.contents += allocation
		resource.save(newHashMap)
	}

	private def toOutputURI(Resource input) {
		val inputUri = input.URI
		System.out.print(inputUri)
		val inputPath = inputUri.toPlatformString(true)

		val outputPath = inputPath.replace("." + primaryFileExtension, "_allocation.deploymentviewpoint" )

		outputPath.createPlatformResourceURI(true)
	}
}
