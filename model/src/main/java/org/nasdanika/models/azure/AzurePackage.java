/**
 */
package org.nasdanika.models.azure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nasdanika.models.azure.AzureFactory
 * @model kind="package"
 * @generated
 */
public interface AzurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "azure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/azure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.azure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AzurePackage eINSTANCE = org.nasdanika.models.azure.impl.AzurePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.AzureElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.AzureElementImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getAzureElement()
	 * @generated
	 */
	int AZURE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AZURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.ManagementGroupElementImpl <em>Management Group Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.ManagementGroupElementImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getManagementGroupElement()
	 * @generated
	 */
	int MANAGEMENT_GROUP_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Management Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_GROUP_ELEMENT_FEATURE_COUNT = AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Management Group Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_GROUP_ELEMENT_OPERATION_COUNT = AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.ManagementGroupImpl <em>Management Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.ManagementGroupImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getManagementGroup()
	 * @generated
	 */
	int MANAGEMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_GROUP__ELEMENTS = MANAGEMENT_GROUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Management Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_GROUP_FEATURE_COUNT = MANAGEMENT_GROUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Management Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_GROUP_OPERATION_COUNT = MANAGEMENT_GROUP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.SubscriptionImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__RESOURCE_GROUPS = MANAGEMENT_GROUP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = MANAGEMENT_GROUP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = MANAGEMENT_GROUP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.ResourceGroupImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__RESOURCES = AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_OPERATION_COUNT = AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.ResourceImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LOCATIONS = AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_TAGS = AZURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = AZURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.GenericResourceImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getGenericResource()
	 * @generated
	 */
	int GENERIC_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__LOCATIONS = RESOURCE__LOCATIONS;

	/**
	 * The feature id for the '<em><b>Resource Tags</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__RESOURCE_TAGS = RESOURCE__RESOURCE_TAGS;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE__KIND = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.LocationImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 7;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.RegionImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 8;

	/**
	 * The feature id for the '<em><b>Availability Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__AVAILABILITY_ZONES = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.AvailabilityZoneImpl <em>Availability Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.AvailabilityZoneImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getAvailabilityZone()
	 * @generated
	 */
	int AVAILABILITY_ZONE = 9;

	/**
	 * The number of structural features of the '<em>Availability Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_ZONE_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Availability Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_ZONE_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.RegionPairImpl <em>Region Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.RegionPairImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getRegionPair()
	 * @generated
	 */
	int REGION_PAIR = 10;

	/**
	 * The number of structural features of the '<em>Region Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PAIR_FEATURE_COUNT = AZURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Region Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PAIR_OPERATION_COUNT = AZURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.WorkloadImpl <em>Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.WorkloadImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getWorkload()
	 * @generated
	 */
	int WORKLOAD = 11;

	/**
	 * The number of structural features of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.azure.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.azure.impl.TagImpl
	 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.AzureElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.nasdanika.models.azure.AzureElement
	 * @generated
	 */
	EClass getAzureElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.ManagementGroupElement <em>Management Group Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Group Element</em>'.
	 * @see org.nasdanika.models.azure.ManagementGroupElement
	 * @generated
	 */
	EClass getManagementGroupElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.ManagementGroup <em>Management Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Group</em>'.
	 * @see org.nasdanika.models.azure.ManagementGroup
	 * @generated
	 */
	EClass getManagementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.ManagementGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.models.azure.ManagementGroup#getElements()
	 * @see #getManagementGroup()
	 * @generated
	 */
	EReference getManagementGroup_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see org.nasdanika.models.azure.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.Subscription#getResourceGroups <em>Resource Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Groups</em>'.
	 * @see org.nasdanika.models.azure.Subscription#getResourceGroups()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_ResourceGroups();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see org.nasdanika.models.azure.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.ResourceGroup#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.azure.ResourceGroup#getResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.azure.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.azure.Resource#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see org.nasdanika.models.azure.Resource#getLocations()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Locations();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.azure.Resource#getResourceTags <em>Resource Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Resource Tags</em>'.
	 * @see org.nasdanika.models.azure.Resource#getResourceTags()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceTags();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.GenericResource <em>Generic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Resource</em>'.
	 * @see org.nasdanika.models.azure.GenericResource
	 * @generated
	 */
	EClass getGenericResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.azure.GenericResource#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.azure.GenericResource#getKind()
	 * @see #getGenericResource()
	 * @generated
	 */
	EAttribute getGenericResource_Kind();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.nasdanika.models.azure.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see org.nasdanika.models.azure.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.azure.Region#getAvailabilityZones <em>Availability Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability Zones</em>'.
	 * @see org.nasdanika.models.azure.Region#getAvailabilityZones()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_AvailabilityZones();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.AvailabilityZone <em>Availability Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability Zone</em>'.
	 * @see org.nasdanika.models.azure.AvailabilityZone
	 * @generated
	 */
	EClass getAvailabilityZone();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.RegionPair <em>Region Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Pair</em>'.
	 * @see org.nasdanika.models.azure.RegionPair
	 * @generated
	 */
	EClass getRegionPair();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.azure.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload</em>'.
	 * @see org.nasdanika.models.azure.Workload
	 * @generated
	 */
	EClass getWorkload();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true" valueRequired="true"
	 *        annotation="urn:org.nasdanika documentation-reference='doc/property.md'"
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AzureFactory getAzureFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.AzureElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.AzureElementImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getAzureElement()
		 * @generated
		 */
		EClass AZURE_ELEMENT = eINSTANCE.getAzureElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.ManagementGroupElementImpl <em>Management Group Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.ManagementGroupElementImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getManagementGroupElement()
		 * @generated
		 */
		EClass MANAGEMENT_GROUP_ELEMENT = eINSTANCE.getManagementGroupElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.ManagementGroupImpl <em>Management Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.ManagementGroupImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getManagementGroup()
		 * @generated
		 */
		EClass MANAGEMENT_GROUP = eINSTANCE.getManagementGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_GROUP__ELEMENTS = eINSTANCE.getManagementGroup_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.SubscriptionImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Resource Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__RESOURCE_GROUPS = eINSTANCE.getSubscription_ResourceGroups();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.ResourceGroupImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__RESOURCES = eINSTANCE.getResourceGroup_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.ResourceImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__LOCATIONS = eINSTANCE.getResource_Locations();

		/**
		 * The meta object literal for the '<em><b>Resource Tags</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_TAGS = eINSTANCE.getResource_ResourceTags();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.GenericResourceImpl <em>Generic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.GenericResourceImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getGenericResource()
		 * @generated
		 */
		EClass GENERIC_RESOURCE = eINSTANCE.getGenericResource();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_RESOURCE__KIND = eINSTANCE.getGenericResource_Kind();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.LocationImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.RegionImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Availability Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__AVAILABILITY_ZONES = eINSTANCE.getRegion_AvailabilityZones();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.AvailabilityZoneImpl <em>Availability Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.AvailabilityZoneImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getAvailabilityZone()
		 * @generated
		 */
		EClass AVAILABILITY_ZONE = eINSTANCE.getAvailabilityZone();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.RegionPairImpl <em>Region Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.RegionPairImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getRegionPair()
		 * @generated
		 */
		EClass REGION_PAIR = eINSTANCE.getRegionPair();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.WorkloadImpl <em>Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.WorkloadImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getWorkload()
		 * @generated
		 */
		EClass WORKLOAD = eINSTANCE.getWorkload();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.azure.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.azure.impl.TagImpl
		 * @see org.nasdanika.models.azure.impl.AzurePackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__KEY = eINSTANCE.getTag_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__VALUE = eINSTANCE.getTag_Value();

	}

} //AzurePackage
