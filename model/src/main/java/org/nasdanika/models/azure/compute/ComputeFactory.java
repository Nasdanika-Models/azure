/**
 */
package org.nasdanika.models.azure.compute;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.azure.compute.ComputePackage
 * @generated
 */
public interface ComputeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComputeFactory eINSTANCE = org.nasdanika.models.azure.compute.impl.ComputeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	VirtualMachine createVirtualMachine();

	/**
	 * Returns a new object of class '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk</em>'.
	 * @generated
	 */
	Disk createDisk();

	/**
	 * Returns a new object of class '<em>Disk Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk Type</em>'.
	 * @generated
	 */
	DiskType createDiskType();

	/**
	 * Returns a new object of class '<em>Virtual Machine Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Size</em>'.
	 * @generated
	 */
	VirtualMachineSize createVirtualMachineSize();

	/**
	 * Returns a new object of class '<em>Virtual Machine Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Image</em>'.
	 * @generated
	 */
	VirtualMachineImage createVirtualMachineImage();

	/**
	 * Returns a new object of class '<em>Virtual Machine Scale Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine Scale Set</em>'.
	 * @generated
	 */
	VirtualMachineScaleSet createVirtualMachineScaleSet();

	/**
	 * Returns a new object of class '<em>App Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Service</em>'.
	 * @generated
	 */
	AppService createAppService();

	/**
	 * Returns a new object of class '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Instance</em>'.
	 * @generated
	 */
	ContainerInstance createContainerInstance();

	/**
	 * Returns a new object of class '<em>Kubernetes Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kubernetes Service</em>'.
	 * @generated
	 */
	KubernetesService createKubernetesService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComputePackage getComputePackage();

} //ComputeFactory
