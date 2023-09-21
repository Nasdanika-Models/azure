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
* Segments may further customize documentation to address their specifics, e.g. the legal landscape or segment level technology choices. For example, the central function may provide a choice of cloud databases or VM/container images, and a segment may standardize on a subset.
* Development teams may customize even further. For example, by providing documentation how to deploy components built using in-house developed technologies.

In the above scenario specializations the right of the enterprise continuum may contribute to more generic documentation to the left of the continuum. 
For example, a segment may create a better way of doing things and the central function may adopt it for other segments to reuse. 
Another variant - a segment may pilot a new way of doing things and then contribute refinements to the central function. 
One way to do it is [fork/pull request](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests).

### Architecture repository

Use the metamodel to create a model populated with data retrieved from information systems - Azure, internal systems, ...
Create specialized subclasses where needed. E.g. there might be a subclass of Azure subscription with a bi-directional reference to some internal model element, e.g. a cost center. 
The loading process may read a tag or a mapping Excel spreadsheet to establish such a linkage. Once it is established, it can be used to traverse the model for analysis and reporting. 
There might be different reports/data formats delivered to multiple stakeholders using multiple delivery vehicles. See [Architecture](https://github.com/Nasdanika-Models/architecture) and [TOGAF](https://github.com/Nasdanika-Models/togaf) models for additional details.
The Azure model may be used in conjunction with the above models. E.g. there might be a specialization of those models where Azure elements such as [Subscription](https://azure.models.nasdanika.org/references/eClassifiers/Subscription/index.html) and [Resource](https://azure.models.nasdanika.org/references/eClassifiers/Resource/index.html) extend [Solution Building Block](https://togaf.models.nasdanika.org/core/references/eClassifiers/SolutionBuidingBlock/index.html).


  