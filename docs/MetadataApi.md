# MetadataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getVersion**](MetadataApi.md#getVersion) | **GET** /version | Return Running Software Version. |
| [**isAlive**](MetadataApi.md#isAlive) | **GET** /health/alive | Check HTTP Server Status |
| [**isReady**](MetadataApi.md#isReady) | **GET** /health/ready | Check HTTP Server and Database Status |


<a id="getVersion"></a>
# **getVersion**
> GetVersion200Response getVersion()

Return Running Software Version.

This endpoint returns the version of Ory Kratos.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the version will never refer to the cluster state, only to a single instance.

### Example
```kotlin
// Import classes:
//import sh.ory.kratos.infrastructure.*
//import sh.ory.kratos.models.*

val apiInstance = MetadataApi()
try {
    val result : GetVersion200Response = apiInstance.getVersion()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetadataApi#getVersion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetadataApi#getVersion")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVersion200Response**](GetVersion200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="isAlive"></a>
# **isAlive**
> IsAlive200Response isAlive()

Check HTTP Server Status

This endpoint returns a HTTP 200 status code when Ory Kratos is accepting incoming HTTP requests. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.

### Example
```kotlin
// Import classes:
//import sh.ory.kratos.infrastructure.*
//import sh.ory.kratos.models.*

val apiInstance = MetadataApi()
try {
    val result : IsAlive200Response = apiInstance.isAlive()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetadataApi#isAlive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetadataApi#isAlive")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IsAlive200Response**](IsAlive200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="isReady"></a>
# **isReady**
> IsAlive200Response isReady()

Check HTTP Server and Database Status

This endpoint returns a HTTP 200 status code when Ory Kratos is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of Ory Kratos, the health status will never refer to the cluster state, only to a single instance.

### Example
```kotlin
// Import classes:
//import sh.ory.kratos.infrastructure.*
//import sh.ory.kratos.models.*

val apiInstance = MetadataApi()
try {
    val result : IsAlive200Response = apiInstance.isReady()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetadataApi#isReady")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetadataApi#isReady")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IsAlive200Response**](IsAlive200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

