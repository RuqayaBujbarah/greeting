fun main(){
    val message = "Hello user, welcome to my program!"
    print("Please enter your name:  ")
    val userName = readLine()
    println(message.replace("user", userName!!))
}