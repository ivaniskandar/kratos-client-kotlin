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

import sh.ory.kratos.models.UpdateRecoveryFlowBody
import sh.ory.kratos.models.UpdateRecoveryFlowWithCodeMethod
import sh.ory.kratos.models.UpdateRecoveryFlowWithLinkMethod

class UpdateRecoveryFlowBodyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateRecoveryFlowBody
        //val modelInstance = UpdateRecoveryFlowBody()

        // to test the property `email` - The email address of the account to recover  If the email belongs to a valid account, a recovery email will be sent.  If you want to notify the email address if the account does not exist, see the [notify_unknown_recipients flag](https://www.ory.sh/docs/kratos/self-service/flows/account-recovery-password-reset#attempted-recovery-notifications)  If a code was already sent, including this field in the payload will invalidate the sent code and re-send a new code.  format: email
        should("test email") {
            // uncomment below to test the property
            //modelInstance.email shouldBe ("TODO")
        }

        // to test the property `method` - Method is the method that should be used for this recovery flow  Allowed values are `link` and `code`. link RecoveryStrategyLink code RecoveryStrategyCode
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

        // to test the property `code` - Code from the recovery email  If you want to submit a code, use this field, but make sure to _not_ include the email field, as well.
        should("test code") {
            // uncomment below to test the property
            //modelInstance.code shouldBe ("TODO")
        }

    }
}
