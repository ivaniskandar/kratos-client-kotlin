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

import sh.ory.kratos.models.UpdateSettingsFlowWithWebAuthnMethod

class UpdateSettingsFlowWithWebAuthnMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateSettingsFlowWithWebAuthnMethod
        //val modelInstance = UpdateSettingsFlowWithWebAuthnMethod()

        // to test the property `method` - Method  Should be set to \"webauthn\" when trying to add, update, or remove a webAuthn pairing.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `csrfToken` - CSRFToken is the anti-CSRF token
        should("test csrfToken") {
            // uncomment below to test the property
            //modelInstance.csrfToken shouldBe ("TODO")
        }

        // to test the property `transientPayload` - Transient data to pass along to any webhooks
        should("test transientPayload") {
            // uncomment below to test the property
            //modelInstance.transientPayload shouldBe ("TODO")
        }

        // to test the property `webauthnRegister` - Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
        should("test webauthnRegister") {
            // uncomment below to test the property
            //modelInstance.webauthnRegister shouldBe ("TODO")
        }

        // to test the property `webauthnRegisterDisplayname` - Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
        should("test webauthnRegisterDisplayname") {
            // uncomment below to test the property
            //modelInstance.webauthnRegisterDisplayname shouldBe ("TODO")
        }

        // to test the property `webauthnRemove` - Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
        should("test webauthnRemove") {
            // uncomment below to test the property
            //modelInstance.webauthnRemove shouldBe ("TODO")
        }

    }
}
