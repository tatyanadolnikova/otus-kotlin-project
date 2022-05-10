package model

data class Account(
    var id: AccountId = AccountId.NONE,
    var contractId: String = "",
    var ownerName: String = "",
    var accountNumber: String = "",
    val bic: String = "",
    var recipientBankId: BankId = BankId.NONE,
    var correspondentAccountNumber: String = "",
) : ContextRequest, ContextResponse

