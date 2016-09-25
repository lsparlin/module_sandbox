module service {
	exports com.service.output.api;

	provides com.service.output.api.OutputService
		with com.service.output.SystemPrintlnOutputService;
}
