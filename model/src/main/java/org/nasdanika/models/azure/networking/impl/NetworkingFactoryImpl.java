/**
 */
package org.nasdanika.models.azure.networking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.azure.networking.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkingFactoryImpl extends EFactoryImpl implements NetworkingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NetworkingFactory init() {
		try {
			NetworkingFactory theNetworkingFactory = (NetworkingFactory)EPackage.Registry.INSTANCE.getEFactory(NetworkingPackage.eNS_URI);
			if (theNetworkingFactory != null) {
				return theNetworkingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NetworkingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NetworkingPackage.VIRTUAL_NETWORK: return createVirtualNetwork();
			case NetworkingPackage.SUBNET: return createSubnet();
			case NetworkingPackage.NETWORK_INTERFACE: return createNetworkInterface();
			case NetworkingPackage.SERVICE: return createService();
			case NetworkingPackage.SERVICE_ENDPOINT: return createServiceEndpoint();
			case NetworkingPackage.PRIVATE_ENPOINT: return createPrivateEnpoint();
			case NetworkingPackage.PUBLIC_ENDPOINT: return createPublicEndpoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualNetwork createVirtualNetwork() {
		VirtualNetworkImpl virtualNetwork = new VirtualNetworkImpl();
		return virtualNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface createNetworkInterface() {
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceEndpoint createServiceEndpoint() {
		ServiceEndpointImpl serviceEndpoint = new ServiceEndpointImpl();
		return serviceEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateEnpoint createPrivateEnpoint() {
		PrivateEnpointImpl privateEnpoint = new PrivateEnpointImpl();
		return privateEnpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicEndpoint createPublicEndpoint() {
		PublicEndpointImpl publicEndpoint = new PublicEndpointImpl();
		return publicEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkingPackage getNetworkingPackage() {
		return (NetworkingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NetworkingPackage getPackage() {
		return NetworkingPackage.eINSTANCE;
	}

} //NetworkingFactoryImpl
