package basic.comparison

data class Email(val name: String, val email: String)
data class Contacts(val company: String, val email: List<Email>);

fun main(args: Array<String>) {

    val contacts = Contacts("Company1", listOf(Email("Name1", "Email1"), Email("Name2", "Email2")))

    val copyContacts = contacts.copy(company = "Company2")

    copyContacts.email.forEach {
        println(it)
    }




}