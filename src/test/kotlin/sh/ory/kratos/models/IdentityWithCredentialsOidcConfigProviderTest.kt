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

import sh.ory.kratos.models.IdentityWithCredentialsOidcConfigProvider

class IdentityWithCredentialsOidcConfigProviderTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IdentityWithCredentialsOidcConfigProvider
        //val modelInstance = IdentityWithCredentialsOidcConfigProvider()

        // to test the property `provider` - The OpenID Connect provider to link the subject to. Usually something like `google` or `github`.
        should("test provider") {
            // uncomment below to test the property
            //modelInstance.provider shouldBe ("TODO")
        }

        // to test the property `subject` - The subject (`sub`) of the OpenID Connect connection. Usually the `sub` field of the ID Token.
        should("test subject") {
            // uncomment below to test the property
            //modelInstance.subject shouldBe ("TODO")
        }

    }
}
