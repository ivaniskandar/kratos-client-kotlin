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

import sh.ory.kratos.models.TokenPaginationHeaders

class TokenPaginationHeadersTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TokenPaginationHeaders
        //val modelInstance = TokenPaginationHeaders()

        // to test the property `link` - The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
        should("test link") {
            // uncomment below to test the property
            //modelInstance.link shouldBe ("TODO")
        }

        // to test the property `xTotalCount` - The total number of clients.  in: header
        should("test xTotalCount") {
            // uncomment below to test the property
            //modelInstance.xTotalCount shouldBe ("TODO")
        }

    }
}