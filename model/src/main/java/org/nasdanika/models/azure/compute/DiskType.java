/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.AzureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.DiskType#getDisks <em>Disks</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.compute.ComputePackage#getDiskType()
 * @model annotation="urn:org.nasdanika label='Disk Type' documentation-reference='doc/disk-type.md' description='Azure managed disks currently offers five disk types, each intended to address a specific customer scenario'"
 * @generated
 */
public interface DiskType extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Disks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.compute.Disk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to Disk.type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disks</em>' reference list.
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getDiskType_Disks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Disk> getDisks();

} // DiskType
