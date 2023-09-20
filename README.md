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

### Customized documentation

The metamodel documentation as explained above may accelerate learning of Azure concepts.
With a plethora of books, courses, and online references its value-add may not justify creation and maintenance of the metamodel.
However, unlike many other training/learning materials the metamodel can be customized similar to inheritance in object-oriented languages - a class can be sub-classed and its methods can be overridden.
As a mater of fact, this is exactly how it works under the hood - a documentation generation processor is subclassed and its methods are overridden to customize documentation. [Example](https://github.com/Nasdanika/ecore-gen-test/blob/main/processors/src/main/java/org/nasdanika/models/ecore/test/processors/FoxProcessorsFactory.java#L34).

This capability may be beneficial for organizations adopting Azure, especially large organizations with multiple groups taking care of different parts and adopting Azure at different pace.
In this case there would be multiple documentation customizations with multiple releases organized along the [Enterprise Continuum](https://pubs.opengroup.org/togaf-standard/architecture-content/chap06.html#tag_06) similar to how it is done with, say, Java releases.

Let's assume that there is an enterprise with a central cloud adoption organization "Cloud Services", segments, and multiple development organizations in each segment. 
In this case:

* The "Cloud Services" organization will take the metamodel and cusomize it by:
    * Hiding (suppressing) model elements which the organization is not going to use at a particular stage of adoption. For example, [queue storage](https://azure.microsoft.com/en-us/products/storage/queues) may be out of scope for the wave X of aoption.
    * Customizing documentation of the remaining elements. E.g. the generic documentation which explains how to create a subscription via the portal, API, SDK's etc. might be replaced with org-specific documentation which explains that a new subscription shall be created by creating an [IaC](https://en.wikipedia.org/wiki/Infrastructure_as_code) pipeline in a source repository and then creating a pull request. Or by submitting a request in the internal service management system.
    * Creating flavors of documentation for different technologies
* Segments may further customize documentation to address their specifics, e.g. the legal landscape or segment level technology choices. For example, the central function may provide a choice of cloud databases, and a segment may standardize on a subset.
* Development teams may customize even further. For example, by providing documentation how to deploy components built using in-house developed technologies.
    
...



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
