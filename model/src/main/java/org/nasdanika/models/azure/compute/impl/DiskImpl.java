/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.Disk;
import org.nasdanika.models.azure.compute.DiskType;

import org.nasdanika.models.azure.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.DiskImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.DiskImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends ResourceImpl implements Disk {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.DISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiskType getType() {
		return (DiskType)eDynamicGet(ComputePackage.DISK__TYPE, ComputePackage.Literals.DISK__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiskType basicGetType() {
		return (DiskType)eDynamicGet(ComputePackage.DISK__TYPE, ComputePackage.Literals.DISK__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DiskType newType) {
		eDynamicSet(ComputePackage.DISK__TYPE, ComputePackage.Literals.DISK__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return (Integer)eDynamicGet(ComputePackage.DISK__SIZE, ComputePackage.Literals.DISK__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		eDynamicSet(ComputePackage.DISK__SIZE, ComputePackage.Literals.DISK__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.DISK__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComputePackage.DISK__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComputePackage.DISK__TYPE:
				setType((DiskType)newValue);
				return;
			case ComputePackage.DISK__SIZE:
				setSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComputePackage.DISK__TYPE:
				setType((DiskType)null);
				return;
			case ComputePackage.DISK__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComputePackage.DISK__TYPE:
				return basicGetType() != null;
			case ComputePackage.DISK__SIZE:
				return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DiskImpl
