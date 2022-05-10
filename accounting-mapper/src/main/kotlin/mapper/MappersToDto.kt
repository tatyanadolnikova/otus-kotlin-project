package mapper

import exception.UnknownCommand
import model.*
import ru.otus.otuskotlin.accounting.v1.model.*
import utils.DATE_PATTERN
import utils.DATE_TIME_PATTERN

fun Context.toTransportAccount(): IResponse = when (val cmd = command) {
    Command.CREATE -> toTransportCreateAccount()
    Command.READ -> toTransportReadAccount()
    Command.UPDATE -> toTransportUpdateAccount()
    Command.DELETE -> toTransportDeleteAccount()
    else -> throw UnknownCommand(cmd)
}

fun Context.toTransportRole(): IResponse = when (val cmd = command) {
    Command.CREATE -> toTransportCreateRole()
    Command.READ -> toTransportReadRole()
    Command.UPDATE -> toTransportUpdateRole()
    Command.DELETE -> toTransportDeleteRole()
    else -> throw UnknownCommand(cmd)
}

fun Context.toTransportCategory(): IResponse = when (val cmd = command) {
    Command.CREATE -> toTransportCreateCategory()
    Command.READ -> toTransportReadCategory()
    Command.UPDATE -> toTransportUpdateCategory()
    Command.DELETE -> toTransportDeleteCategory()
    else -> throw UnknownCommand(cmd)
}

fun Context.toTransportTransaction(): IResponse = when (val cmd = command) {
    Command.CREATE -> toTransportCreateTransaction()
    Command.READ -> toTransportReadTransaction()
    Command.UPDATE -> toTransportUpdateTransaction()
    Command.DELETE -> toTransportDeleteTransaction()
    else -> throw UnknownCommand(cmd)
}

fun Context.toTransportUser(): IResponse = when (val cmd = command) {
    Command.CREATE -> toTransportCreateUser()
    Command.READ -> toTransportReadUser()
    Command.UPDATE -> toTransportUpdateUser()
    Command.DELETE -> toTransportDeleteUser()
    Command.SEARCH -> toTransportSearchUser()
    else -> throw UnknownCommand(cmd)
}

fun Context.toTransportCreateAccount() = AccountCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    account = response?.toAccountResponseObject()
)

fun Context.toTransportReadAccount() = AccountReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    account = response?.toAccountResponseObject()
)

fun Context.toTransportUpdateAccount() = AccountUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    account = response?.toAccountResponseObject()
)

fun Context.toTransportDeleteAccount() = AccountDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    account = response?.toAccountResponseObject()
)

fun Context.toTransportCreateRole() = RoleCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    role = response?.toRoleResponseObject()
)

fun Context.toTransportReadRole() = RoleReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    role = response?.toRoleResponseObject()
)

fun Context.toTransportUpdateRole() = RoleUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    role = response?.toRoleResponseObject()
)

fun Context.toTransportDeleteRole() = RoleDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    role = response?.toRoleResponseObject()
)

fun Context.toTransportCreateCategory() = CategoryCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    category = response?.toCategoryResponseObject()
)

fun Context.toTransportReadCategory() = CategoryReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    category = response?.toCategoryResponseObject()
)

fun Context.toTransportUpdateCategory() = CategoryUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    category = response?.toCategoryResponseObject()
)

fun Context.toTransportDeleteCategory() = CategoryDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    category = response?.toCategoryResponseObject()
)

fun Context.toTransportCreateTransaction() = TransactionCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = response?.toTransactionResponseObject()
)

fun Context.toTransportReadTransaction() = TransactionReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = response?.toTransactionResponseObject()
)

fun Context.toTransportUpdateTransaction() = TransactionUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = response?.toTransactionResponseObject()
)

fun Context.toTransportDeleteTransaction() = TransactionDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    transaction = response?.toTransactionResponseObject()
)

fun Context.toTransportCreateUser() = UserCreateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    user = response?.toUserResponseObject()
)

fun Context.toTransportReadUser() = UserReadResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    user = response?.toUserResponseObject()
)

fun Context.toTransportUpdateUser() = UserUpdateResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    user = response?.toUserResponseObject()
)

fun Context.toTransportDeleteUser() = UserDeleteResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    user = response?.toUserResponseObject()
)

fun Context.toTransportSearchUser() = UserSearchResponse(
    requestId = this.requestId.asString().takeIf { it.isNotBlank() },
    result = if (state == AppState.RUNNING) ResponseResult.SUCCESS else ResponseResult.ERROR,
    errors = errors.toTransportErrors(),
    users = responses.mapNotNull { response -> response?.toUserResponseObject() }
)

fun ContextResponse.toAccountResponseObject(): AccountResponseObject {
    val account: Account = this as Account
    return AccountResponseObject(
        id = account.id.asString(),
        contractId = account.contractId,
        accountNumber = account.accountNumber,
        bic = account.bic,
        correspondentAccountNumber = account.correspondentAccountNumber,
        ownerName = account.ownerName,
        recipientBankId = account.recipientBankId.asString()
    )
}

fun ContextResponse.toCategoryResponseObject(): CategoryResponseObject {
    val category: Category = this as Category
    return CategoryResponseObject(
        id = category.id.asString(),
        title = category.title,
        description = category.description
    )
}

fun ContextResponse.toRoleResponseObject(): RoleResponseObject {
    val role: Role = this as Role
    return RoleResponseObject(
        id = role.id.asString(),
        title = role.title,
        permissions = role.permissions.map { p -> p.name }
    )
}

fun ContextResponse.toTransactionResponseObject(): TransactionResponseObject {
    val transaction: Transaction = this as Transaction
    return TransactionResponseObject(
        id = transaction.id.asString(),
        dateTime = transaction.dateTime.format(DATE_TIME_PATTERN),
        categoryType = transaction.categoryId.asString(),
        accountIdFrom = transaction.accountIdFrom.asString(),
        accountIdTo = transaction.accountIdTo.asString(),
        amount = transaction.amount.toString(),
        transactionType = transaction.transactionType.name
    )
}

fun ContextResponse.toUserResponseObject(): UserResponseObject {
    val user: User = this as User
    return UserResponseObject(
        id = user.id.asString(),
        firstName = this.firstName,
        middleName = this.middleName,
        lastName = this.lastName,
        birthDate = this.birthDate.format(DATE_PATTERN),
        email = this.email,
        phoneNumber = this.phoneNumber,
        accounts = this.accounts.map { account -> account.asString() },
        roleId = this.roleId.asString()
    )
}

private fun List<ResponseError>.toTransportErrors(): List<Error>? = this
    .map { it.toTransportAccount() }
    .toList()
    .takeIf { it.isNotEmpty() }

private fun ResponseError.toTransportAccount() = Error(
    code = code.takeIf { it.isNotBlank() },
    group = group.takeIf { it.isNotBlank() },
    field = field.takeIf { it.isNotBlank() },
    message = message.takeIf { it.isNotBlank() },
)
