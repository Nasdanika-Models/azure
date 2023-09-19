/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.Subscription#getResourceGroups <em>Resource Groups</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getSubscription()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10002-icon-service-Subscriptions.svg' documentation-reference='doc/subscription.md' description='A logical container used to provision related resources'"
 * @generated
 */
public interface Subscription extends ManagementGroupElement {
	/**
	 * Returns the value of the '<em><b>Resource Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Groups</em>' containment reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getSubscription_ResourceGroups()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika homogenous='true'"
	 * @generated
	 */
	EList<ResourceGroup> getResourceGroups();

} // Subscription
