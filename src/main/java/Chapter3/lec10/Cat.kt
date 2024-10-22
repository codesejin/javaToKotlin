package Chapter3.lec10
// 타입을 쓸때도 콜론(:) 상속을 쓸때도 콜론(:)
// 차이점은 상속에 쓸때는 한칸 띄우고 콜론쓰기
class Cat(
    species: String
) : Animal(species, 4){

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}