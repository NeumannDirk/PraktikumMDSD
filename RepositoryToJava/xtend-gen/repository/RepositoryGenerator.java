package repository;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement;
import simplePalladio.SystemIndependentViewPoint.Interface;
import simplePalladio.SystemIndependentViewPoint.RepositoryViewType;

@SuppressWarnings("all")
public class RepositoryGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
  }
  
  protected void _generate(final RepositoryViewType r, final IFileSystemAccess fsa) {
  }
  
  protected void _generate(final Interface i, final IFileSystemAccess fsa) {
  }
  
  protected void _generate(final AbstractRepositoryElement aRE, final IFileSystemAccess fsa) {
  }
  
  public void generate(final EObject i, final IFileSystemAccess fsa) {
    if (i instanceof Interface) {
      _generate((Interface)i, fsa);
      return;
    } else if (i instanceof AbstractRepositoryElement) {
      _generate((AbstractRepositoryElement)i, fsa);
      return;
    } else if (i instanceof RepositoryViewType) {
      _generate((RepositoryViewType)i, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(i, fsa).toString());
    }
  }
}
