import org.junit.Test
import ru.otus.otuskotlin.accounting.api.v1.jacksonMapper
import ru.otus.otuskotlin.accounting.v1.model.UserCreateObject
import ru.otus.otuskotlin.accounting.v1.model.UserCreateRequest
import kotlin.test.assertContains

class SerializationTest {

    @Test
    fun writeValueAsString() {
        val createRequest = UserCreateRequest(
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
        val jsonString = jacksonMapper.writeValueAsString(createRequest)
        println(jsonString)
        assertContains(jsonString, """"firstName":"Tatyana"""")
    }
}
