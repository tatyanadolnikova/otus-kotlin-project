package mapper

import model.*
import org.junit.Test
import utils.DATE_PATTERN
import java.time.LocalDate
import kotlin.test.assertEquals

class MapperToDTOTest {

    @Test
    fun `toTransport for User responses`() {
        val context = Context(
            requestId = RequestId("1234"),
            command = Command.CREATE,
            response = User(
                id = UserId("3"),
                firstName = "Tatyana",
                middleName = "Sergeevna",
                lastName = "Dolnikova",
                birthDate = LocalDate.parse("1996-07-30", DATE_PATTERN),
                email = "test@test.com",
                phoneNumber = "79133739945",
                accounts = listOf(AccountId("2"), AccountId("34")),
                roleId = RoleId("12")
            ),
            errors = mutableListOf(
                ResponseError(
                    code = "err",
                    group = "request",
                    field = "title",
                    message = "wrong title",
                )
            ),
            state = AppState.RUNNING,
        )

        val request = context.toTransportCreateUser()

        assertEquals("1234", request.requestId)
        assertEquals("3", request.user?.id)
        assertEquals("Tatyana", request.user?.firstName)
        assertEquals("Sergeevna", request.user?.middleName)
        assertEquals("Dolnikova", request.user?.lastName)
        assertEquals("1996-07-30", request.user?.birthDate)
        assertEquals("test@test.com", request.user?.email)
        assertEquals("79133739945", request.user?.phoneNumber)
        assertEquals(2, request.user?.accounts?.size)
        assertEquals("12", request.user?.roleId)
        assertEquals(1, request.errors?.size)
        assertEquals("err", request.errors?.firstOrNull()?.code)
        assertEquals("request", request.errors?.firstOrNull()?.group)
        assertEquals("title", request.errors?.firstOrNull()?.field)
        assertEquals("wrong title", request.errors?.firstOrNull()?.message)
    }

}
