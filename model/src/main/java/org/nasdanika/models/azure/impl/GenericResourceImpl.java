/**
 */
package org.nasdanika.models.azure.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.AzurePackage;
import org.nasdanika.models.azure.GenericResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.azure.impl.GenericResourceImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenericResourceImpl extends ResourceImpl implements GenericResource {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzurePackage.Literals.GENERIC_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return (String)eDynamicGet(AzurePackage.GENERIC_RESOURCE__KIND, AzurePackage.Literals.GENERIC_RESOURCE__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		eDynamicSet(AzurePackage.GENERIC_RESOURCE__KIND, AzurePackage.Literals.GENERIC_RESOURCE__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzurePackage.GENERIC_RESOURCE__KIND:
				return getKind();
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
			case AzurePackage.GENERIC_RESOURCE__KIND:
				setKind((String)newValue);
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
			case AzurePackage.GENERIC_RESOURCE__KIND:
				setKind(KIND_EDEFAULT);
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
			case AzurePackage.GENERIC_RESOURCE__KIND:
				return KIND_EDEFAULT == null ? getKind() != null : !KIND_EDEFAULT.equals(getKind());
		}
		return super.eIsSet(featureID);
	}

} //GenericResourceImpl
