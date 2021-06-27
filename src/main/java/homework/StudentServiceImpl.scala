package homework

/**
 * @author Evgeny Borisov
 */
class StudentServiceImpl extends StudentService {
  override def checkName(student: Student): Boolean = {
    student.name.length > 10
  }


  override def checkMark(student: Student): Unit = {
    if (student.mark > 80) {
      println("good mark")
    } else {
      println("not good mark")
    }

  }
}
