/**
 * Accounting
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ru.otus.otuskotlin.accounting.v1.model

import ru.otus.otuskotlin.accounting.v1.model.BaseRoleUpdateable
import ru.otus.otuskotlin.accounting.v1.model.UserResponseObjectAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param title 
 * @param permissions 
 * @param id 
 */

data class RoleResponseObject (

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null

)
