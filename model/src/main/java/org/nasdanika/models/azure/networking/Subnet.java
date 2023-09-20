/**
 */
package org.nasdanika.models.azure.networking;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.Subnet#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getSubnet()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/02742-icon-service-Subnet.svg'"
 * @generated
 */
public interface Subnet extends Resource {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.networking.SubnetResource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.azure.networking.SubnetResource#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources connected to this subnet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.azure.networking.NetworkingPackage#getSubnet_Resources()
	 * @see org.nasdanika.models.azure.networking.SubnetResource#getSubnet
	 * @model opposite="subnet"
	 * @generated
	 */
	EList<SubnetResource> getResources();

} // Subnet
