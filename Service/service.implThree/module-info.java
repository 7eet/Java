module service.implThree {
	requires service.api;
	provides service.api.MyServiceInterface with service.implThree.Three;
}
