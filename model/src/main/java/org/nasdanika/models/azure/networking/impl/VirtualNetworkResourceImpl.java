/**
 */
package org.nasdanika.models.azure.networking.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.azure.impl.ResourceImpl;

import org.nasdanika.models.azure.networking.NetworkingPackage;
import org.nasdanika.models.azure.networking.VirtualNetwork;
import org.nasdanika.models.azure.networking.VirtualNetworkResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Network Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl#getVirtualNetwork <em>Virtual Network</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VirtualNetworkResourceImpl extends ResourceImpl implements VirtualNetworkResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNetworkResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualNetwork getVirtualNetwork() {
		return (VirtualNetwork)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetwork basicGetVirtualNetwork() {
		return (VirtualNetwork)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualNetwork(VirtualNetwork newVirtualNetwork, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newVirtualNetwork, NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualNetwork(VirtualNetwork newVirtualNetwork) {
		eDynamicSet(NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, NetworkingPackage.Literals.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, newVirtualNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				VirtualNetwork virtualNetwork = basicGetVirtualNetwork();
				if (virtualNetwork != null)
					msgs = ((InternalEObject)virtualNetwork).eInverseRemove(this, NetworkingPackage.VIRTUAL_NETWORK__RESOURCES, VirtualNetwork.class, msgs);
				return basicSetVirtualNetwork((VirtualNetwork)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				return basicSetVirtualNetwork(null, msgs);
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				if (resolve) return getVirtualNetwork();
				return basicGetVirtualNetwork();
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				setVirtualNetwork((VirtualNetwork)newValue);
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				setVirtualNetwork((VirtualNetwork)null);
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
			case NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK:
				return basicGetVirtualNetwork() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNetworkResourceImpl
