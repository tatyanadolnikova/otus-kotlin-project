import ru.otus.otuskotlin.accounting.api.v1.apiV1RequestDeserialize
import ru.otus.otuskotlin.accounting.api.v1.apiV1RequestSerialize
import ru.otus.otuskotlin.accounting.v1.model.IRequest
import ru.otus.otuskotlin.accounting.v1.model.UserCreateObject
import ru.otus.otuskotlin.accounting.v1.model.UserCreateRequest
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SerializationRequestTest {
    private val createRequest = UserCreateRequest(
        user = UserCreateObject(
            firstName = "Tatyana",
            middleName = "Sergeevna",
            lastName = "Dolnikova",
            birthDate = "1996-30-07",
            email = "tatyanadolnikova@gmail.com",
            phoneNumber = "88009991234",
            accounts = listOf(),
            roleId = "1"
        )
    )

    @Test
    fun serializeTest() {
        val jsonString = apiV1RequestSerialize(createRequest)
        println(jsonString)
        assertContains(jsonString, """"firstName":"Tatyana"""")
        assertContains(jsonString, """"requestType":"createUser"""")

    }

    @Test
    fun deserializeTest() {
        val jsonString = apiV1RequestSerialize(createRequest)
        val decoded = apiV1RequestDeserialize<UserCreateRequest>(jsonString)
        println(decoded)
        assertEquals("Tatyana", decoded.user?.firstName)
        assertEquals("tatyanadolnikova@gmail.com", decoded.user?.email)
    }

    @Test
    fun deserializeIRequestTest() {
        val jsonString = apiV1RequestSerialize(createRequest)
        val decoded = apiV1RequestDeserialize<IRequest>(jsonString) as UserCreateRequest
        println(decoded)
        assertEquals("Tatyana", decoded.user?.firstName)
        assertEquals("tatyanadolnikova@gmail.com", decoded.user?.email)
    }
}
