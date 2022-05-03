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

import ru.otus.otuskotlin.accounting.v1.model.BaseIdRequest
import ru.otus.otuskotlin.accounting.v1.model.BaseIdRequestRole
import ru.otus.otuskotlin.accounting.v1.model.Debug
import ru.otus.otuskotlin.accounting.v1.model.IRequest
import ru.otus.otuskotlin.accounting.v1.model.RequestDebug

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param requestType Поле-дескриминатор для вычисления типа запроса
 * @param requestId Идентификатор запроса для отладки
 * @param role 
 * @param debug 
 */

data class RoleReadRequest (

    /* Поле-дескриминатор для вычисления типа запроса */
    @field:JsonProperty("requestType")
    override val requestType: kotlin.String? = null,

    /* Идентификатор запроса для отладки */
    @field:JsonProperty("requestId")
    override val requestId: kotlin.String? = null,

    @field:JsonProperty("role")
    val role: BaseIdRequestRole? = null,

    @field:JsonProperty("debug")
    val debug: Debug? = null

) : IRequest

