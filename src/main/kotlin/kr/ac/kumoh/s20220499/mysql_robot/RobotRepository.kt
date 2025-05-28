package kr.ac.kumoh.s20220499.mysql_robot

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository                           // 얘가 Repository라는 걸 밝혀주기
interface RobotRepository : JpaRepository<Robot, Int> {
}