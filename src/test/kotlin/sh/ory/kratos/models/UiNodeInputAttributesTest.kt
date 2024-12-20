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

import sh.ory.kratos.models.UiNodeInputAttributes
import sh.ory.kratos.models.UiText

class UiNodeInputAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UiNodeInputAttributes
        //val modelInstance = UiNodeInputAttributes()

        // to test the property `disabled` - Sets the input's disabled field to true or false.
        should("test disabled") {
            // uncomment below to test the property
            //modelInstance.disabled shouldBe ("TODO")
        }

        // to test the property `name` - The input's element name.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `nodeType` - NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"input\". text Text input Input img Image a Anchor script Script
        should("test nodeType") {
            // uncomment below to test the property
            //modelInstance.nodeType shouldBe ("TODO")
        }

        // to test the property `type` - The input's element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `autocomplete` - The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
        should("test autocomplete") {
            // uncomment below to test the property
            //modelInstance.autocomplete shouldBe ("TODO")
        }

        // to test the property `label`
        should("test label") {
            // uncomment below to test the property
            //modelInstance.label shouldBe ("TODO")
        }

        // to test the property `maxlength` - MaxLength may contain the input's maximum length.
        should("test maxlength") {
            // uncomment below to test the property
            //modelInstance.maxlength shouldBe ("TODO")
        }

        // to test the property `onclick` - OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.  Deprecated: Using OnClick requires the use of eval() which is a security risk. Use OnClickTrigger instead.
        should("test onclick") {
            // uncomment below to test the property
            //modelInstance.onclick shouldBe ("TODO")
        }

        // to test the property `onclickTrigger` - OnClickTrigger may contain a WebAuthn trigger which should be executed on click.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
        should("test onclickTrigger") {
            // uncomment below to test the property
            //modelInstance.onclickTrigger shouldBe ("TODO")
        }

        // to test the property `onload` - OnLoad may contain javascript which should be executed on load. This is primarily used for WebAuthn.  Deprecated: Using OnLoad requires the use of eval() which is a security risk. Use OnLoadTrigger instead.
        should("test onload") {
            // uncomment below to test the property
            //modelInstance.onload shouldBe ("TODO")
        }

        // to test the property `onloadTrigger` - OnLoadTrigger may contain a WebAuthn trigger which should be executed on load.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
        should("test onloadTrigger") {
            // uncomment below to test the property
            //modelInstance.onloadTrigger shouldBe ("TODO")
        }

        // to test the property `pattern` - The input's pattern.
        should("test pattern") {
            // uncomment below to test the property
            //modelInstance.pattern shouldBe ("TODO")
        }

        // to test the property `required` - Mark this input field as required.
        should("test required") {
            // uncomment below to test the property
            //modelInstance.required shouldBe ("TODO")
        }

        // to test the property ``value`` - The input's value.
        should("test `value`") {
            // uncomment below to test the property
            //modelInstance.`value` shouldBe ("TODO")
        }

    }
}