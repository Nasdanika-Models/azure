/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.Tenant#getManagementGroups <em>Management Groups</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getTenant()
 * @model
 * @generated
 */
public interface Tenant extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Management Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.ManagementGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management Groups</em>' containment reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getTenant_ManagementGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ManagementGroup> getManagementGroups();

} // Tenant
