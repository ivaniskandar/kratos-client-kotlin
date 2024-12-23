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

import sh.ory.kratos.models.UpdateRegistrationFlowWithCodeMethod

class UpdateRegistrationFlowWithCodeMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateRegistrationFlowWithCodeMethod
        //val modelInstance = UpdateRegistrationFlowWithCodeMethod()

        // to test the property `method` - Method to use  This field must be set to `code` when using the code method.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `traits` - The identity's traits
        should("test traits") {
            // uncomment below to test the property
            //modelInstance.traits shouldBe ("TODO")
        }

        // to test the property `code` - The OTP Code sent to the user
        should("test code") {
            // uncomment below to test the property
            //modelInstance.code shouldBe ("TODO")
        }

        // to test the property `csrfToken` - The CSRF Token
        should("test csrfToken") {
            // uncomment below to test the property
            //modelInstance.csrfToken shouldBe ("TODO")
        }

        // to test the property `resend` - Resend restarts the flow with a new code
        should("test resend") {
            // uncomment below to test the property
            //modelInstance.resend shouldBe ("TODO")
        }

        // to test the property `transientPayload` - Transient data to pass along to any webhooks
        should("test transientPayload") {
            // uncomment below to test the property
            //modelInstance.transientPayload shouldBe ("TODO")
        }

    }
}
