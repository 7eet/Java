module service.implTwo {
	requires service.api;
	provides service.api.MyServiceInterface with service.implTwo.Two;
}
