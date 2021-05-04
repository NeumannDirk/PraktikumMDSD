/**
 */
package simplePalladio.SystemIndependentViewPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplePalladio.SystemIndependentViewPoint.RepositoryViewType#getRepositoryElements <em>Repository Elements</em>}</li>
 * </ul>
 *
 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getRepositoryViewType()
 * @model
 * @generated
 */
public interface RepositoryViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplePalladio.SystemIndependentViewPoint.AbstractRepositoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Elements</em>' containment reference list.
	 * @see simplePalladio.SystemIndependentViewPoint.SystemIndependentViewPointPackage#getRepositoryViewType_RepositoryElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractRepositoryElement> getRepositoryElements();

} // RepositoryViewType
