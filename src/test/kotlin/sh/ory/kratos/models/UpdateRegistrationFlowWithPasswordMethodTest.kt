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

import sh.ory.kratos.models.UpdateRegistrationFlowWithPasswordMethod

class UpdateRegistrationFlowWithPasswordMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateRegistrationFlowWithPasswordMethod
        //val modelInstance = UpdateRegistrationFlowWithPasswordMethod()

        // to test the property `method` - Method to use  This field must be set to `password` when using the password method.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `password` - Password to sign the user up with
        should("test password") {
            // uncomment below to test the property
            //modelInstance.password shouldBe ("TODO")
        }

        // to test the property `traits` - The identity's traits
        should("test traits") {
            // uncomment below to test the property
            //modelInstance.traits shouldBe ("TODO")
        }

        // to test the property `csrfToken` - The CSRF Token
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