/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.azure.Resource;

import org.nasdanika.models.azure.networking.NetworkInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachine#getDisks <em>Disks</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachine#getNetworkInterfaces <em>Network Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachine#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.VirtualMachine#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachine()
 * @model annotation="urn:org.nasdanika icon='https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/compute/10021-icon-service-Virtual-Machine.svg' label='Virtual Machine' documentation-reference='doc/virtual-machine.md' description='An image service instance that provides on-demand and scalable computing resources with usage-based pricing'"
 * @generated
 */
public interface VirtualMachine extends Resource {
	/**
	 * Returns the value of the '<em><b>Disks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.azure.compute.Disk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disks</em>' containment reference list.
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachine_Disks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Disk> getDisks();

	/**
	 * Returns the value of the '<em><b>Network Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interfaces</em>' containment reference.
	 * @see #setNetworkInterfaces(NetworkInterface)
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachine_NetworkInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	NetworkInterface getNetworkInterfaces();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.compute.VirtualMachine#getNetworkInterfaces <em>Network Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Interfaces</em>' containment reference.
	 * @see #getNetworkInterfaces()
	 * @generated
	 */
	void setNetworkInterfaces(NetworkInterface value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(VirtualMachineImage)
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachine_Image()
	 * @model annotation="urn:org.nasdanika opposite='virtualMachines'"
	 * @generated
	 */
	VirtualMachineImage getImage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.compute.VirtualMachine#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(VirtualMachineImage value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' reference.
	 * @see #setSize(VirtualMachineSize)
	 * @see org.nasdanika.models.azure.compute.ComputePackage#getVirtualMachine_Size()
	 * @model annotation="urn:org.nasdanika opposite='virtualMachines'"
	 * @generated
	 */
	VirtualMachineSize getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.azure.compute.VirtualMachine#getSize <em>Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(VirtualMachineSize value);

} // VirtualMachine
