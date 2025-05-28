package kr.ac.kumoh.s20220499.mysql_robot

import org.springframework.stereotype.Service

@Service                        // 얘가 Service라고 밝혀줌! 얘가 없으면 bin 어쩌구 하면서 에러가 난다.
class RobotService(val repository: RobotRepository) {
    fun getAllRobots(): List<Robot> {
        return repository.findAll()                 // 우린 이런 함수 안만들어줬는데?
                                                    // 상속받은 JpaRepository에 이 함수가 있다.
    }
    // fun getAllRobots(): List<Robot> = repository.findAll() <- 이렇게 써도 된다.

    fun getRobotWithWeapons(): List<EquipmentDto> {
        return repository.findAllEquipment()
    }
}