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

import sh.ory.kratos.models.ContinueWithSettingsUi
import sh.ory.kratos.models.ContinueWithSettingsUiFlow

class ContinueWithSettingsUiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ContinueWithSettingsUi
        //val modelInstance = ContinueWithSettingsUi()

        // to test the property `action` - Action will always be `show_settings_ui` show_settings_ui ContinueWithActionShowSettingsUIString
        should("test action") {
            // uncomment below to test the property
            //modelInstance.action shouldBe ("TODO")
        }

        // to test the property `flow`
        should("test flow") {
            // uncomment below to test the property
            //modelInstance.flow shouldBe ("TODO")
        }

    }
}
