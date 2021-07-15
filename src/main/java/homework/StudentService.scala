package homework

/**
 * @author Evgeny Borisov
 */
trait StudentService extends Serializable {
  def checkName(student: Student):Boolean
  def checkMark(student: Student):Unit
}
