package furhatos.app.footballagent.flow.main

import furhatos.app.footballagent.flow.Parent
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state

val Interaction = state(Parent) {
    onEntry {
        furhat.ask("Hi, how can I help you?")
    }
    onResponse<GetInfo> {  }
}