package sampleGroovy
//@GrabConfig(systemClassLoader=true)
//@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.5.2' )
//@Grab(group='org.apache.httpcomponents',module='httpclient',version='4.3.4')
//@Grab(group='org.apache.httpcomponents',module='httpcore',version='4.4.4')
import org.apache.http.*
import groovyx.net.*
import groovyx.net.http.RESTClient
import groovyx.net.http.HttpResponseException

class RESTCall {
	public static void main(def args) throws groovyx.net.http.HttpResponseException  {
		//def client = new RESTClient( 'http://www.acme.com/' )
		//client.handler.failure = { resp -> resp.status }
		//def resp = client.get( path : 'products/3322' ) // ACME boomerang
		//def resp = client.get(path : '' ) // ACME boomerang
		def client = new RESTClient( 'http://www.google.com/' )
		client.handler.failure = { resp -> resp.status }
		def resp = client.get( path : '/search',query : [q:'Groovy'])
		println resp
		assert resp.status == 200  // HTTP response code; 404 means not found, etc.
		println resp.getData()
		//println resp.status
	}
}