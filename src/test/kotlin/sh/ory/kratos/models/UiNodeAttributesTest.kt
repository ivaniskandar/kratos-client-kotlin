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

import sh.ory.kratos.models.UiNodeAttributes
import sh.ory.kratos.models.UiNodeAnchorAttributes
import sh.ory.kratos.models.UiNodeImageAttributes
import sh.ory.kratos.models.UiNodeInputAttributes
import sh.ory.kratos.models.UiNodeScriptAttributes
import sh.ory.kratos.models.UiNodeTextAttributes
import sh.ory.kratos.models.UiText

class UiNodeAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UiNodeAttributes
        //val modelInstance = UiNodeAttributes()

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

        // to test the property `nodeType` - NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\". text Text input Input img Image a Anchor script Script
        should("test nodeType") {
            // uncomment below to test the property
            //modelInstance.nodeType shouldBe ("TODO")
        }

        // to test the property `type` - The script MIME type
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `id` - A unique identifier
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `text`
        should("test text") {
            // uncomment below to test the property
            //modelInstance.text shouldBe ("TODO")
        }

        // to test the property `height` - Height of the image
        should("test height") {
            // uncomment below to test the property
            //modelInstance.height shouldBe ("TODO")
        }

        // to test the property `src` - The script source
        should("test src") {
            // uncomment below to test the property
            //modelInstance.src shouldBe ("TODO")
        }

        // to test the property `width` - Width of the image
        should("test width") {
            // uncomment below to test the property
            //modelInstance.width shouldBe ("TODO")
        }

        // to test the property `href` - The link's href (destination) URL.  format: uri
        should("test href") {
            // uncomment below to test the property
            //modelInstance.href shouldBe ("TODO")
        }

        // to test the property `title`
        should("test title") {
            // uncomment below to test the property
            //modelInstance.title shouldBe ("TODO")
        }

        // to test the property `async` - The script async type
        should("test async") {
            // uncomment below to test the property
            //modelInstance.async shouldBe ("TODO")
        }

        // to test the property `crossorigin` - The script cross origin policy
        should("test crossorigin") {
            // uncomment below to test the property
            //modelInstance.crossorigin shouldBe ("TODO")
        }

        // to test the property `integrity` - The script's integrity hash
        should("test integrity") {
            // uncomment below to test the property
            //modelInstance.integrity shouldBe ("TODO")
        }

        // to test the property `nonce` - Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!
        should("test nonce") {
            // uncomment below to test the property
            //modelInstance.nonce shouldBe ("TODO")
        }

        // to test the property `referrerpolicy` - The script referrer policy
        should("test referrerpolicy") {
            // uncomment below to test the property
            //modelInstance.referrerpolicy shouldBe ("TODO")
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
