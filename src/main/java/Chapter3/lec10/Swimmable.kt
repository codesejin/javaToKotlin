package Chapter3.lec10

interface Swimmable {
    // 프로퍼티 : 이 프로퍼티는 Swimmable의 필드가 있는게 아니라,
    // 사실은 val이니까 getter에 대한 걸 아래에서 구현해주는 것을 기대한다
    val swimAbility: Int

    fun act() {
        println(swimAbility)// 구현체에서 swimAbility를 구현해주지 않으면 에러가 난다
        println("어푸 어푸")
    }
}