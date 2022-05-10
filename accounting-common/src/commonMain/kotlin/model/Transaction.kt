package model

import java.time.LocalDateTime

data class Transaction(
    var id: TransactionId = TransactionId.NONE,
    val dateTime: LocalDateTime = LocalDateTime.now(),
    var categoryId: CategoryId = CategoryId.NONE,
    var accountIdFrom: AccountId = AccountId.NONE,
    var accountIdTo: AccountId = AccountId.NONE,
    var amount: Long = 0,
    var currency: Currency = Currency.default(),
    var transactionType: TransactionType = TransactionType.NONE,
) : ContextRequest, ContextResponse
