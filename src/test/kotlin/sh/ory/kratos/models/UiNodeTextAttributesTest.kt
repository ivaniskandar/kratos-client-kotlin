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

import sh.ory.kratos.models.UiNodeTextAttributes
import sh.ory.kratos.models.UiText

class UiNodeTextAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UiNodeTextAttributes
        //val modelInstance = UiNodeTextAttributes()

        // to test the property `id` - A unique identifier
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `nodeType` - NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"text\". text Text input Input img Image a Anchor script Script
        should("test nodeType") {
            // uncomment below to test the property
            //modelInstance.nodeType shouldBe ("TODO")
        }

        // to test the property `text`
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

    }
}
