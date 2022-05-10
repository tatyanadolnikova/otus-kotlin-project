package model

import java.time.LocalDate

data class User(
    var id: UserId = UserId.NONE,
    var firstName: String = "",
    var middleName: String = "",
    var lastName: String = "",
    val birthDate: LocalDate = LocalDate.now(),
    var email: String = "",
    var phoneNumber: String = "",
    var accounts: List<AccountId> = emptyList(),
    var roleId: RoleId = RoleId.NONE,
) : ContextRequest, ContextResponse
