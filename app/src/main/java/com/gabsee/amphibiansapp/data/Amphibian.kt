package com.gabsee.amphibiansapp.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Amphibian(
    val name: String,
    val type: AmphibianType,
    val description: String,

    @SerialName(value = "img_src")
    val imgSrc: String
)

enum class AmphibianType(val title: String) {
    Toad(title = "Toad"),
    Frog(title = "Frog"),
    Salamander(title = "Salamander")
}