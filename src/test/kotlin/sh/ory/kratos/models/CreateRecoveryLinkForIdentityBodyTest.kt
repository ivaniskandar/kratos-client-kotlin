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

import sh.ory.kratos.models.CreateRecoveryLinkForIdentityBody

class CreateRecoveryLinkForIdentityBodyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CreateRecoveryLinkForIdentityBody
        //val modelInstance = CreateRecoveryLinkForIdentityBody()

        // to test the property `identityId` - Identity to Recover  The identity's ID you wish to recover.
        should("test identityId") {
            // uncomment below to test the property
            //modelInstance.identityId shouldBe ("TODO")
        }

        // to test the property `expiresIn` - Link Expires In  The recovery link will expire after that amount of time has passed. Defaults to the configuration value of `selfservice.methods.code.config.lifespan`.
        should("test expiresIn") {
            // uncomment below to test the property
            //modelInstance.expiresIn shouldBe ("TODO")
        }

    }
}