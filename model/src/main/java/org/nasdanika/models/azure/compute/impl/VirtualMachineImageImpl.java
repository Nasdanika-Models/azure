/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.VirtualMachine;
import org.nasdanika.models.azure.compute.VirtualMachineImage;

import org.nasdanika.models.azure.impl.AzureElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImageImpl#getVirtualMachines <em>Virtual Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImageImpl extends AzureElementImpl implements VirtualMachineImage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.VIRTUAL_MACHINE_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualMachine> getVirtualMachines() {
		// TODO: implement this method to return the 'Virtual Machines' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES:
				return getVirtualMachines();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComputePackage.VIRTUAL_MACHINE_IMAGE__VIRTUAL_MACHINES:
				return !getVirtualMachines().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VirtualMachineImageImpl
