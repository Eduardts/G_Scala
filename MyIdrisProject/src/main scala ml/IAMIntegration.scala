import scala.concurrent.Future
import akka.actor.typed.ActorRef

case class AccessRequest(
  userId: String,
  resource: String,
  permission: String
)

class IAMIntegration(idrisIAM: IdrisIAMBridge) {
  def verifyAccess(request: AccessRequest): Future[Boolean] = {
    Future.successful(
      idrisIAM.verifyAccess(
        request.userId,
        request.resource,
        request.permission
      )
    )
  }
}
