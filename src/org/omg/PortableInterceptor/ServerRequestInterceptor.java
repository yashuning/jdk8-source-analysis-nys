package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ServerRequestInterceptor.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u161/10277/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Tuesday, December 19, 2017 4:24:00 PM PST
*/


/**
   * Server-side request interceptor.
   * <p>
   * A request Interceptor is designed to intercept the flow of a 
   * request/reply sequence through the ORB at specific points so that 
   * services can query the request information and manipulate the service 
   * contexts which are propagated between clients and servers. The primary 
   * use of request Interceptors is to enable ORB services to transfer 
   * context information between clients and servers. There are two types 
   * of request Interceptors: client-side and server-side. 
   * <p>
   * To write a server-side Interceptor, implement the 
   * ServerRequestInterceptor interface.
   *
   * @see ServerRequestInfo
   */
public interface ServerRequestInterceptor extends ServerRequestInterceptorOperations, org.omg.PortableInterceptor.Interceptor, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServerRequestInterceptor
