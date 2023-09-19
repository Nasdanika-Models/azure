/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.Region#getAvailabilityZones <em>Availability Zones</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.AzurePackage#getRegion()
 * @model annotation="urn:org.nasdanika documentation-reference='doc/region.md' description='A set of datacenters, deployed within a latency-defined perimeter and connected through a dedicated regional low-latency network'"
 * @generated
 */
public interface Region extends Location {
	/**
	 * Returns the value of the '<em><b>Availability Zones</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.AvailabilityZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Zones</em>' containment reference list.
	 * @see org.nasdanika.models.azure.AzurePackage#getRegion_AvailabilityZones()
	 * @model containment="true"
	 * @generated
	 */
	EList<AvailabilityZone> getAvailabilityZones();

} // Region
