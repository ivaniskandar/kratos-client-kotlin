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

import sh.ory.kratos.models.UpdateSettingsFlowWithLookupMethod

class UpdateSettingsFlowWithLookupMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateSettingsFlowWithLookupMethod
        //val modelInstance = UpdateSettingsFlowWithLookupMethod()

        // to test the property `method` - Method  Should be set to \"lookup\" when trying to add, update, or remove a lookup pairing.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `csrfToken` - CSRFToken is the anti-CSRF token
        should("test csrfToken") {
            // uncomment below to test the property
            //modelInstance.csrfToken shouldBe ("TODO")
        }

        // to test the property `lookupSecretConfirm` - If set to true will save the regenerated lookup secrets
        should("test lookupSecretConfirm") {
            // uncomment below to test the property
            //modelInstance.lookupSecretConfirm shouldBe ("TODO")
        }

        // to test the property `lookupSecretDisable` - Disables this method if true.
        should("test lookupSecretDisable") {
            // uncomment below to test the property
            //modelInstance.lookupSecretDisable shouldBe ("TODO")
        }

        // to test the property `lookupSecretRegenerate` - If set to true will regenerate the lookup secrets
        should("test lookupSecretRegenerate") {
            // uncomment below to test the property
            //modelInstance.lookupSecretRegenerate shouldBe ("TODO")
        }

        // to test the property `lookupSecretReveal` - If set to true will reveal the lookup secrets
        should("test lookupSecretReveal") {
            // uncomment below to test the property
            //modelInstance.lookupSecretReveal shouldBe ("TODO")
        }

        // to test the property `transientPayload` - Transient data to pass along to any webhooks
        should("test transientPayload") {
            // uncomment below to test the property
            //modelInstance.transientPayload shouldBe ("TODO")
        }

    }
}
