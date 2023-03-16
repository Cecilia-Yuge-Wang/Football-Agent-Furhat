package furhatos.app.footballagent.flow.main

import furhatos.app.footballagent.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

val end : State = state(Parent){

    onEntry{
        random(
            {   furhat.say("Bye") },
            {   furhat.say("Goodbye") },
            {   furhat.say("Talk to you next time.") }
        )

    }
}