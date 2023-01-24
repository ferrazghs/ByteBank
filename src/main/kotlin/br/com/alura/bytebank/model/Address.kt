package br.com.alura.bytebank.model

class Address(
    var address: String = "",
    var number: Int = 0,
    var district: String = "",
    var city: String = "",
    var state: String = "",
    var zipCode: String = ""
) {
    override fun toString(): String {
        return """
        Address(address='$address',
         number=$number, 
         district='$district', 
         city='$city',
         state='$state', 
         zipCode='$zipCode')"     
        """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (address != other.address) return false
        if (number != other.number) return false
        if (district != other.district) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (zipCode != other.zipCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = address.hashCode()
        result = 31 * result + number
        result = 31 * result + district.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + zipCode.hashCode()
        return result
    }

}
