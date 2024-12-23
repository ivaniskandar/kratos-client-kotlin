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

import sh.ory.kratos.models.Session
import sh.ory.kratos.models.AuthenticatorAssuranceLevel
import sh.ory.kratos.models.Identity
import sh.ory.kratos.models.SessionAuthenticationMethod
import sh.ory.kratos.models.SessionDevice

class SessionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Session
        //val modelInstance = Session()

        // to test the property `id` - Session ID
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `active` - Active state. If false the session is no longer active.
        should("test active") {
            // uncomment below to test the property
            //modelInstance.active shouldBe ("TODO")
        }

        // to test the property `authenticatedAt` - The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
        should("test authenticatedAt") {
            // uncomment below to test the property
            //modelInstance.authenticatedAt shouldBe ("TODO")
        }

        // to test the property `authenticationMethods` - A list of authenticators which were used to authenticate the session.
        should("test authenticationMethods") {
            // uncomment below to test the property
            //modelInstance.authenticationMethods shouldBe ("TODO")
        }

        // to test the property `authenticatorAssuranceLevel`
        should("test authenticatorAssuranceLevel") {
            // uncomment below to test the property
            //modelInstance.authenticatorAssuranceLevel shouldBe ("TODO")
        }

        // to test the property `devices` - Devices has history of all endpoints where the session was used
        should("test devices") {
            // uncomment below to test the property
            //modelInstance.devices shouldBe ("TODO")
        }

        // to test the property `expiresAt` - The Session Expiry  When this session expires at.
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `identity`
        should("test identity") {
            // uncomment below to test the property
            //modelInstance.identity shouldBe ("TODO")
        }

        // to test the property `issuedAt` - The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.
        should("test issuedAt") {
            // uncomment below to test the property
            //modelInstance.issuedAt shouldBe ("TODO")
        }

        // to test the property `tokenized` - Tokenized is the tokenized (e.g. JWT) version of the session.  It is only set when the `tokenize` query parameter was set to a valid tokenize template during calls to `/session/whoami`.
        should("test tokenized") {
            // uncomment below to test the property
            //modelInstance.tokenized shouldBe ("TODO")
        }

    }
}
