package model

data class TransactionFilter(
    var transactionId: TransactionId = TransactionId.NONE
) : ContextFilter
