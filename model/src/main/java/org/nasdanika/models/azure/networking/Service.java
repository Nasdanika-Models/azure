/**
 */
package org.nasdanika.models.azure.networking;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.Service#getEndpoints <em>Endpoints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Resource {
	/**
	 * Returns the value of the '<em><b>Endpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.networking.ServiceEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoints</em>' containment reference list.
	 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getService_Endpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceEndpoint> getEndpoints();

} // Service
