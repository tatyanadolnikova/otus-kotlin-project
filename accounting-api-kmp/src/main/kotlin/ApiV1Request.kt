package ru.otus.otuskotlin.accounting.api.v1

import ru.otus.otuskotlin.accounting.v1.model.IRequest

fun apiV1RequestSerialize(request: IRequest): String = jacksonMapper.writeValueAsString(request)

fun <T : IRequest> apiV1RequestDeserialize(json: String): T =
    jacksonMapper.readValue(json, IRequest::class.java) as T
