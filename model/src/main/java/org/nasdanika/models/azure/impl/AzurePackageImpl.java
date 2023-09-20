/**
 */
package org.nasdanika.models.azure.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.azure.AvailabilityZone;
import org.nasdanika.models.azure.AzureElement;
import org.nasdanika.models.azure.AzureFactory;
import org.nasdanika.models.azure.AzurePackage;
import org.nasdanika.models.azure.GenericResource;
import org.nasdanika.models.azure.Location;
import org.nasdanika.models.azure.ManagementGroup;
import org.nasdanika.models.azure.ManagementGroupElement;
import org.nasdanika.models.azure.Region;
import org.nasdanika.models.azure.RegionPair;
import org.nasdanika.models.azure.Resource;
import org.nasdanika.models.azure.ResourceGroup;
import org.nasdanika.models.azure.Subscription;
import org.nasdanika.models.azure.Tenant;
import org.nasdanika.models.azure.Workload;
import org.nasdanika.models.azure.compute.ComputePackage;
import org.nasdanika.models.azure.compute.impl.ComputePackageImpl;
import org.nasdanika.models.azure.networking.NetworkingPackage;
import org.nasdanika.models.azure.networking.impl.NetworkingPackageImpl;
import org.nasdanika.models.azure.storage.StoragePackage;
import org.nasdanika.models.azure.storage.impl.StoragePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzurePackageImpl extends EPackageImpl implements AzurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass azureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tenantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementGroupElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

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
	 * @see org.nasdanika.models.azure.AzurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AzurePackageImpl() {
		super(eNS_URI, AzureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AzurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AzurePackage init() {
		if (isInited) return (AzurePackage)EPackage.Registry.INSTANCE.getEPackage(AzurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAzurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AzurePackageImpl theAzurePackage = registeredAzurePackage instanceof AzurePackageImpl ? (AzurePackageImpl)registeredAzurePackage : new AzurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		NetworkingPackageImpl theNetworkingPackage = (NetworkingPackageImpl)(registeredPackage instanceof NetworkingPackageImpl ? registeredPackage : NetworkingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		ComputePackageImpl theComputePackage = (ComputePackageImpl)(registeredPackage instanceof ComputePackageImpl ? registeredPackage : ComputePackage.eINSTANCE);

		// Create package meta-data objects
		theAzurePackage.createPackageContents();
		theNetworkingPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		theComputePackage.createPackageContents();

		// Initialize created meta-data
		theAzurePackage.initializePackageContents();
		theNetworkingPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		theComputePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAzurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AzurePackage.eNS_URI, theAzurePackage);
		return theAzurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAzureElement() {
		return azureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTenant() {
		return tenantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTenant_ManagementGroups() {
		return (EReference)tenantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagementGroupElement() {
		return managementGroupElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManagementGroup() {
		return managementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManagementGroup_Elements() {
		return (EReference)managementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubscription_ResourceGroups() {
		return (EReference)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceGroup() {
		return resourceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceGroup_Resources() {
		return (EReference)resourceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Locations() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_ResourceTags() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericResource() {
		return genericResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenericResource_Kind() {
		return (EAttribute)genericResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegion_AvailabilityZones() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvailabilityZone() {
		return availabilityZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionPair() {
		return regionPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkload() {
		return workloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Key() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTag_Value() {
		return (EReference)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AzureFactory getAzureFactory() {
		return (AzureFactory)getEFactoryInstance();
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
		azureElementEClass = createEClass(AZURE_ELEMENT);

		tenantEClass = createEClass(TENANT);
		createEReference(tenantEClass, TENANT__MANAGEMENT_GROUPS);

		managementGroupElementEClass = createEClass(MANAGEMENT_GROUP_ELEMENT);

		managementGroupEClass = createEClass(MANAGEMENT_GROUP);
		createEReference(managementGroupEClass, MANAGEMENT_GROUP__ELEMENTS);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEReference(subscriptionEClass, SUBSCRIPTION__RESOURCE_GROUPS);

		resourceGroupEClass = createEClass(RESOURCE_GROUP);
		createEReference(resourceGroupEClass, RESOURCE_GROUP__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__LOCATIONS);
		createEReference(resourceEClass, RESOURCE__RESOURCE_TAGS);

		genericResourceEClass = createEClass(GENERIC_RESOURCE);
		createEAttribute(genericResourceEClass, GENERIC_RESOURCE__KIND);

		locationEClass = createEClass(LOCATION);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__AVAILABILITY_ZONES);

		availabilityZoneEClass = createEClass(AVAILABILITY_ZONE);

		regionPairEClass = createEClass(REGION_PAIR);

		workloadEClass = createEClass(WORKLOAD);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__KEY);
		createEReference(tagEClass, TAG__VALUE);
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
		NetworkingPackage theNetworkingPackage = (NetworkingPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkingPackage.eNS_URI);
		StoragePackage theStoragePackage = (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		ComputePackage theComputePackage = (ComputePackage)EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNetworkingPackage);
		getESubpackages().add(theStoragePackage);
		getESubpackages().add(theComputePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tenantEClass.getESuperTypes().add(this.getAzureElement());
		managementGroupElementEClass.getESuperTypes().add(this.getAzureElement());
		managementGroupEClass.getESuperTypes().add(this.getManagementGroupElement());
		subscriptionEClass.getESuperTypes().add(this.getManagementGroupElement());
		resourceGroupEClass.getESuperTypes().add(this.getAzureElement());
		resourceEClass.getESuperTypes().add(this.getAzureElement());
		genericResourceEClass.getESuperTypes().add(this.getResource());
		locationEClass.getESuperTypes().add(this.getAzureElement());
		regionEClass.getESuperTypes().add(this.getLocation());
		availabilityZoneEClass.getESuperTypes().add(this.getLocation());
		regionPairEClass.getESuperTypes().add(this.getAzureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(azureElementEClass, AzureElement.class, "AzureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tenantEClass, Tenant.class, "Tenant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTenant_ManagementGroups(), this.getManagementGroup(), null, "managementGroups", null, 0, -1, Tenant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(managementGroupElementEClass, ManagementGroupElement.class, "ManagementGroupElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(managementGroupEClass, ManagementGroup.class, "ManagementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManagementGroup_Elements(), this.getManagementGroupElement(), null, "elements", null, 0, -1, ManagementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubscription_ResourceGroups(), this.getResourceGroup(), null, "resourceGroups", null, 0, -1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceGroupEClass, ResourceGroup.class, "ResourceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceGroup_Resources(), this.getResource(), null, "resources", null, 0, -1, ResourceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Locations(), this.getLocation(), null, "locations", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_ResourceTags(), this.getTag(), null, "resourceTags", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getResource_ResourceTags().getEKeys().add(this.getTag_Key());

		initEClass(genericResourceEClass, GenericResource.class, "GenericResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericResource_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, GenericResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_AvailabilityZones(), this.getAvailabilityZone(), null, "availabilityZones", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityZoneEClass, AvailabilityZone.class, "AvailabilityZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regionPairEClass, RegionPair.class, "RegionPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workloadEClass, Workload.class, "Workload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagEClass, Map.Entry.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
		  (azureElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for Azure architecture elements"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "A resource is an entity managed by Azure"
		   });
		addAnnotation
		  (getResource_Locations(),
		   source,
		   new String[] {
			   "documentation", "A resource can be associated with zero or more locations. E.g. a VM can be deployed to a region or a specific availability zone in a region. A kubernetes cluster can be deployed to several availability zones."
		   });
		addAnnotation
		  (genericResourceEClass,
		   source,
		   new String[] {
			   "documentation", "A resource which does not have a model class. Generic resources have \"kind\" (type)."
		   });
		addAnnotation
		  (locationEClass,
		   source,
		   new String[] {
			   "documentation", "A base class for Region and Availability Zone to associate with resource. Some resources may be deployed to multiple locations."
		   });
		addAnnotation
		  (workloadEClass,
		   source,
		   new String[] {
			   "documentation", "https://learn.microsoft.com/en-us/azure/cloud-adoption-framework/plan/workloads#what-is-a-workload"
		   });
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
		  (managementGroupEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10011-icon-service-Management-Groups.svg",
			   "label", "Management Group",
			   "documentation-reference", "doc/management-group.md",
			   "description", "Management groups are containers that help manage access, policy, and compliance across multiple subscriptions"
		   });
		addAnnotation
		  (subscriptionEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10002-icon-service-Subscriptions.svg",
			   "documentation-reference", "doc/subscription.md",
			   "description", "A logical container used to provision related resources"
		   });
		addAnnotation
		  (getSubscription_ResourceGroups(),
		   source,
		   new String[] {
			   "homogenous", "true"
		   });
		addAnnotation
		  (resourceGroupEClass,
		   source,
		   new String[] {
			   "icon", "https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/svg/Icons/general/10007-icon-service-Resource-Groups.svg",
			   "label", "Resource Group",
			   "documentation-reference", "doc/resource-group.md",
			   "description", "A container that holds related resources for an Azure solution"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "description", "An entity managed by Azure"
		   });
		addAnnotation
		  (genericResourceEClass,
		   source,
		   new String[] {
			   "label", "Generic Resource",
			   "description", "A resource which does not have a model class. Generic resources have \"kind\" (type)."
		   });
		addAnnotation
		  (regionEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/region.md",
			   "description", "A set of datacenters, deployed within a latency-defined perimeter and connected through a dedicated regional low-latency network"
		   });
		addAnnotation
		  (availabilityZoneEClass,
		   source,
		   new String[] {
			   "label", "Availability Zone",
			   "documentation-reference", "doc/availability-zone.md",
			   "description", "One or more physically and logically separated datacenters with their own independent power source, network, and cooling."
		   });
		addAnnotation
		  (tagEClass,
		   source,
		   new String[] {
			   "documentation-reference", "doc/property.md"
		   });
	}

} //AzurePackageImpl
