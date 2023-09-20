/**
 */
package org.nasdanika.models.azure.compute.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.Disk;
import org.nasdanika.models.azure.compute.VirtualMachine;
import org.nasdanika.models.azure.compute.VirtualMachineImage;
import org.nasdanika.models.azure.compute.VirtualMachineSize;

import org.nasdanika.models.azure.impl.ResourceImpl;

import org.nasdanika.models.azure.networking.NetworkInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl#getDisks <em>Disks</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl#getNetworkInterfaces <em>Network Interfaces</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.compute.impl.VirtualMachineImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualMachineImpl extends ResourceImpl implements VirtualMachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Disk> getDisks() {
		return (EList<Disk>)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__DISKS, ComputePackage.Literals.VIRTUAL_MACHINE__DISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface getNetworkInterfaces() {
		return (NetworkInterface)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES, ComputePackage.Literals.VIRTUAL_MACHINE__NETWORK_INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkInterfaces(NetworkInterface newNetworkInterfaces, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newNetworkInterfaces, ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkInterfaces(NetworkInterface newNetworkInterfaces) {
		eDynamicSet(ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES, ComputePackage.Literals.VIRTUAL_MACHINE__NETWORK_INTERFACES, newNetworkInterfaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachineImage getImage() {
		return (VirtualMachineImage)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__IMAGE, ComputePackage.Literals.VIRTUAL_MACHINE__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineImage basicGetImage() {
		return (VirtualMachineImage)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__IMAGE, ComputePackage.Literals.VIRTUAL_MACHINE__IMAGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(VirtualMachineImage newImage) {
		eDynamicSet(ComputePackage.VIRTUAL_MACHINE__IMAGE, ComputePackage.Literals.VIRTUAL_MACHINE__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualMachineSize getSize() {
		return (VirtualMachineSize)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__SIZE, ComputePackage.Literals.VIRTUAL_MACHINE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachineSize basicGetSize() {
		return (VirtualMachineSize)eDynamicGet(ComputePackage.VIRTUAL_MACHINE__SIZE, ComputePackage.Literals.VIRTUAL_MACHINE__SIZE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(VirtualMachineSize newSize) {
		eDynamicSet(ComputePackage.VIRTUAL_MACHINE__SIZE, ComputePackage.Literals.VIRTUAL_MACHINE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComputePackage.VIRTUAL_MACHINE__DISKS:
				return ((InternalEList<?>)getDisks()).basicRemove(otherEnd, msgs);
			case ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES:
				return basicSetNetworkInterfaces(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComputePackage.VIRTUAL_MACHINE__DISKS:
				return getDisks();
			case ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES:
				return getNetworkInterfaces();
			case ComputePackage.VIRTUAL_MACHINE__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
			case ComputePackage.VIRTUAL_MACHINE__SIZE:
				if (resolve) return getSize();
				return basicGetSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComputePackage.VIRTUAL_MACHINE__DISKS:
				getDisks().clear();
				getDisks().addAll((Collection<? extends Disk>)newValue);
				return;
			case ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES:
				setNetworkInterfaces((NetworkInterface)newValue);
				return;
			case ComputePackage.VIRTUAL_MACHINE__IMAGE:
				setImage((VirtualMachineImage)newValue);
				return;
			case ComputePackage.VIRTUAL_MACHINE__SIZE:
				setSize((VirtualMachineSize)newValue);
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
			case ComputePackage.VIRTUAL_MACHINE__DISKS:
				getDisks().clear();
				return;
			case ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES:
				setNetworkInterfaces((NetworkInterface)null);
				return;
			case ComputePackage.VIRTUAL_MACHINE__IMAGE:
				setImage((VirtualMachineImage)null);
				return;
			case ComputePackage.VIRTUAL_MACHINE__SIZE:
				setSize((VirtualMachineSize)null);
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
			case ComputePackage.VIRTUAL_MACHINE__DISKS:
				return !getDisks().isEmpty();
			case ComputePackage.VIRTUAL_MACHINE__NETWORK_INTERFACES:
				return getNetworkInterfaces() != null;
			case ComputePackage.VIRTUAL_MACHINE__IMAGE:
				return basicGetImage() != null;
			case ComputePackage.VIRTUAL_MACHINE__SIZE:
				return basicGetSize() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualMachineImpl
