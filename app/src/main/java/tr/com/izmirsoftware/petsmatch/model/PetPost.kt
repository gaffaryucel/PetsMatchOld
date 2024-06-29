package tr.com.izmirsoftware.petsmatch.model

import java.sql.Date

data class PetPost(
    val id: String? = null, // İlanın benzersiz kimliği
    val title: String? = null, // İlanın başlığı
    val description: String? = null, // İlanın açıklaması
    val date: Date? = null, // İlanın tarihi
    val location: Location? = null, // Hayvanın konumu
)

data class Location(
    val city: String? = null,
    val district: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
)