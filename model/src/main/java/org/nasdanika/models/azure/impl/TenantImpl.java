/**
 */
package org.nasdanika.models.azure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.azure.AzurePackage;
import org.nasdanika.models.azure.ManagementGroup;
import org.nasdanika.models.azure.Tenant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.impl.TenantImpl#getManagementGroups <em>Management Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantImpl extends AzureElementImpl implements Tenant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzurePackage.Literals.TENANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ManagementGroup> getManagementGroups() {
		return (EList<ManagementGroup>)eDynamicGet(AzurePackage.TENANT__MANAGEMENT_GROUPS, AzurePackage.Literals.TENANT__MANAGEMENT_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzurePackage.TENANT__MANAGEMENT_GROUPS:
				return ((InternalEList<?>)getManagementGroups()).basicRemove(otherEnd, msgs);
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
			case AzurePackage.TENANT__MANAGEMENT_GROUPS:
				return getManagementGroups();
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
			case AzurePackage.TENANT__MANAGEMENT_GROUPS:
				getManagementGroups().clear();
				getManagementGroups().addAll((Collection<? extends ManagementGroup>)newValue);
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
			case AzurePackage.TENANT__MANAGEMENT_GROUPS:
				getManagementGroups().clear();
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
			case AzurePackage.TENANT__MANAGEMENT_GROUPS:
				return !getManagementGroups().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TenantImpl
