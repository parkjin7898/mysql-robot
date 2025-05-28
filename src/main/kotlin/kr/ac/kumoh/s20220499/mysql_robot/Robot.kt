package kr.ac.kumoh.s20220499.mysql_robot

import jakarta.persistence.*

@Entity                         // 클래스만 만들면 되는 것이 아니라 객체를 만들어야해
@Table(name = "Mechanic")       // Relational DB에서 만들어 놓은 Table과 Mapping해주기
                                // DBMS에서랑 Kotlin에서랑 이름이 달라서
data class Robot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // 우리가 MySQL에서 AutoIncrement 하듯이
    // id라는 변수는 ID로 쓸거고 생성을 하라는 얘기구나! ?? 뭔소리야 이게
    var id: Int,
    var name: String,
    var model: String,
    var manufacturer: String,
    @Column(name = "class")
    var robotClass: String,
    // 원래는 var class: String으로 쓰고 싶었는데 robotClass로 만들기. (class는 키워드라서)
    // 근데 이렇게 만들면 RDB에서는 class고 여기서는 robotClass니까 연결이 안되잖아
    // 그래서 @Column을 만들어서 name = "class"로 원래 이거라고 지정해주는 느낌

    // 또한 DB에서는 snake case로 쓴걸 코틀린에서 Camel case로 써도 그냥 적용된다. => line.42

)

@Entity
data class Weapon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val type: String,
    val damage: Int,
    val ability: String,
)

@Entity
data class Equipment(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    var mechanicId: Int,        // DBMS에서 mechanic_Id처럼 Snake case로 쓴건 mechanicId처럼 Camel case로 쓰면 된다.
    var weaponId: Int,
    val location: String,
    val quantity: Int
)