package lectures.concurrent.akka

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.event.Logging
import akka.pattern.ask
import scala.concurrent.duration._


class MyActor extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case "test" =>
      log.info("received test")
      sender() ! "Done!"

    case _ =>
      log.info("received unknown message")
      context.become(newReceive)
  }

  def newReceive: Receive = {
    case _ =>
      log.info("OH SHI...")
  }

}


object AkkaExample extends App {
  val system = ActorSystem("mySystem")

  val myActor = system.actorOf(Props[MyActor], "myactor2")

  val f = myActor.ask("test")(1.minute)

  myActor ! "another test"
  myActor ! "another test"

  system.shutdown()
}
