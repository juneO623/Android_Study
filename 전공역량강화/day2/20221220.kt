/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
	// 클래스 정의

    //생성자
    var simpleClass = SimpleClass()	// SimpleClass 생성
    simpleClass.age = 1	// "."을 통해서 객체 내부로 접근
    var count = simpleClass.age
    println(simpleClass.name)
    //생성자
    var simpleClass1 = SimpleClass()
    simpleClass1.age = 2
    println(simpleClass.age)
    println(simpleClass1.age)
        
    //생성자
    var someVehicle = Vehicle(10)
    println(someVehicle.speed)
    

    var someVehicle2 = Vehicle2(11)
    println(someVehicle2.speed)
    
    // 상속
    var vehicle00 = Vehicle0(10)
    println(vehicle00.speed)
    vehicle00.speedUp()
    var car = Car(4, 2, 0)
    car.speedUp()	// 부모클래스의 메소드 실행
    println(car.speed)
    
    
    
    // 클래스 상속 실습
    var truck = Truck(1, 4, 4, 0)
    truck.load()
    
    
}

// 클래스 상속 실습
	class Truck (var loadage: Int, wheels: Int, seats: Int, speed: Int): Car(wheels, seats, speed){
        
        fun load(){
            println("load")
        }
        fun unLoad(){
            println("unLoad")
        }
    }

// 클래스 정의 - 함수 선언
    open class Vehicle0 (var speed: Int){
        /*init{
            this.speed = speed
        }*/
        open fun speedUp(){
            this.speed += 10
        }
        open fun speedDown() {
            this.speed -= 10
        }
    }
    
    // 상속의 구현
    open class Car (var wheels: Int, var seats: Int, speed: Int): Vehicle0(speed) {	// 상속받을 클래스 명
        /*init{
            this.wheels = wheels
            this.seats = seats
        }*/
    }
    
    //생성자
    class Vehicle(speed: Int){
        var speed: Int
        init{
            this.speed = speed
        }
    }
    //생성자
    class SimpleClass {
        var name = "SimpleClass"	// 문자형 프로퍼티
        var age = 0
    }
    //생성자
    class Vehicle2(var speed: Int) { // var or val 이 붙으면 자동 생성
        init{
            this.speed = speed
        }
    }