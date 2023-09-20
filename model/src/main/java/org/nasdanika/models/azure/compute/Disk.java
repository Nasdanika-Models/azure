/**
 */
package org.nasdanika.models.azure.compute;

import org.nasdanika.models.azure.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.Disk#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.Disk#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.compute.ComputePackage#getDisk()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10032-icon-service-Disks.svg' documentation-reference='doc/disk.md' description='A block-level storage volume managed by Azure and used with Azure Virtual Machines'"
 * @generated
 */
public interface Disk extends Resource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DiskType)
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getDisk_Type()
	 * @model annotation="urn:org.nasdanika opposite='virtualMachines'"
	 * @generated
	 */
	DiskType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.compute.Disk#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DiskType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disk size in gigabytes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getDisk_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.compute.Disk#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // Disk
