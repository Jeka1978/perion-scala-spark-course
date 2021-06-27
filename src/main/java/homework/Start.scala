package homework

/**
 * @author Evgeny Borisov
 */
object Start {
  def main(args: Array[String]): Unit = {
    val studentService = new StudentServiceImpl()

    val john = Student(1, "John", 76)
    val jack = Student(1, "Fistadantilusasdas", 86)

    studentService.checkMark(john)
    println(studentService.checkName(jack))
  }
}
