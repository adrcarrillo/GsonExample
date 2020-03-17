module GsonExample {
//	exports com.arn.gsonexample;
	opens com.arn.gsonexample; // the package is opened, meaning all types and members (not only public ones!) therein are accessible at run time.
	requires com.google.gson;
}