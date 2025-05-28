package kr.ac.kumoh.s20220499.mysql_robot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController                                 // Rest API?
@RequestMapping("/api/robots")          // 이 위치 밑으로 출발하도록 만들거야
class RobotController(val service: RobotService) {      // 이게 있어야 service를 다룰 수 있다.
//    @GetMapping("/")                                      // "/"로 들어오면 아래를 실행해줘.
//    fun welcome(): String{                                // kotlin에서 함수만드는 법 : fun ~
//                                                          // type을 지정할 때(Return type)는 ":"을 붙여요
//                                                          // 상속받을 때는 ":"을 띄워요
//        return "Welcome to Robot Server"
    
    @GetMapping                                         // 아무것도 안적으면 default로 루트부터 시작
    fun getAllRobots(): ResponseEntity<List<Robot>> {       // 코드하고 값을 같이 넘겨주겠다
        val robots = service.getAllRobots()
        return ResponseEntity.ok(robots)
    }

    @GetMapping("/with-weapons")                // /api/robots/with-weapons
    fun getRobotsWithWeapons(): ResponseEntity<List<EquipmentDto>> {
        return ResponseEntity.ok(service.getRobotWithWeapons())
    }
    
//    // return을 하지 않고 그냥
//    // fun welcome() = "20220499" 이렇게 해도 됨
//    @GetMapping("/abc")
//    fun welcomee() = "20220499"
}