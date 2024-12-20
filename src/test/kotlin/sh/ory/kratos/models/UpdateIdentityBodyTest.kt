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

import sh.ory.kratos.models.UpdateIdentityBody
import sh.ory.kratos.models.IdentityWithCredentials

class UpdateIdentityBodyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateIdentityBody
        //val modelInstance = UpdateIdentityBody()

        // to test the property `schemaId` - SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.
        should("test schemaId") {
            // uncomment below to test the property
            //modelInstance.schemaId shouldBe ("TODO")
        }

        // to test the property `state` - State is the identity's state. active StateActive inactive StateInactive
        should("test state") {
            // uncomment below to test the property
            //modelInstance.state shouldBe ("TODO")
        }

        // to test the property `traits` - Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.
        should("test traits") {
            // uncomment below to test the property
            //modelInstance.traits shouldBe ("TODO")
        }

        // to test the property `credentials`
        should("test credentials") {
            // uncomment below to test the property
            //modelInstance.credentials shouldBe ("TODO")
        }

        // to test the property `metadataAdmin` - Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
        should("test metadataAdmin") {
            // uncomment below to test the property
            //modelInstance.metadataAdmin shouldBe ("TODO")
        }

        // to test the property `metadataPublic` - Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
        should("test metadataPublic") {
            // uncomment below to test the property
            //modelInstance.metadataPublic shouldBe ("TODO")
        }

    }
}