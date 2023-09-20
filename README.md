# Azure

[Microsof Azure](https://azure.microsoft.com/) Ecore model with core classes, networking, storage, and compute. 
Currently the model contains only the most important classes and is not well documented.

## Use Cases

### Learning Azure

The [metamodel documentation](https://azure.models.nasdanika.org/index.html) may complement other forms of learning:

* Home page would provide an overview possibly with [interactive diagrams](https://docs.nasdanika.org/architecture/cloud/azure/compute/model/package-summary.html)[^1]
* Left navigation provides an alphabetial visual (icons) hierarchical representation of Azure concepts. The tree is searchable and elements have tooltips with short definitions of model elements.
* Generated [UML Diagram](http://azure.models.nasdanika.org/diagram.html) shows structure and relationships between elements. It may become very big for large models.
* Graphs might provide another visual representation of mdel elements and their relationships:
    * [Default graph](http://azure.models.nasdanika.org/default-graph.html) shows package elements and their relationships using force layout. Elements can rearranged by dragging. Elements have tooltips and double-click on an element navigates to the element page.
    * [Circular graph](http://azure.models.nasdanika.org/circular-layout-graph.html) has the same functionality, but uses circular layout.
    * [Force graph](http://azure.models.nasdanika.org/force-layout-graph.html) uses live force layout.
    * Graphs with dependencies - similar to the above graphs, but include dependencies from other packages and elements from sub-packages. Packages form categories and can be turned on and off - this is where the live force graph might be more convenient because it rearranges remaining nodes:
        * [Default graph](http://azure.models.nasdanika.org/default-graph-with-dependencies-and-subpackages.html)
        * [Circular graph](http://azure.models.nasdanika.org/circular-layout-graph-with-dependencies-and-subpackages.html)
        * [Force graph](http://azure.models.nasdanika.org/force-layout-graph-with-dependencies-and-subpackages.html)
* Element pages, e.g. [Virtual Machine](http://azure.models.nasdanika.org/references/eSubpackages/compute/references/eClassifiers/VirtualMachine/index.html) would provide an overview of an element, possibly with interactive diagrams. Ideally, they would literally quote the official documentation - need to get a permission from [Microsoft Learn](https://learn.microsoft.com/en-us/). They would also provide links to in-depth documentation on Microsoft Learn and other sites. Element pages also feature a [generated context diagram](http://azure.models.nasdanika.org/references/eSubpackages/compute/references/eClassifiers/VirtualMachine/diagram.html) and graphs, e.g. [default force graph](http://azure.models.nasdanika.org/references/eSubpackages/compute/references/eClassifiers/VirtualMachine/default-graph.html). Context diagrams and graphs are smaller than package diagrams/graphs and allow to focus on a particular concept.
* [Glossary](http://azure.models.nasdanika.org/glossary.html) provides an alphabetically ordered linear searchable representation of the model.

[^1]: Old diagram, broken icons. Diagram shapes have tooltips and are clickable.

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
