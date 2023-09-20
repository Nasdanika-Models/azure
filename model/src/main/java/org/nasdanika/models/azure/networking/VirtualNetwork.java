/**
 */
package org.nasdanika.models.azure.networking;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.VirtualNetwork#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.networking.VirtualNetwork#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getVirtualNetwork()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/10061-icon-service-Virtual-Networks.svg' label='Virtual Network'"
 * @generated
 */
public interface VirtualNetwork extends Resource {
	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.networking.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getVirtualNetwork_Subnets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnets();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.azure.networking.VirtualNetworkResource#getVirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources connected to this Virtual Network. Computed opposite to VirtualNetworkResource.virtualNetwork
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference.
	 * @see #setResources(VirtualNetworkResource)
	 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getVirtualNetwork_Resources()
	 * @see org.nasdanika.models.azure.networking.VirtualNetworkResource#getVirtualNetwork
	 * @model opposite="virtualNetwork"
	 * @generated
	 */
	VirtualNetworkResource getResources();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.networking.VirtualNetwork#getResources <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(VirtualNetworkResource value);

} // VirtualNetwork
