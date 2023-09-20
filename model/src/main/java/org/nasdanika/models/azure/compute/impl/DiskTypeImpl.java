/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.Disk;
import org.nasdanika.models.azure.compute.DiskType;

import org.nasdanika.models.azure.impl.AzureElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.DiskTypeImpl#getDisks <em>Disks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskTypeImpl extends AzureElementImpl implements DiskType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.DISK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Disk> getDisks() {
		// TODO: implement this method to return the 'Disks' reference list
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
			case ComputePackage.DISK_TYPE__DISKS:
				return getDisks();
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
			case ComputePackage.DISK_TYPE__DISKS:
				return !getDisks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiskTypeImpl
