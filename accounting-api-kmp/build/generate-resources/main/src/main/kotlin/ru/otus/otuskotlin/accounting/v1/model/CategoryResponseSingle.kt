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

import ru.otus.otuskotlin.accounting.v1.model.CategoryResponseObject
import ru.otus.otuskotlin.accounting.v1.model.CategoryResponseSingleAllOf

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param category 
 */

data class CategoryResponseSingle (

    @field:JsonProperty("category")
    val category: CategoryResponseObject? = null

)

