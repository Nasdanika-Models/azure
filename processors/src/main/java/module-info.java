module org.nasdanika.models.azure.processors {
		
	requires transitive org.nasdanika.models.azure;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.azure.processors;
	opens org.nasdanika.models.azure.processors; // For loading resources
	
}
