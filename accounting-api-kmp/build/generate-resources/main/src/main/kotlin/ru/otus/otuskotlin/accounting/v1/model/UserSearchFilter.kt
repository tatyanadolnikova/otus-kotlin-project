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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Набор фильтров для поиска юзера
 *
 * @param firstName 
 * @param middleName 
 * @param lastName 
 * @param phoneNumber 
 * @param roleId 
 */

data class UserSearchFilter (

    @field:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @field:JsonProperty("middleName")
    val middleName: kotlin.String? = null,

    @field:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @field:JsonProperty("phoneNumber")
    val phoneNumber: kotlin.String? = null,

    @field:JsonProperty("roleId")
    val roleId: kotlin.String? = null

)

