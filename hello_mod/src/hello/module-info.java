module hello {
	requires dep;
	requires service;

	requires guava;

	uses com.service.output.api.OutputService;
}
