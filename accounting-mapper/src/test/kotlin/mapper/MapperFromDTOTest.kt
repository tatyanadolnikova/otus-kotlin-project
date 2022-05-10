package mapper

import model.*
import org.junit.Test
import ru.otus.otuskotlin.accounting.v1.model.*
import utils.DATE_PATTERN
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MapperFromDTOTest {

    @Test
    fun `fromTransport for UserCreateRequest`() {
        val req = UserCreateRequest(
            requestId = "1234",
            debug = Debug(
                mode = RequestDebugMode.STUB,
                stub = RequestDebugStub.SUCCESS,
            ),
            user = UserCreateObject(
                firstName = "Tatyana",
                middleName = "Sergeevna",
                lastName = "Dolnikova",
                birthDate = "1996-07-30",
                email = "test@test.com",
                phoneNumber = "79133739945",
                accounts = listOf("2", "34"),
                roleId = "12"
            ),
        )

        val context = Context()
        context.fromTransport(req)
        val request = context.request

        assertEquals(Command.CREATE, context.command)
        assertEquals(Stub.SUCCESS, context.stubCase)
        assertEquals(AppMode.STUB, context.workMode)
        assertTrue(request is User)
        assertEquals("", request.id.asString())
        assertEquals("Tatyana", request.firstName)
        assertEquals("Sergeevna", request.middleName)
        assertEquals("Dolnikova", request.lastName)
        assertEquals(LocalDate.parse("1996-07-30", DATE_PATTERN), request.birthDate)
        assertEquals("test@test.com", request.email)
        assertEquals("79133739945", request.phoneNumber)
        assertEquals(2, request.accounts.size)
        assertEquals("12", request.roleId.asString())
    }

    @Test
    fun `fromTransport for UserReadRequest`() {
        val req = UserReadRequest(
            requestId = "1234",
            debug = Debug(
                mode = RequestDebugMode.STUB,
                stub = RequestDebugStub.SUCCESS,
            ),
            role = BaseIdRequestRole(id = "3"),
        )

        val context = Context()
        context.fromTransport(req)
        val request = context.request

        assertEquals(Command.READ, context.command)
        assertEquals(Stub.SUCCESS, context.stubCase)
        assertEquals(AppMode.STUB, context.workMode)
        assertTrue(request is User)
        assertEquals("3", request.id.asString())
        assertEquals("", request.firstName)
        assertEquals("", request.middleName)
        assertEquals("", request.lastName)
        assertEquals("", request.email)
        assertEquals("", request.phoneNumber)
        assertEquals(0, request.accounts.size)
        assertEquals("", request.roleId.asString())
    }

    @Test
    fun `fromTransport for UserUpdateRequest`() {
        val req = UserUpdateRequest(
            requestId = "1234",
            debug = Debug(
                mode = RequestDebugMode.STUB,
                stub = RequestDebugStub.SUCCESS,
            ),
            user = UserUpdateObject(
                id = "3",
                firstName = "Tatyana",
                middleName = "Sergeevna",
                lastName = "Dolnikova",
                birthDate = "1996-07-30",
                email = "test@test.com",
                phoneNumber = "79133739945",
                accounts = listOf("2", "34"),
                roleId = "12"
            ),
        )

        val context = Context()
        context.fromTransport(req)
        val request = context.request

        assertEquals(Command.UPDATE, context.command)
        assertEquals(Stub.SUCCESS, context.stubCase)
        assertEquals(AppMode.STUB, context.workMode)
        assertTrue(request is User)
        assertEquals("3", request.id.asString())
        assertEquals("Tatyana", request.firstName)
        assertEquals("Sergeevna", request.middleName)
        assertEquals("Dolnikova", request.lastName)
        assertEquals(LocalDate.parse("1996-07-30", DATE_PATTERN), request.birthDate)
        assertEquals("test@test.com", request.email)
        assertEquals("79133739945", request.phoneNumber)
        assertEquals(2, request.accounts.size)
        assertEquals("12", request.roleId.asString())
    }

    @Test
    fun `fromTransport for UserDeleteRequest`() {
        val req = UserDeleteRequest(
            requestId = "1234",
            debug = Debug(
                mode = RequestDebugMode.STUB,
                stub = RequestDebugStub.SUCCESS,
            ),
            role = BaseIdRequestRole(id = "3")
        )

        val context = Context()
        context.fromTransport(req)
        val request = context.request

        assertEquals(Command.DELETE, context.command)
        assertEquals(Stub.SUCCESS, context.stubCase)
        assertEquals(AppMode.STUB, context.workMode)
        assertTrue(request is User)
        assertEquals("3", request.id.asString())
        assertEquals("", request.firstName)
        assertEquals("", request.middleName)
        assertEquals("", request.lastName)
        assertEquals("", request.email)
        assertEquals("", request.phoneNumber)
        assertEquals(0, request.accounts.size)
        assertEquals("", request.roleId.asString())
    }

    @Test
    fun `fromTransport for UserSearchRequest`() {
        val req = UserSearchRequest(
            requestId = "1234",
            debug = Debug(
                mode = RequestDebugMode.STUB,
                stub = RequestDebugStub.SUCCESS,
            ),
            userFilter = UserSearchFilter(
                firstName = "Tatyana",
                middleName = "Sergeevna",
                lastName = "Dolnikova",
                phoneNumber = "79133739945",
                roleId = "12"
            )
        )

        val context = Context()
        context.fromTransport(req)
        val request = context.filter

        assertEquals(Command.SEARCH, context.command)
        assertEquals(Stub.SUCCESS, context.stubCase)
        assertEquals(AppMode.STUB, context.workMode)
        assertTrue(request is UserFilter)
        assertEquals("Tatyana", request.firstName)
        assertEquals("Sergeevna", request.middleName)
        assertEquals("Dolnikova", request.lastName)
        assertEquals("79133739945", request.phoneNumber)
        assertEquals("12", request.roleId.asString())
    }

}
