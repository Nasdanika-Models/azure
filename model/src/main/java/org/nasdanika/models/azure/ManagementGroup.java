/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.ManagementGroup#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getManagementGroup()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10011-icon-service-Management-Groups.svg' label='Management Group' documentation-reference='doc/management-group.md' description='Management groups are containers that help manage access, policy, and compliance across multiple subscriptions'"
 * @generated
 */
public interface ManagementGroup extends ManagementGroupElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.ManagementGroupElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getManagementGroup_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagementGroupElement> getElements();

} // ManagementGroup
