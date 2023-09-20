/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.AzureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachineImage#getVirtualMachines <em>Virtual Machines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachineImage()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10040-icon-service-VM-Images-(Classic).svg' label='Virtual Machine Image' documentation-reference='doc/virtual-machine-image.md' description='Initial contents of a VM disk used to initialize a VM'"
 * @generated
 */
public interface VirtualMachineImage extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Virtual Machines</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.compute.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to VirtualMachine.image
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Machines</em>' reference list.
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachineImage_VirtualMachines()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualMachines();

} // VirtualMachineImage
