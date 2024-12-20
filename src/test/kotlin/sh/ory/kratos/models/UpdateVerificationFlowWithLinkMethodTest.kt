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

import sh.ory.kratos.models.UpdateVerificationFlowWithLinkMethod

class UpdateVerificationFlowWithLinkMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateVerificationFlowWithLinkMethod
        //val modelInstance = UpdateVerificationFlowWithLinkMethod()

        // to test the property `email` - Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
        should("test email") {
            // uncomment below to test the property
            //modelInstance.email shouldBe ("TODO")
        }

        // to test the property `method` - Method is the method that should be used for this verification flow  Allowed values are `link` and `code` link VerificationStrategyLink code VerificationStrategyCode
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `csrfToken` - Sending the anti-csrf token is only required for browser login flows.
        should("test csrfToken") {
            // uncomment below to test the property
            //modelInstance.csrfToken shouldBe ("TODO")
        }

        // to test the property `transientPayload` - Transient data to pass along to any webhooks
        should("test transientPayload") {
            // uncomment below to test the property
            //modelInstance.transientPayload shouldBe ("TODO")
        }

    }
}
