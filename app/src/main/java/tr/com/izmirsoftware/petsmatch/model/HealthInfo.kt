package tr.com.izmirsoftware.petsmatch.model

data class HealthInfo(
    val vaccinations: List<String>? = null,
    val allergies: List<String>? = null,
)
