package furhatos.app.footballagent

import furhatos.app.footballagent.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class FootballagentSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
