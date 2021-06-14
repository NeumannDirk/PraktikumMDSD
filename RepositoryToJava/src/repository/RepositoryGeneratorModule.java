package repository;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class RepositoryGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "simplePalladio.SystemIndependentViewPoint.presentation.SystemIndependentViewPointEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "systemindependentviewpoint";
	}
	
    public Class<? extends IGenerator> bindIGenerator() {
        return RepositoryGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }

}
