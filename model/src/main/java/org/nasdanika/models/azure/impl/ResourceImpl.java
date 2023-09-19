/**
 */
package org.nasdanika.models.azure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.azure.AzurePackage;
import org.nasdanika.models.azure.Location;
import org.nasdanika.models.azure.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.impl.ResourceImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link org.nasdanika.models.azure.impl.ResourceImpl#getResourceTags <em>Resource Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends AzureElementImpl implements Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzurePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Location> getLocations() {
		return (EList<Location>)eDynamicGet(AzurePackage.RESOURCE__LOCATIONS, AzurePackage.Literals.RESOURCE__LOCATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, EObject> getResourceTags() {
		return (EMap<String, EObject>)eDynamicGet(AzurePackage.RESOURCE__RESOURCE_TAGS, AzurePackage.Literals.RESOURCE__RESOURCE_TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzurePackage.RESOURCE__RESOURCE_TAGS:
				return ((InternalEList<?>)getResourceTags()).basicRemove(otherEnd, msgs);
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
			case AzurePackage.RESOURCE__LOCATIONS:
				return getLocations();
			case AzurePackage.RESOURCE__RESOURCE_TAGS:
				if (coreType) return getResourceTags();
				else return getResourceTags().map();
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
			case AzurePackage.RESOURCE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case AzurePackage.RESOURCE__RESOURCE_TAGS:
				((EStructuralFeature.Setting)getResourceTags()).set(newValue);
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
			case AzurePackage.RESOURCE__LOCATIONS:
				getLocations().clear();
				return;
			case AzurePackage.RESOURCE__RESOURCE_TAGS:
				getResourceTags().clear();
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
			case AzurePackage.RESOURCE__LOCATIONS:
				return !getLocations().isEmpty();
			case AzurePackage.RESOURCE__RESOURCE_TAGS:
				return !getResourceTags().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
