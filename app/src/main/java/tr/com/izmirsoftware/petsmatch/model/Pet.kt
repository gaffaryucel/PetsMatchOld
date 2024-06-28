package tr.com.izmirsoftware.petsmatch.model

data class Pet(
    val id: String? = null, // Hayvanın benzersiz kimliği
    val genus: Genus? = null, // Hayvanın türü (kedi veya köpek)
    val name: String? = null, // Hayvanın ismi
    val gender: Gender? = null, // Hayvanın cinsiyeti
    val age: Int? = null, // Hayvanın yaşı
    val breed: String? = null, // Hayvanın ırkı
    val color: String? = null, // Hayvanın rengi
    val imagesUrl: List<String>? = null, // Hayvanın profil resmi URL'si
    val personality: String? = null, // Hayvanın kişilik tanımı
    val interests: List<String>? = null, // Hayvanın ilgi alanları
    val healthInfo: HealthInfo? = null, // Hayvanın sağlık bilgisi
    val location: Location? = null, // Hayvanın konumu
    val ownerId: String? = null // Hayvanın sahibinin kimliği
)

enum class Genus {
    CAT,
    DOG
}

enum class Gender {
    MALE,
    FEMALE
}



