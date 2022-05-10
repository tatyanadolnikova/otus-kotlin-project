package mapper

import exception.UnknownRequestClass
import model.*
import model.TransactionType
import ru.otus.otuskotlin.accounting.v1.model.*
import utils.DATE_PATTERN
import utils.DATE_TIME_PATTERN
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun Context.fromTransport(request: IRequest) = when (request) {
    is AccountCreateRequest -> fromTransport(request)
    is AccountReadRequest -> fromTransport(request)
    is AccountUpdateRequest -> fromTransport(request)
    is AccountDeleteRequest -> fromTransport(request)

    is CategoryCreateRequest -> fromTransport(request)
    is CategoryReadRequest -> fromTransport(request)
    is CategoryUpdateRequest -> fromTransport(request)
    is CategoryDeleteRequest -> fromTransport(request)

    is RoleCreateRequest -> fromTransport(request)
    is RoleReadRequest -> fromTransport(request)
    is RoleUpdateRequest -> fromTransport(request)
    is RoleDeleteRequest -> fromTransport(request)

    is TransactionCreateRequest -> fromTransport(request)
    is TransactionReadRequest -> fromTransport(request)
    is TransactionUpdateRequest -> fromTransport(request)
    is TransactionDeleteRequest -> fromTransport(request)

    is UserCreateRequest -> fromTransport(request)
    is UserReadRequest -> fromTransport(request)
    is UserUpdateRequest -> fromTransport(request)
    is UserDeleteRequest -> fromTransport(request)
    is UserSearchRequest -> fromTransport(request)

    else -> throw UnknownRequestClass(request.javaClass)
}

fun Context.fromTransport(request: AccountCreateRequest) {
    command = Command.CREATE
    requestId = request.requestId()
    this.request = request.account?.toInternal() ?: Account()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: AccountReadRequest) {
    command = Command.READ
    requestId = request.requestId()
    this.request = request.role.toAccountWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: AccountUpdateRequest) {
    command = Command.UPDATE
    requestId = request.requestId()
    this.request = request.account?.toInternal() ?: Account()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: AccountDeleteRequest) {
    command = Command.DELETE
    requestId = request.requestId()
    this.request = request.role.toAccountWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: CategoryCreateRequest) {
    command = Command.CREATE
    requestId = request.requestId()
    this.request = request.category?.toInternal() ?: Category()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: CategoryReadRequest) {
    command = Command.READ
    requestId = request.requestId()
    this.request = request.role.toCategoryWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: CategoryUpdateRequest) {
    command = Command.UPDATE
    requestId = request.requestId()
    this.request = request.category?.toInternal() ?: Category()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: CategoryDeleteRequest) {
    command = Command.DELETE
    requestId = request.requestId()
    this.request = request.role.toCategoryWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: RoleCreateRequest) {
    command = Command.CREATE
    requestId = request.requestId()
    this.request = request.role?.toInternal() ?: Role()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: RoleReadRequest) {
    command = Command.READ
    requestId = request.requestId()
    this.request = request.role.toRoleWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: RoleUpdateRequest) {
    command = Command.UPDATE
    requestId = request.requestId()
    this.request = request.role?.toInternal() ?: Role()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: RoleDeleteRequest) {
    command = Command.DELETE
    requestId = request.requestId()
    this.request = request.role.toRoleWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: TransactionCreateRequest) {
    command = Command.CREATE
    requestId = request.requestId()
    this.request = request.transaction?.toInternal() ?: Transaction()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: TransactionReadRequest) {
    command = Command.READ
    requestId = request.requestId()
    this.request = request.role.toTransactionWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: TransactionUpdateRequest) {
    command = Command.UPDATE
    requestId = request.requestId()
    this.request = request.transaction?.toInternal() ?: Transaction()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: TransactionDeleteRequest) {
    command = Command.DELETE
    requestId = request.requestId()
    this.request = request.role.toTransactionWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: UserCreateRequest) {
    command = Command.CREATE
    requestId = request.requestId()
    this.request = request.user?.toInternal() ?: User()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: UserReadRequest) {
    command = Command.READ
    requestId = request.requestId()
    this.request = request.role.toUserWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: UserUpdateRequest) {
    command = Command.UPDATE
    requestId = request.requestId()
    this.request = request.user?.toInternal() ?: User()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: UserDeleteRequest) {
    command = Command.DELETE
    requestId = request.requestId()
    this.request = request.role.toUserWithId()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

fun Context.fromTransport(request: UserSearchRequest) {
    command = Command.SEARCH
    requestId = request.requestId()
    filter = request.userFilter.toInternal()
    workMode = request.debug.dtoToAppMode()
    stubCase = request.debug.dtoToStub()
}

private fun AccountCreateObject.toInternal(): Account = Account(
    contractId = this.contractId ?: "",
    accountNumber = this.accountNumber ?: "",
    bic = this.bic ?: "",
    correspondentAccountNumber = this.correspondentAccountNumber ?: "",
    ownerName = this.ownerName ?: "",
    recipientBankId = this.recipientBankId.toBankId()
)

private fun AccountUpdateObject.toInternal(): Account = Account(
    id = this.id.toAccountId(),
    contractId = this.contractId ?: "",
    accountNumber = this.accountNumber ?: "",
    bic = this.bic ?: "",
    correspondentAccountNumber = this.correspondentAccountNumber ?: "",
    ownerName = this.ownerName ?: "",
    recipientBankId = this.recipientBankId.toBankId()
)

private fun CategoryCreateObject.toInternal(): Category = Category(
    title = this.title ?: "",
    description = this.description ?: ""
)

private fun CategoryUpdateObject.toInternal(): Category = Category(
    id = this.id.toCategoryId(),
    title = this.title ?: "",
    description = this.description ?: ""
)

private fun RoleCreateObject.toInternal(): Role = Role(
    title = this.title ?: "",
    permissions = this.permissions?.map { permission -> enumValueOf(permission) } ?: emptyList()
)

private fun RoleUpdateObject.toInternal(): Role = Role(
    id = this.id.toRoleId(),
    title = this.title ?: "",
    permissions = this.permissions?.map { permission -> enumValueOf(permission) } ?: emptyList()
)

private fun TransactionCreateObject.toInternal(): Transaction = Transaction(
    dateTime = this.dateTime.toLocalDateTime(),
    categoryId = this.categoryType.toCategoryId(),
    accountIdFrom = this.accountIdFrom.toAccountId(),
    accountIdTo = this.accountIdTo.toAccountId(),
    amount = this.amount?.toLong() ?: 0,
    transactionType = this.transactionType?.let { type -> enumValueOf<TransactionType>(type) } ?: TransactionType.NONE
)

private fun TransactionUpdateObject.toInternal(): Transaction = Transaction(
    id = this.id.toTransactionId(),
    dateTime = this.dateTime.toLocalDateTime(),
    categoryId = this.categoryType.toCategoryId(),
    accountIdFrom = this.accountIdFrom.toAccountId(),
    accountIdTo = this.accountIdTo.toAccountId(),
    amount = this.amount?.toLong() ?: 0,
    transactionType = this.transactionType?.let { type -> enumValueOf<TransactionType>(type) } ?: TransactionType.NONE
)

private fun UserCreateObject.toInternal(): User = User(
    firstName = this.firstName ?: "",
    middleName = this.middleName ?: "",
    lastName = this.lastName ?: "",
    birthDate = this.birthDate.toLocalDate(),
    email = this.email ?: "",
    phoneNumber = this.phoneNumber ?: "",
    accounts = this.accounts?.map { account -> account.toAccountId() } ?: emptyList(),
    roleId = this.roleId.toRoleId()
)

private fun UserUpdateObject.toInternal(): User = User(
    id = this.id.toUserId(),
    firstName = this.firstName ?: "",
    middleName = this.middleName ?: "",
    lastName = this.lastName ?: "",
    birthDate = this.birthDate.toLocalDate(),
    email = this.email ?: "",
    phoneNumber = this.phoneNumber ?: "",
    accounts = this.accounts?.map { account -> account.toAccountId() } ?: emptyList(),
    roleId = this.roleId.toRoleId()
)

private fun UserSearchFilter?.toInternal(): UserFilter = UserFilter(
    firstName = this?.firstName ?: "",
    middleName = this?.middleName ?: "",
    lastName = this?.lastName ?: "",
    phoneNumber = this?.phoneNumber ?: "",
    roleId = this?.roleId.toRoleId()
)

private fun IRequest?.requestId() = this?.requestId?.let { RequestId(it) } ?: RequestId.NONE

private fun String?.toAccountId() = this?.let { AccountId(it) } ?: AccountId.NONE
private fun String?.toCategoryId() = this?.let { CategoryId(it) } ?: CategoryId.NONE
private fun String?.toRoleId() = this?.let { RoleId(it) } ?: RoleId.NONE
private fun String?.toTransactionId() = this?.let { TransactionId(it) } ?: TransactionId.NONE
private fun String?.toUserId() = this?.let { UserId(it) } ?: UserId.NONE
private fun String?.toBankId() = this?.let { BankId(it) } ?: BankId.NONE
private fun String?.toLocalDateTime() = this?.let { LocalDateTime.parse(it, DATE_TIME_PATTERN) } ?: LocalDateTime.now()
private fun String?.toLocalDate() = this?.let { LocalDate.parse(it, DATE_PATTERN) } ?: LocalDate.now()

private fun BaseIdRequestRole?.toAccountWithId() = Account(id = this?.id.toAccountId())
private fun BaseIdRequestRole?.toCategoryWithId() = Category(id = this?.id.toCategoryId())
private fun BaseIdRequestRole?.toRoleWithId() = Role(id = this?.id.toRoleId())
private fun BaseIdRequestRole?.toTransactionWithId() = Transaction(id = this?.id.toTransactionId())
private fun BaseIdRequestRole?.toUserWithId() = User(id = this?.id.toUserId())

private fun Debug?.dtoToAppMode(): AppMode = when (this?.mode) {
    RequestDebugMode.PROD -> AppMode.PROD
    RequestDebugMode.TEST -> AppMode.TEST
    RequestDebugMode.STUB -> AppMode.STUB
    null -> AppMode.PROD
}

private fun Debug?.dtoToStub(): Stub = when (this?.stub) {
    RequestDebugStub.SUCCESS -> Stub.SUCCESS
    RequestDebugStub.NOT_FOUND -> Stub.NOT_FOUND
    RequestDebugStub.BAD_ID -> Stub.BAD_ID
    RequestDebugStub.BAD_TITLE -> Stub.BAD_TITLE
    RequestDebugStub.BAD_DESCRIPTION -> Stub.BAD_DESCRIPTION
    RequestDebugStub.BAD_VISIBILITY -> Stub.BAD_VISIBILITY
    RequestDebugStub.CANNOT_DELETE -> Stub.CANNOT_DELETE
    RequestDebugStub.BAD_SEARCH_STRING -> Stub.BAD_SEARCH_STRING
    null -> Stub.NONE
}
