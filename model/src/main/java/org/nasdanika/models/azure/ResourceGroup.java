/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.ResourceGroup#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getResourceGroup()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10007-icon-service-Resource-Groups.svg' label='Resource Group' documentation-reference='doc/resource-group.md' description='A container that holds related resources for an Azure solution'"
 * @generated
 */
public interface ResourceGroup extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getResourceGroup_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceGroup
