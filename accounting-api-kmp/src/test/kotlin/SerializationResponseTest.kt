import ru.otus.otuskotlin.accounting.api.v1.apiV1ResponseDeserialize
import ru.otus.otuskotlin.accounting.api.v1.apiV1ResponseSerialize
import ru.otus.otuskotlin.accounting.v1.model.IResponse
import ru.otus.otuskotlin.accounting.v1.model.UserCreateResponse
import ru.otus.otuskotlin.accounting.v1.model.UserResponseObject
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SerializationResponseTest {
    private val createResponse = UserCreateResponse(
        user = UserResponseObject(
            firstName = "Tatyana",
            middleName = "Sergeevna",
            lastName = "Dolnikova",
            birthDate = "1996-30-07",
            email = "tatyanadolnikova@gmail.com",
            phoneNumber = "88009991234",
            accounts = listOf(),
            roleId = "1",
            id = "7"
        )
    )

    @Test
    fun serializeTest() {
        val jsonString = apiV1ResponseSerialize(createResponse)
        println(jsonString)
        assertContains(jsonString, """"phoneNumber":"88009991234"""")
        assertContains(jsonString, """"responseType":"create"""")

    }

    @Test
    fun deserializeTest() {
        val jsonString = apiV1ResponseSerialize(createResponse)
        val decoded = apiV1ResponseDeserialize<UserCreateResponse>(jsonString)
        println(decoded)
        assertEquals("88009991234", decoded.user?.phoneNumber)
        assertEquals("Dolnikova", decoded.user?.lastName)
    }

    @Test
    fun deserializeIResponseTest() {
        val jsonString = apiV1ResponseSerialize(createResponse)
        val decoded = apiV1ResponseDeserialize<IResponse>(jsonString) as UserCreateResponse
        println(decoded)
        assertEquals("88009991234", decoded.user?.phoneNumber)
        assertEquals("Dolnikova", decoded.user?.lastName)
    }
}
