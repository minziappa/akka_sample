package sample.hi;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class HiMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSystem system = ActorSystem.create("MySystem");
		ActorRef greeter = system.actorOf(Props.create(GreetingActor.class), "greeter");
		greeter.tell(new Greeting("Charlie Parker"), ActorRef.noSender());
	}

}