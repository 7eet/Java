module service.implOne {
	requires service.api;
	provides service.api.MyServiceInterface with service.implOne.One;
}
