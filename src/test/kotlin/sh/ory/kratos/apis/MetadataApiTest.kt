/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.kratos.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.kratos.apis.MetadataApi
import sh.ory.kratos.models.GetVersion200Response
import sh.ory.kratos.models.IsAlive200Response
import sh.ory.kratos.models.IsReady503Response

class MetadataApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MetadataApi
        //val apiInstance = MetadataApi()

        // to test getVersion
        should("test getVersion") {
            // uncomment below to test getVersion
            //val result : GetVersion200Response = apiInstance.getVersion()
            //result shouldBe ("TODO")
        }

        // to test isAlive
        should("test isAlive") {
            // uncomment below to test isAlive
            //val result : IsAlive200Response = apiInstance.isAlive()
            //result shouldBe ("TODO")
        }

        // to test isReady
        should("test isReady") {
            // uncomment below to test isReady
            //val result : IsAlive200Response = apiInstance.isReady()
            //result shouldBe ("TODO")
        }

    }
}
