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

import sh.ory.kratos.models.SuccessfulNativeRegistration
import sh.ory.kratos.models.ContinueWith
import sh.ory.kratos.models.Identity
import sh.ory.kratos.models.Session

class SuccessfulNativeRegistrationTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SuccessfulNativeRegistration
        //val modelInstance = SuccessfulNativeRegistration()

        // to test the property `identity`
        should("test identity") {
            // uncomment below to test the property
            //modelInstance.identity shouldBe ("TODO")
        }

        // to test the property `continueWith` - Contains a list of actions, that could follow this flow  It can, for example, this will contain a reference to the verification flow, created as part of the user's registration or the token of the session.
        should("test continueWith") {
            // uncomment below to test the property
            //modelInstance.continueWith shouldBe ("TODO")
        }

        // to test the property `session`
        should("test session") {
            // uncomment below to test the property
            //modelInstance.session shouldBe ("TODO")
        }

        // to test the property `sessionToken` - The Session Token  This field is only set when the session hook is configured as a post-registration hook.  A session token is equivalent to a session cookie, but it can be sent in the HTTP Authorization Header:  Authorization: bearer ${session-token}  The session token is only issued for API flows, not for Browser flows!
        should("test sessionToken") {
            // uncomment below to test the property
            //modelInstance.sessionToken shouldBe ("TODO")
        }

    }
}
