/**
 */
package org.nasdanika.models.azure.networking.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.azure.impl.ResourceImpl;

import org.nasdanika.models.azure.networking.NetworkingPackage;
import org.nasdanika.models.azure.networking.Subnet;
import org.nasdanika.models.azure.networking.VirtualNetwork;
import org.nasdanika.models.azure.networking.VirtualNetworkResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualNetworkImpl extends ResourceImpl implements VirtualNetwork {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.VIRTUAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subnet> getSubnets() {
		return (EList<Subnet>)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK__SUBNETS, NetworkingPackage.Literals.VIRTUAL_NETWORK__SUBNETS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualNetworkResource getResources() {
		return (VirtualNetworkResource)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK__RESOURCES, NetworkingPackage.Literals.VIRTUAL_NETWORK__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkResource basicGetResources() {
		return (VirtualNetworkResource)eDynamicGet(NetworkingPackage.VIRTUAL_NETWORK__RESOURCES, NetworkingPackage.Literals.VIRTUAL_NETWORK__RESOURCES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(VirtualNetworkResource newResources, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResources, NetworkingPackage.VIRTUAL_NETWORK__RESOURCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResources(VirtualNetworkResource newResources) {
		eDynamicSet(NetworkingPackage.VIRTUAL_NETWORK__RESOURCES, NetworkingPackage.Literals.VIRTUAL_NETWORK__RESOURCES, newResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				VirtualNetworkResource resources = basicGetResources();
				if (resources != null)
					msgs = ((InternalEObject)resources).eInverseRemove(this, NetworkingPackage.VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK, VirtualNetworkResource.class, msgs);
				return basicSetResources((VirtualNetworkResource)otherEnd, msgs);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return ((InternalEList<?>)getSubnets()).basicRemove(otherEnd, msgs);
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				return basicSetResources(null, msgs);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return getSubnets();
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				if (resolve) return getResources();
				return basicGetResources();
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				getSubnets().clear();
				getSubnets().addAll((Collection<? extends Subnet>)newValue);
				return;
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				setResources((VirtualNetworkResource)newValue);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				getSubnets().clear();
				return;
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				setResources((VirtualNetworkResource)null);
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
			case NetworkingPackage.VIRTUAL_NETWORK__SUBNETS:
				return !getSubnets().isEmpty();
			case NetworkingPackage.VIRTUAL_NETWORK__RESOURCES:
				return basicGetResources() != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualNetworkImpl
