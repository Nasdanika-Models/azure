# Azure

Ecore model, graph nodes, and processors for Azure - resource, subscription, resource group, ...

Models to be migrated from https://github.com/Nasdanika/architecture/tree/main/cloud/azure and reorganized into a single model with 
the core elements such as tenant, resource, subscription in the root package and specializations in sub-packages - compute, networking, storage.

In the long run the element may extend Solution Building BLock from the [Architecture](https://github.com/Nasdanika-Models/architecture)/[TOGAF](https://github.com/Nasdanika-Models/togaf) models.

Use cases:

* Develop architecture as code using the Azure model, generate documentation. The generated documentation pages will reference the Azure model documentation pages making it easier to understand the architecture model/documentation.
* Fork/clone and modify the model documentation and perhaps subclass model elements to reflect organization specifics. For example, the "generic" Azure documentation would explain that a new subscription can be created in the Azure portal etc. 
An organization-specific documentation may replace the generic documentation and explain that a new subscription shall be created by creating an [IaC](https://en.wikipedia.org/wiki/Infrastructure_as_code) pipeline in a source repository and then creating a pull request.
Org-specific documentation may suppress elements not used by the organization. E.g. if an organization doesn't use, say, [queue storage](https://azure.microsoft.com/en-us/products/storage/queues), then it will be suppressed in the org-specific model and wouldn't appear in the documentation.
Such a customized model/documentation will accelerate cloud adoption. It can be treated as a product with multiple releases. 
* Automatically populate the baseline architecture model by using Azure API's, cross-link Azure model elements with org-specific elements. Say, a management group with a cost center, and a subscription with a system/application it is associated with. 
Generate and publish documentation for different stakeholders. Define new architectures on top of the baseline archtiecture.


TODO - with introduction of container models - docker and kubernetes - AKS and other element may extend or reference them.
