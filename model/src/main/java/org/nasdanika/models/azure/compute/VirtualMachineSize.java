/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.AzureElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachineSize#getVirtualMachines <em>Virtual Machines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachineSize()
 * @model annotation="urn:org.nasdanika label='Virtual Machine Size' documentation-reference='doc/virtual-machine-size.md' description='Size of a virtual machine in terms of CPU and RAM'"
 * @generated
 */
public interface VirtualMachineSize extends AzureElement {
	/**
	 * Returns the value of the '<em><b>Virtual Machines</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.compute.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computed opposite to VirtualMachine.size
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Machines</em>' reference list.
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachineSize_VirtualMachines()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<VirtualMachine> getVirtualMachines();

} // VirtualMachineSize
