/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource is an entity managed by Azure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.Resource#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.Resource#getResourceTags <em>Resource Tags</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getResource()
 * @model abstract="true"
 *        annotation="urn:org.nasdanika description='An entity managed by Azure'"
 * @generated
 */
public interface Resource extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A resource can be associated with zero or more locations. E.g. a VM can be deployed to a region or a specific availability zone in a region. A kubernetes cluster can be deployed to several availability zones.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getResource_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * Returns the value of the '<em><b>Resource Tags</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Tags</em>' map.
	 * @see org.nasdanika.models.azure.AzurePackage#getResource_ResourceTags()
	 * @model mapType="org.nasdanika.models.azure.Tag&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EObject&gt;"
	 * @generated
	 */
	EMap<String, EObject> getResourceTags();

} // Resource
