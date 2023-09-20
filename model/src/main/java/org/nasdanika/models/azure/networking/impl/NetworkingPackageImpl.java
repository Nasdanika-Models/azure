/**
 */
package org.nasdanika.models.azure.networking.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.azure.AzurePackage;

import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.impl.ComputePackageImpl;
import org.nasdanika.models.azure.impl.AzurePackageImpl;

import org.nasdanika.models.azure.networking.NetworkInterface;
import org.nasdanika.models.azure.networking.NetworkingFactory;
import org.nasdanika.models.azure.networking.NetworkingPackage;
import org.nasdanika.models.azure.networking.PrivateEnpoint;
import org.nasdanika.models.azure.networking.PublicEndpoint;
import org.nasdanika.models.azure.networking.Service;
import org.nasdanika.models.azure.networking.ServiceEndpoint;
import org.nasdanika.models.azure.networking.Subnet;
import org.nasdanika.models.azure.networking.SubnetResource;
import org.nasdanika.models.azure.networking.VirtualNetwork;
import org.nasdanika.models.azure.networking.VirtualNetworkResource;
import org.nasdanika.models.azure.storage.StoragePackage;
import org.nasdanika.models.azure.storage.impl.StoragePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkingPackageImpl extends EPackageImpl implements NetworkingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNetworkResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnetResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEnpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEndpointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.azure.networking.NetworkingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetworkingPackageImpl() {
		super(eNS_URI, NetworkingFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NetworkingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetworkingPackage init() {
		if (isInited) return (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetworkingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = registeredNetworkingPackage instanceof NetworkingPackageImpl ? (NetworkingPackageImpl)registeredNetworkingPackage : new NetworkingPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AzurePackage.eNS_URI);
		AzurePackageImpl theAzurePackage = (AzurePackageImpl)(registeredPackage instanceof AzurePackageImpl ? registeredPackage : AzurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		ComputePackageImpl theComputePackage = (ComputePackageImpl)(registeredPackage instanceof ComputePackageImpl ? registeredPackage : ComputePackage.eINSTANCE);

		// Create package meta-data objects
		theNetworkingPackage.createPackageContents();
		theAzurePackage.createPackageContents();
		theStoragePackage.createPackageContents();
		theComputePackage.createPackageContents();

		// Initialize created meta-data
		theNetworkingPackage.initializePackageContents();
		theAzurePackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		theComputePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetworkingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetworkingPackage.eNS_URI, theNetworkingPackage);
		return theNetworkingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualNetwork() {
		return virtualNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualNetwork_Subnets() {
		return (EReference)virtualNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualNetwork_Resources() {
		return (EReference)virtualNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVirtualNetworkResource() {
		return virtualNetworkResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVirtualNetworkResource_VirtualNetwork() {
		return (EReference)virtualNetworkResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnet() {
		return subnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubnet_Resources() {
		return (EReference)subnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubnetResource() {
		return subnetResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubnetResource_Subnet() {
		return (EReference)subnetResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterface() {
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Endpoints() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceEndpoint() {
		return serviceEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivateEnpoint() {
		return privateEnpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicEndpoint() {
		return publicEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkingFactory getNetworkingFactory() {
		return (NetworkingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		virtualNetworkEClass = createEClass(VIRTUAL_NETWORK);
		createEReference(virtualNetworkEClass, VIRTUAL_NETWORK__SUBNETS);
		createEReference(virtualNetworkEClass, VIRTUAL_NETWORK__RESOURCES);

		virtualNetworkResourceEClass = createEClass(VIRTUAL_NETWORK_RESOURCE);
		createEReference(virtualNetworkResourceEClass, VIRTUAL_NETWORK_RESOURCE__VIRTUAL_NETWORK);

		subnetEClass = createEClass(SUBNET);
		createEReference(subnetEClass, SUBNET__RESOURCES);

		subnetResourceEClass = createEClass(SUBNET_RESOURCE);
		createEReference(subnetResourceEClass, SUBNET_RESOURCE__SUBNET);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__ENDPOINTS);

		serviceEndpointEClass = createEClass(SERVICE_ENDPOINT);

		privateEnpointEClass = createEClass(PRIVATE_ENPOINT);

		publicEndpointEClass = createEClass(PUBLIC_ENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AzurePackage theAzurePackage = (AzurePackage)EPackage.Registry.INSTANCE.getEPackage(AzurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		virtualNetworkEClass.getESuperTypes().add(theAzurePackage.getResource());
		virtualNetworkResourceEClass.getESuperTypes().add(theAzurePackage.getResource());
		subnetEClass.getESuperTypes().add(theAzurePackage.getResource());
		subnetResourceEClass.getESuperTypes().add(theAzurePackage.getResource());
		networkInterfaceEClass.getESuperTypes().add(this.getSubnetResource());
		serviceEClass.getESuperTypes().add(theAzurePackage.getResource());
		privateEnpointEClass.getESuperTypes().add(this.getSubnetResource());
		privateEnpointEClass.getESuperTypes().add(this.getServiceEndpoint());
		publicEndpointEClass.getESuperTypes().add(theAzurePackage.getAzureElement());
		publicEndpointEClass.getESuperTypes().add(this.getServiceEndpoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualNetworkEClass, VirtualNetwork.class, "VirtualNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualNetwork_Subnets(), this.getSubnet(), null, "subnets", null, 0, -1, VirtualNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualNetwork_Resources(), this.getVirtualNetworkResource(), this.getVirtualNetworkResource_VirtualNetwork(), "resources", null, 0, 1, VirtualNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualNetworkResourceEClass, VirtualNetworkResource.class, "VirtualNetworkResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualNetworkResource_VirtualNetwork(), this.getVirtualNetwork(), this.getVirtualNetwork_Resources(), "virtualNetwork", null, 0, 1, VirtualNetworkResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetEClass, Subnet.class, "Subnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubnet_Resources(), this.getSubnetResource(), this.getSubnetResource_Subnet(), "resources", null, 0, -1, Subnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnetResourceEClass, SubnetResource.class, "SubnetResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubnetResource_Subnet(), this.getSubnet(), this.getSubnet_Resources(), "subnet", null, 0, 1, SubnetResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Endpoints(), this.getServiceEndpoint(), null, "endpoints", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEndpointEClass, ServiceEndpoint.class, "ServiceEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privateEnpointEClass, PrivateEnpoint.class, "PrivateEnpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicEndpointEClass, PublicEndpoint.class, "PublicEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (virtualNetworkEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/10061-icon-service-Virtual-Networks.svg",
			   "label", "Virtual Network"
		   });
		addAnnotation
		  (getVirtualNetworkResource_VirtualNetwork(),
		   source,
		   new String[] {
			   "opposite", "resources"
		   });
		addAnnotation
		  (subnetEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/02742-icon-service-Subnet.svg"
		   });
		addAnnotation
		  (networkInterfaceEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/networking/10080-icon-service-Network-Interfaces.svg"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getVirtualNetwork_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources connected to this Virtual Network. Computed opposite to VirtualNetworkResource.virtualNetwork"
		   });
		addAnnotation
		  (virtualNetworkResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for resources connected to a Virtual Network"
		   });
		addAnnotation
		  (getSubnet_Resources(),
		   source,
		   new String[] {
			   "documentation", "Resources connected to this subnet"
		   });
		addAnnotation
		  (subnetResourceEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for resources connected to a Subnet"
		   });
		addAnnotation
		  (privateEnpointEClass,
		   source,
		   new String[] {
			   "documentation", "https://learn.microsoft.com/en-us/azure/private-link/private-endpoint-overview"
		   });
	}

} //NetworkingPackageImpl
