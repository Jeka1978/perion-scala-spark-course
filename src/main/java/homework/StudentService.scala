package homework

/**
 * @author Evgeny Borisov
 */
trait StudentService {
  def checkName(student: Student):Boolean
  def checkMark(student: Student):Unit
}
