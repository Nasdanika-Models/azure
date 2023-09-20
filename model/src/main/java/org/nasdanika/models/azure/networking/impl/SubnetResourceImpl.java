/**
 */
package org.nasdanika.models.azure.networking.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.azure.impl.ResourceImpl;

import org.nasdanika.models.azure.networking.NetworkingPackage;
import org.nasdanika.models.azure.networking.Subnet;
import org.nasdanika.models.azure.networking.SubnetResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.networking.impl.SubnetResourceImpl#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubnetResourceImpl extends ResourceImpl implements SubnetResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkingPackage.Literals.SUBNET_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet getSubnet() {
		return (Subnet)eDynamicGet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet basicGetSubnet() {
		return (Subnet)eDynamicGet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubnet(Subnet newSubnet, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSubnet, NetworkingPackage.SUBNET_RESOURCE__SUBNET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnet(Subnet newSubnet) {
		eDynamicSet(NetworkingPackage.SUBNET_RESOURCE__SUBNET, NetworkingPackage.Literals.SUBNET_RESOURCE__SUBNET, newSubnet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				Subnet subnet = basicGetSubnet();
				if (subnet != null)
					msgs = ((InternalEObject)subnet).eInverseRemove(this, NetworkingPackage.SUBNET__RESOURCES, Subnet.class, msgs);
				return basicSetSubnet((Subnet)otherEnd, msgs);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				return basicSetSubnet(null, msgs);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				if (resolve) return getSubnet();
				return basicGetSubnet();
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				setSubnet((Subnet)newValue);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				setSubnet((Subnet)null);
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
			case NetworkingPackage.SUBNET_RESOURCE__SUBNET:
				return basicGetSubnet() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubnetResourceImpl
