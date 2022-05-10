package model

data class AccountFilter(
    var accountId: AccountId = AccountId.NONE,
    var accountNumber: String = ""
) : ContextFilter
