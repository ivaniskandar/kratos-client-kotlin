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

import sh.ory.kratos.models.MessageDispatch

class MessageDispatchTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of MessageDispatch
        //val modelInstance = MessageDispatch()

        // to test the property `createdAt` - CreatedAt is a helper struct field for gobuffalo.pop.
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `id` - The ID of this message dispatch
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `messageId` - The ID of the message being dispatched
        should("test messageId") {
            // uncomment below to test the property
            //modelInstance.messageId shouldBe ("TODO")
        }

        // to test the property `status` - The status of this dispatch Either \"failed\" or \"success\" failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `updatedAt` - UpdatedAt is a helper struct field for gobuffalo.pop.
        should("test updatedAt") {
            // uncomment below to test the property
            //modelInstance.updatedAt shouldBe ("TODO")
        }

        // to test the property `error`
        should("test error") {
            // uncomment below to test the property
            //modelInstance.error shouldBe ("TODO")
        }

    }
}
