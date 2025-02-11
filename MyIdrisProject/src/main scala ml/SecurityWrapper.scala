import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import scala.concurrent.Future

case class SecureMessage[T](
  data: Array[Byte],
  signature: Array[Byte],
  metadata: Map[String, String]
)

trait SecurityProtocol {
  def verifyMessage[T](message: SecureMessage[T]): Boolean
  def encryptData[T](data: T): Array[Byte]
  def decryptData[T](data: Array[Byte]): Option[T]
}

