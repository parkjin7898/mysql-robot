package kr.ac.kumoh.s20220499.mysql_robot

data class EquipmentDto (
    val robotName: String,
    val model: String?,
    val robotClass: String?,
    val location: String?,
    val quantity: Int?,
    val weaponName: String?,
    val weaponType: String?,
    val damage: Int?,
    val ability: String?
)