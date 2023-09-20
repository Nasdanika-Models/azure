/**
 */
package org.nasdanika.models.azure.networking;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.azure.AzurePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.azure.networking.NetworkingFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/azure/networking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.azure.networking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkingPackage eINSTANCE = org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl <em>Virtual Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getVirtualNetwork()
	 * @generated
	 */
	int VIRTUAL_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__SUBNETS = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK__RESOURCES = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl <em>Virtual Network Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getVirtualNetworkResource()
	 * @generated
	 */
	int VIRTUAL_NETWORK_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Virtual Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Virtual Network Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NETWORK_RESOURCE_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.SubnetImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 2;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__RESOURCES = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.SubnetResourceImpl <em>Subnet Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.SubnetResourceImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getSubnetResource()
	 * @generated
	 */
	int SUBNET_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE__SUBNET = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnet Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subnet Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_RESOURCE_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.NetworkInterfaceImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__LOCATIONS = SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__RESOURCE_TAGS = SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__SUBNET = SUBNET_RESOURCE__SUBNET;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.ServiceImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOCATIONS = AzurePackage.RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOURCE_TAGS = AzurePackage.RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENDPOINTS = AzurePackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = AzurePackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = AzurePackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.ServiceEndpointImpl <em>Service Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.ServiceEndpointImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getServiceEndpoint()
	 * @generated
	 */
	int SERVICE_ENDPOINT = 6;

	/**
	 * The number of structural features of the '<em>Service Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENDPOINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Service Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ENDPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.PrivateEnpointImpl <em>Private Enpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.PrivateEnpointImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getPrivateEnpoint()
	 * @generated
	 */
	int PRIVATE_ENPOINT = 7;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__LOCATIONS = SUBNET_RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__RESOURCE_TAGS = SUBNET_RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT__SUBNET = SUBNET_RESOURCE__SUBNET;

	/**
	 * The number of structural features of the '<em>Private Enpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT_FEATURE_COUNT = SUBNET_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Enpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_ENPOINT_OPERATION_COUNT = SUBNET_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.networking.impl.PublicEndpointImpl <em>Public Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.networking.impl.PublicEndpointImpl
	 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getPublicEndpoint()
	 * @generated
	 */
	int PUBLIC_ENDPOINT = 8;

	/**
	 * The number of structural features of the '<em>Public Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT_FEATURE_COUNT = AzurePackage.AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_ENDPOINT_OPERATION_COUNT = AzurePackage.AZURE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.VirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network</em>'.
	 * @see org.nasdanika.models.azure.networking.VirtualNetwork
	 * @generated
	 */
	EClass getVirtualNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.networking.VirtualNetwork#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see org.nasdanika.models.azure.networking.VirtualNetwork#getSubnets()
	 * @see #getVirtualNetwork()
	 * @generated
	 */
	EReference getVirtualNetwork_Subnets();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.networking.VirtualNetwork#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resources</em>'.
	 * @see org.nasdanika.models.azure.networking.VirtualNetwork#getResources()
	 * @see #getVirtualNetwork()
	 * @generated
	 */
	EReference getVirtualNetwork_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.VirtualNetworkResource <em>Virtual Network Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Network Resource</em>'.
	 * @see org.nasdanika.models.azure.networking.VirtualNetworkResource
	 * @generated
	 */
	EClass getVirtualNetworkResource();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.networking.VirtualNetworkResource#getVirtualNetwork <em>Virtual Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Network</em>'.
	 * @see org.nasdanika.models.azure.networking.VirtualNetworkResource#getVirtualNetwork()
	 * @see #getVirtualNetworkResource()
	 * @generated
	 */
	EReference getVirtualNetworkResource_VirtualNetwork();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see org.nasdanika.models.azure.networking.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.azure.networking.Subnet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.azure.networking.Subnet#getResources()
	 * @see #getSubnet()
	 * @generated
	 */
	EReference getSubnet_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.SubnetResource <em>Subnet Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet Resource</em>'.
	 * @see org.nasdanika.models.azure.networking.SubnetResource
	 * @generated
	 */
	EClass getSubnetResource();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.azure.networking.SubnetResource#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnet</em>'.
	 * @see org.nasdanika.models.azure.networking.SubnetResource#getSubnet()
	 * @see #getSubnetResource()
	 * @generated
	 */
	EReference getSubnetResource_Subnet();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see org.nasdanika.models.azure.networking.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.nasdanika.models.azure.networking.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.networking.Service#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Endpoints</em>'.
	 * @see org.nasdanika.models.azure.networking.Service#getEndpoints()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Endpoints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.ServiceEndpoint <em>Service Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Endpoint</em>'.
	 * @see org.nasdanika.models.azure.networking.ServiceEndpoint
	 * @generated
	 */
	EClass getServiceEndpoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.PrivateEnpoint <em>Private Enpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Enpoint</em>'.
	 * @see org.nasdanika.models.azure.networking.PrivateEnpoint
	 * @generated
	 */
	EClass getPrivateEnpoint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.networking.PublicEndpoint <em>Public Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Endpoint</em>'.
	 * @see org.nasdanika.models.azure.networking.PublicEndpoint
	 * @generated
	 */
	EClass getPublicEndpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkingFactory getNetworkingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl <em>Virtual Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.VirtualNetworkImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getVirtualNetwork()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK = eINSTANCE.getVirtualNetwork();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK__SUBNETS = eINSTANCE.getVirtualNetwork_Subnets();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK__RESOURCES = eINSTANCE.getVirtualNetwork_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl <em>Virtual Network Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.VirtualNetworkResourceImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getVirtualNetworkResource()
		 * @generated
		 */
		EClass VIRTUAL_NETWORK_RESOURCE = eINSTANCE.getVirtualNetworkResource();

		/**
		 * The meta object literal for the '<em><b>Virtual Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK = eINSTANCE.getVirtualNetworkResource_VirtualNetwork();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.SubnetImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET__RESOURCES = eINSTANCE.getSubnet_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.SubnetResourceImpl <em>Subnet Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.SubnetResourceImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getSubnetResource()
		 * @generated
		 */
		EClass SUBNET_RESOURCE = eINSTANCE.getSubnetResource();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNET_RESOURCE__SUBNET = eINSTANCE.getSubnetResource_Subnet();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.NetworkInterfaceImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.ServiceImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENDPOINTS = eINSTANCE.getService_Endpoints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.ServiceEndpointImpl <em>Service Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.ServiceEndpointImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getServiceEndpoint()
		 * @generated
		 */
		EClass SERVICE_ENDPOINT = eINSTANCE.getServiceEndpoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.PrivateEnpointImpl <em>Private Enpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.PrivateEnpointImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getPrivateEnpoint()
		 * @generated
		 */
		EClass PRIVATE_ENPOINT = eINSTANCE.getPrivateEnpoint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.networking.impl.PublicEndpointImpl <em>Public Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.networking.impl.PublicEndpointImpl
		 * @see org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl#getPublicEndpoint()
		 * @generated
		 */
		EClass PUBLIC_ENDPOINT = eINSTANCE.getPublicEndpoint();

	}

} //NetworkingPackage
