package tr.com.izmirsoftware.petsmatch.model

data class Owner(
    val id: String? = null, // Hayvan sahibinin benzersiz kimliği
    val firstName: String? = null, // Hayvan sahibinin adı
    val lastName: String? = null, // Hayvan sahibinin soyadı
    val phone: String? = null, // Hayvan sahibinin telefonu
    val email: String? = null, // Hayvan sahibinin e-posta adresi
    val profileImage: String? = null, // Hayvan sahibinin profil resmi
    val comments: List<Comments>? = null // Hayvan sahibi için yapılan yorumlar ve Puanlar
)

data class Comments(
    val comment: String? = null, // Hayvan sahibi için yapılan yorum
    val rating: Double? = null, // Hayvan sahibi için verilen puan
)