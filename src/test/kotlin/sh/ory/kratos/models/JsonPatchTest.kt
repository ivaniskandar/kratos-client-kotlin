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

package sh.ory.kratos.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.kratos.models.JsonPatch

class JsonPatchTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of JsonPatch
        //val modelInstance = JsonPatch()

        // to test the property `op` - The operation to be performed. One of \"add\", \"remove\", \"replace\", \"move\", \"copy\", or \"test\".
        should("test op") {
            // uncomment below to test the property
            //modelInstance.op shouldBe ("TODO")
        }

        // to test the property `path` - The path to the target path. Uses JSON pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
        should("test path") {
            // uncomment below to test the property
            //modelInstance.path shouldBe ("TODO")
        }

        // to test the property `from` - This field is used together with operation \"move\" and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
        should("test from") {
            // uncomment below to test the property
            //modelInstance.from shouldBe ("TODO")
        }

        // to test the property ``value`` - The value to be used within the operations.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
        should("test `value`") {
            // uncomment below to test the property
            //modelInstance.`value` shouldBe ("TODO")
        }

    }
}
