/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
	val num1:Int = 5
    val num2 = 3
    
    println(-num1)
    println(num1+num2)
    println(num1-num2)
    println(num1*num2)
    println(num1/num2)
    println(num1%num2)
    
    var num3 = 3
    
    num3 += 5; println(num3)
    num3 -= 5; println(num3)
    num3 *= 5; println(num3)
    num3 /= 5; println(num3)
    num3 %= 5; println(num3)
    
    
    
    val adult:Int = 19
    val age1:Int = 15
    val gender = "male"
    
    if (age1 < adult){
        println("당신은 미성년자네요")
    } else {
        println("당신은 성인이네요")
    }
    
    if  (age1 < adult){
        if (gender == "male"){
            println("당신은 미성년 남성이네요")
        } else {
            println("당신은 미성년 여성이네요")
        }
    }
    
    
    
//     val browser = "Safari"
//     var browserName = ""
    
//     if (browser == "IE"){
//         browserName = "인터넷 익스플로러"
//     } else if (browser == "FF"){
//         broswerName = "파이어 폭스"
//     } else if (browser == "Chrome"){
//         browserName = "크롬"
//     } else {
//         browserName = "알려지지 않은 브라우저"
//     }
    
//     println("브라우저명은 $browserName")
//     
//     
//     


	val browser = "Safari"
    val browserName = if (browser == "IE"){
        "인터넷 익스플로러"
    } else if (browser == "FF"){
        "파이어 폭스"
    } else if (browser == "Chrome"){
        "크롬"
    } else {
        "알려지지 않은 브라우저"
    }
    
    println("브라우저명은 $browserName")
    
    
    
    val browser1 = "Chrome"
    var browserName1 = ""
    
    when (browser){
        "IE" -> browserName1 = "인터넷 익스플로러"
        "FF" -> browserName1 = "파이어 폭스"
        "Chrome" -> browserName1 = "크롬"
        "Opera" -> browserName1 = "오페라"
        "Safari" -> browserName1 = "사파리"
        else -> browserName1 = "알려지지 않은 브라우저"
    }
    println("브라우저명은 $browserName1")

	// when문도 if문처럼 val에 바로 대입 가능

    
    
    for (i in 1..5){
        println("2 x $i = ${i*2}")
    }
    println("========================")
    for (i in 1 until 10){	// 10은 미포함
        println("2 x $i ${i*2}")
    }
    println("========================")
    for (i in 1..10 step 2){
        println("2 x $i = ${i*2}")
    }
    println("========================")
    for (i in 10 downTo 1){
        println("2 x $i = ${i*2}")
    }
    
    
    
    
    
    var age:Int = 0
    while (age < 5){
        println("${age}살입니다.")
        age++
    }
    
    var num = 0
    do {
        num++
        println("$num")
    }while(num<5)
    
    
    
    // 구구단
    // 이중 for루프 사용
    for (i in 1..10){
        for (j in 1..10){
        	println("$i x $j = ${i*j}")
		}
        println()
    }

    
    
    // arrayOf
    var array1 = arrayOf(1,2,3,4,5)
    val array2: Array<Int> = arrayOf(1, 2, 3)
    
    // 생성자를 이용하는 방법
    val array3: IntArray = IntArray(3, {i -> i})
    val array4: Array<String> = Array(3){i -> i.toString()}
    
    array1[0] = 20
    array2.set(2, 20)
    println(array1[0])
    println(array1.size)
    println(array1.get(0))
    
    
    
    
    
    var bts = arrayOf<String>("진", "슈가", "제이홉", "RM", "지민", "뷔", "정국")
    
    for (name in bts){
        println("hello, $name");
    }
    
    
    
    
    for (row in 0..5){
        if (row == 2){
            break
        }
        println("$row was excuted!")
    }
    
    for (row in 0..5){
        if (row == 2){
            continue
        }
        println("$row was excuted!")
    }
    
    
    
    
    loop@ for (i in 1..10){
        for (j in 1..10){
            if (i == 2 && j == 2) continue@loop
            println("i: $i j: $j")
        }
    }
    
    
    
    
    
    // for루프, continue, %연산자 사용해서 0~10 사이의 홀수 출력
    for (i in 0..10){
        if (i % 2 == 0){
            continue
        }
        println("$i")
    }
    
    
    
    
    fun sayHello(): Unit {	// 함수정의 	(Unit = void)
        println("Hello Function!")
    }
    sayHello()
    
    fun multiplication(){	// 반환형이 Unit일 때 생략가능
        for (i in 2..9){
            for (j in 1..9){
                println("$i x $j = ${i*j}")
            }
        }
    }
    multiplication()
    
    
    
    fun sayHello2(name: String): Unit{
        println("Hello $name")
    }
    sayHello2("우영우")
    
    fun multiplication2(dan: Int){
        for (j in 1..9){
            println("$dan x $j = ${dan * j}")
        }
    }
    multiplication2(3)
    
    
    
    
    
    fun sayHello3(): String {
        return "Hello Function"
    }
    var returnValue = sayHello3()
    println(returnValue)
    println(sayHello3())
    
    fun threeTimes(): Int {
        return 3
    }
    var result = threeTimes()
    println(result)
    
    
    
    
    
    
    
    fun sayHello4(name: String): String{
        return "Hello $name"
    }
    var returnValue4 = sayHello4("RM")
    println(returnValue4)
    println(sayHello4("정국"))
    
    fun threeTimes4(num: Int): Int{
        return num * 3
    }
    var result4 = threeTimes4(3)
    println(result4)
    
    
    
    
    
    
    // 매개변수 기본값을 설정해놓으면 매개변수가 없을 때 기본값을 사용
    fun sayHello5(name: String = "슈가"){
        println("Hello $name")
    }
    sayHello5("지민")
    sayHello5()
    
    fun hello5(name: String, age:Int=17, nickName:String="슈가"){
        println("$name, $age, $nickName")
    }
    hello5("슈가")
    hello5("동그라미", 19)
    
    
    
    
    
    
//     import java.util.*
    
//     var sc = Scanner(System.in)
    
//     print("사칙연산하고 싶은 두 정수를 입력해주세요. ")
//     var n1 = sc.nextInt()
//     var n2 = sc.nextInt()
    
//     println("$n1 + $n2 = ${n1+n2}")
    
    // 실습1
    fun calculator(num1: Int, num2: Int, numOperator: String): Int{
        val result = when (numOperator){
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> return -1
        }
        return result
    }
    
    println(calculator(5, 2, "*"))
    
    
    // 실습2
    fun evaluation(score: Int): String{
//         val grade = if (score<100 && score>=90){
//             "A"
//         } else if (score<90 && score>=80){
//             "B"
//         } else if (score<80 && score>=70){
//             "C"
//         } else if (score<70 && score>=60){
//             "D"
//         } else {
// 			"E"   
//         }
		val grade = when (score){
            in(90..100) -> "A"
            in(80..89) -> "B"
            in(70..79) -> "C"
            in(60..69) -> "D"
            else -> "E"
        }
        return grade
    }
    println(evaluation(95))
    
    
    
    
    
    
    // 함수의 형 
    fun hello1() {
        println("Hello World")
    }
    
    val func1:()->Unit = ::hello1
   	func1()
    
    val func11 = ::hello1
    func11()
    
    
    fun hello2(name: String){
        println("Hello $name")
    }
    
    val func2:(String)->Unit = ::hello2
    func2("우영우")
    
    val func22 = ::hello2
    func22("기준")
    
    
    // 함수 매개변수
    fun hello(name: String) {
        println("Hello $name")
    }
    
    fun sayHello(name: String, func:(String)->Unit){
        func(name)
    }

    sayHello("메시", ::hello)
    
    
    
    
    // 함수형 반환값
    fun hello0(name: String){
        println("Hello $name")
    }
    
    fun caller():(String)->Unit{
        return ::hello0
    }
    
    val hello8 = caller()
//     val hello8 = ::hello0

    hello8("기준기준")
    
    
    
    // lambda 함수 - 익명함수 한 번만 쓰는 함수를 람다로 바꿔서 씀
    fun sum(num1: Int, num2: Int): Int{
        return num1 + num2
    }
    
//     println({num1: Int, num2: Int -> num1 + num2}(1, 3))
    val sum1 = {num1: Int, num2: Int -> num1 + num2}
    println(sum1(1, 3))
    
    
    // 마지막 매개변수가 함수일 때
//     val result = isBig(8){number: Int -> number > 7}
    // 이렇게 표기 가능, 타입도 생략 가능
    
    
    
    
    
    // 고차함수
    fun isBig(num: Int, function: (Int)->Boolean): Boolean{
        return function(num)
    }
    
    fun comfun(number: Int): Boolean{
        return number > 7
    }
    
    var result11 = isBig(5, ::comfun)
    var result22 = isBig(5, {n: Int -> n > 7})
    var result33 = isBig(5) {n: Int -> n > 7}
    
    fun hello11f():Unit{
        println("Hello lambda f")
    }
    
    val hello11 = { println("Hello lambda") }
//     hello11()
    println(hello11())
    
    
    
    
    // Nullable
//     val name: String = "우영우"
//     val name1: String = null	// 기본데이터 형에는 null이 들어갈 수 없어서 에러발생
//     if (name != null){
//         println(name.length)
//     }
    // name1이 null이 아니면 동작
    
    var name2: String? = null
    println(name2?.length)
    
    println(name2 ?: "기본값")
    println(name2?.length)	// null의 길이는 null, null 출력
    println(name2?.length ?: 0)	// 엘비스 연산자, null일 때 0출력
    
    name2 = "음바페"
    println(name2?.length)	// 3
    
    
    
    
    
    
}