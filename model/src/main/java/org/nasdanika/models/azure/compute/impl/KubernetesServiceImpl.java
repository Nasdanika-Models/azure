/**
 */
package org.nasdanika.models.azure.compute.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.KubernetesService;

import org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kubernetes Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KubernetesServiceImpl extends VirtualNetworkResourceImpl implements KubernetesService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KubernetesServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComputePackage.Literals.KUBERNETES_SERVICE;
	}

} //KubernetesServiceImpl
