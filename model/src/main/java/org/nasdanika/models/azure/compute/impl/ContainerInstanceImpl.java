/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.ContainerInstance;

import org.nasdanika.models.azure.networking.impl.SubnetResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainerInstanceImpl extends SubnetResourceImpl implements ContainerInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.CONTAINER_INSTANCE;
	}

} //ContainerInstanceImpl
